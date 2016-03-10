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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DAO.UserDao;
import model.pojo.Order;
import model.pojo.User;
import util.JdbcConnection;

/**
 *
 * @author muhammad
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
                user.setBOD(result.getDate("DOB").toLocalDate());
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

    public ArrayList<String> getAllInterests(String userEmail) {
        ArrayList<String> userInterests = new ArrayList();
        try {

            Statement interestsStatements = con.createStatement();
            ResultSet interestsResult = interestsStatements.executeQuery("select * from interests where email=" + userEmail);
            while (interestsResult.next()) {
                userInterests.add(interestsResult.getString("name"));
            }
            return userInterests;
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public User signIn(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean signUp(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
