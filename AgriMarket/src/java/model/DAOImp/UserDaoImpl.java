/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAOImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DAO.UserDao;
import model.pojo.Order;
import model.pojo.Product;
import model.pojo.User;
import util.JdbcConnection;

/**
 *
 * @author AgriMarket team
 */
public class UserDaoImpl implements UserDao {

    Connection con;

    public UserDaoImpl() {
        try {
            con = JdbcConnection.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public List<User> getAllUsers() {
        List<User> allUser = new ArrayList();
        try {
            Statement statment = con.createStatement();
            ResultSet result = statment.executeQuery("select * from user");
            while (result.next()) {
                User user = new User();
                user.setUserName(result.getString("user_name"));
                user.setDOB(result.getDate("DOB").toLocalDate());
                user.setCreditNumber(result.getString("credit_number"));
                user.setEmail(result.getString("email"));
                user.setImage(result.getBytes("image"));
                user.setInterests(getAllInterests(result.getString("email")));
                user.setJob(result.getString("job"));
                user.setPassword(result.getString("password"));
                OrderDaoImp orders = new OrderDaoImp();
                user.setOrders(orders.getAllOrders(result.getString("email")));
                allUser.add(user);
            }
            return allUser;
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<User> getAllUsersLazy() {
        ArrayList<User> allUser = new ArrayList();
        try {
            Statement statment = con.createStatement();
            ResultSet result = statment.executeQuery("select * from user");
            while (result.next()) {
                User user = new User();
                user.setUserName(result.getString("user_name"));
                user.setDOB(result.getDate("DOB").toLocalDate());
                user.setCreditNumber(result.getString("credit_number"));
                user.setEmail(result.getString("email"));
                user.setImage(result.getBytes("image"));
                allUser.add(user);
            }
            return allUser;
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<String> getAllInterests(String userEmail) {
        ArrayList<String> userInterests = new ArrayList();
        try {

            Statement interestsStatements = con.createStatement();
            ResultSet interestsResult = interestsStatements.executeQuery("select * from interests where email='" + userEmail + "';");
            while (interestsResult.next()) {
                userInterests.add(interestsResult.getString("name"));
            }
            return userInterests;
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param email user email
     * @param password user Password
     * @return user function for retrieve user
     */
    @Override
    public User signIn(String email, String password) {
        Connection connection;
        User user = null;
        ResultSet res = null;

        try {
            connection = JdbcConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement("select * from user where email =? and password = ?");
            pst.setString(1, email);
            pst.setString(2, password);
            res = pst.executeQuery();
            if (res.next()) {
                user = new User();
                user.setEmail(res.getString("email"));
                user.setUserName(res.getString("user_name"));
                user.setPassword(res.getString("password"));
                user.setJob(res.getString("job"));
                user.setAddress(res.getString("address"));
                user.setImage(res.getBytes("image"));
                user.setDOB(res.getDate("DOB").toLocalDate());
                user.setCreditNumber(res.getString("credit_number"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;

    }

    @Override
    public void updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean signUp(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUser(String email) {

        try {
            Statement statment = con.createStatement();
            ResultSet result = statment.executeQuery("select * from user where email='" + email + "';");
            result.next();
            User user = new User();
            user.setUserName(result.getString("user_name"));
            user.setDOB(result.getDate("DOB").toLocalDate());
            user.setCreditNumber(result.getString("credit_number"));
            user.setEmail(result.getString("email"));
           // user.setImage(result.getBytes("image"));
            user.setAddress(result.getString("address"));
            user.setInterests(getAllInterests(result.getString("email")));
            user.setJob(result.getString("job"));
            user.setPassword(result.getString("password"));
            OrderDaoImp orders = new OrderDaoImp();
            user.setOrders(orders.getAllOrders(result.getString("email")));
            return user;
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public static void main(String[] args) {
        UserDaoImpl user = new UserDaoImpl();
        /* List<User> userList = user.getAllUsersLazy();
         System.out.println(userList.size());*/
        List<User> userList = user.getAllUsers();
        for (int i = 0; i < userList.size(); i++) {
            User user1 = (User) userList.get(i);
            System.out.println("user name : " + user1.getUserName());
            System.out.println("\t\t interests : ");
            List<String> interest = user1.getInterests();
            for (int j = 0; j < interest.size(); j++) {
                System.out.print("\t\t\t\t" + interest.get(j));
            }
            System.out.println();
            List<Order> orders = user1.getOrders();
            System.out.println("numbers of order for " + user1.getUserName() + " : " + user1.getOrders().size());
            for (int s = 0; s < orders.size(); s++) {
                System.out.println("\t\t order : " + orders.get(s).getId() + " status :" + orders.get(s).getStatus()+" total :"+orders.get(s).getTotal());
        
                List<Product> products = orders.get(s).getProducts();
                for (int j = 0; j < products.size(); j++) {
                    System.out.println("\t\t\t\t" + products.get(j).getName() + " quantity: " + products.get(j).getQuantity()+" price :"+products.get(j).getPrice());
                }
            }

        }
    }

}
