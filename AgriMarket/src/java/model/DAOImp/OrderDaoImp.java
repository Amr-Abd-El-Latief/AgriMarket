/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.DAOImp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DAO.OrderDao;
import model.pojo.Order;
import model.pojo.Product;
import util.JdbcConnection;

/**
 *
 * @author muhammad
 */
public class OrderDaoImp implements OrderDao {

    Connection con;

    public OrderDaoImp() {
        try {
            con = JdbcConnection.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Order> getAllOrders(String userEmail) {
        ArrayList<Order> userOrders = new ArrayList();
        try {
            Statement ordersStatements = con.createStatement();
            ResultSet ordersResult = ordersStatements.executeQuery("select distinct order_id from agri_project.order_product where user_email='" + userEmail + "';");

            while (ordersResult.next()) {
                double total = 0;
                Order order = getOrder(ordersResult.getInt("order_id"));
                ProductDaoImp product = new ProductDaoImp();
                ArrayList<Product> products = product.getAllProducts(userEmail, ordersResult.getInt("order_id"));
                for (Product p : products) {
                    total += p.getQuantity() * p.getPrice();
                }
                order.setProducts(products);
                order.setTotal(total);
                userOrders.add(order);
            }
            return userOrders;
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order getOrder(int orderId) {
        try {
            Statement orderStatement = con.createStatement();
            ResultSet orderResult = orderStatement.executeQuery("select * from agri_project.order where id=" + orderId + ";");
            orderResult.next();
            Order order = new Order();
            order.setId(orderId);
            order.setStatus(orderResult.getString("status"));
            order.setDate(orderResult.getDate("date").toLocalDate());
            return order;
        } catch (SQLException ex) {
            Logger.getLogger(OrderDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    @Override
    public boolean addOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
