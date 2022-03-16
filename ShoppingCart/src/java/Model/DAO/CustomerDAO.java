/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Entities.Customer;
import Model.Entities.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author minhtintang
 */
public class CustomerDAO {
    
    private Connection connection;
    private DBConnection dbConnection;
    private ResultSet rs;
    private ArrayList<Customer> customers;
    
    public CustomerDAO() {
        dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
        customers = new ArrayList<>();
        load();
    }
    
    public ArrayList<Customer> getAll() {
        return customers;
    }
    
    public void load() {
        try {
            String sql = "SELECT * FROM customers";
            PreparedStatement pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            customers.clear();
            while (rs.next()) {
                customers.add(new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Customer login(String username, String password) {
        try {
            String sql = "SELECT * FROM customers WHERE user_name=? AND password=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                return new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11)
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public Customer register(Customer c) {
        try {
            String sql = "INSERT INTO customers (first_name, last_name, phone, email, street, city, state, zip_code, user_name, password, customer_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, c.getFirstName());
            pst.setString(2, c.getLastName());
            pst.setString(3, c.getPhone());
            pst.setString(4, c.getEmail());
            pst.setString(5, c.getStreet());
            pst.setString(6, c.getCity());
            pst.setString(7, c.getState());
            pst.setString(8, c.getZipCode());
            pst.setString(9, c.getUserName());
            pst.setString(10, c.getPassword());
            pst.setInt(11, customers.size() + 1);
            pst.execute();
            load();
            c.setCustomerId(customers.size() + 1);
            return c;
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
