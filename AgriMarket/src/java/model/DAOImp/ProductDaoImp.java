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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DAO.ProductDao;
import model.pojo.Order;
import model.pojo.Product;
import util.JdbcConnection;

/**
 *
 * @author muhammad
 */
public class ProductDaoImp implements ProductDao {

    Connection con;

    public ProductDaoImp() {
        try {
            this.con = JdbcConnection.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Product> getAllProducts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Product> getAllProducts(String userEmail, int order_id) {

        ArrayList<Product> userProducts = new ArrayList();
        try {
            Statement productsStatement = con.createStatement();
            ResultSet productsResult = productsStatement.executeQuery("select * from agri_project.order_product where user_email='" + userEmail + "'and order_id=" + order_id+";");
            while (productsResult.next()) {
                Product product = getProduct(productsResult.getString("product_id"));
                product.setQuantity(productsResult.getInt("quantity"));
                userProducts.add(product);
            }
            return userProducts;
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override

    public boolean addProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Product> searchProduct(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProduct(String name) {
        try {
            Statement productStatement = con.createStatement();
            ResultSet productResult = productStatement.executeQuery("select * from agri_project.product where name='" + name+"';");
            productResult.next();
            Product product = new Product();
            product.setCategoryId(productResult.getInt("category_id"));
            product.setPrice(productResult.getFloat("price"));
            product.setImage(productResult.getBytes("image"));
            product.setName(name);
            return product;
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
