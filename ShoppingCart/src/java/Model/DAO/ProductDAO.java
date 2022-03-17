package Model.DAO;

import Model.Entities.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDAO {

    private Connection connection;
    DBConnection dbConnection;
    ResultSet rs;
    ArrayList<Product> products;

    public ProductDAO() {
        dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
        products = new ArrayList<>();
        load();
    }

    public ArrayList<Product> getAll() {
        return products;
    }

    public void load() {
        try {
            String sql = "SELECT * FROM products";
            PreparedStatement pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            products.clear();
            while (rs.next()) {
                products.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<String> getCategories() {
        ArrayList<String> categories = new ArrayList<>();
        try {
            String sql = "SELECT DISTINCT category_name FROM products";
            PreparedStatement pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            categories.clear();
            while (rs.next()) {
                categories.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }

    public ArrayList<Product> getProductByCategoryName(String categoryName) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            String sql = "SELECT * FROM products WHERE category_name=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, categoryName);
            rs = pst.executeQuery();
            products.clear();
            while (rs.next()) {
                products.add(new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public Product getProductById(int id) {
        try {
            String sql = "SELECT * FROM products WHERE product_id=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while (rs.next()) {
                return new Product(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6)
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
