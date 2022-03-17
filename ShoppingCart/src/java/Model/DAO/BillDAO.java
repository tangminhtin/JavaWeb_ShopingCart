/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Entities.Bill;
import Model.Entities.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BillDAO {

    private Connection connection;
    DBConnection dbConnection;
    ResultSet rs;
    ArrayList<Bill> bills;

    public BillDAO() {
        dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
        bills = new ArrayList<>();
    }

    public ArrayList<Bill> getBills() {
        try {
            String sql = "select DISTINCT  orders.order_id, customers.first_name, orders.order_date, order_items.list_price, orders.order_status \n"
                    + "FROM orders\n"
                    + "INNER JOIN customers ON orders.customer_id = customers.customer_id\n"
                    + "INNER JOIN order_items ON orders.order_id = order_items.order_id\n"
                    + "WHERE orders.customer_id = customers.customer_id AND orders.order_id = order_items.order_id";
            PreparedStatement pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            bills.clear();
            while (rs.next()) {
                bills.add(new Bill(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDate(3),
                        rs.getDouble(4),
                        rs.getBoolean(5)
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bills;
    }

}
