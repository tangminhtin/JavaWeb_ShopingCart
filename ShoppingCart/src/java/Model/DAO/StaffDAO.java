/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Entities.Product;
import Model.Entities.Staff;
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
public class StaffDAO {

    private Connection connection;
    private DBConnection dbConnection;
    private ResultSet rs;
    private ArrayList<Staff> staffs;

    public StaffDAO() {
        dbConnection = new DBConnection();
        connection = dbConnection.getConnection();
        staffs = new ArrayList<>();
        load();
    }

    public ArrayList<Staff> getAll() {
        return staffs;
    }

    public void load() {
        try {
            String sql = "SELECT * FROM staffs";
            PreparedStatement pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();
            staffs.clear();
            while (rs.next()) {
                staffs.add(new Staff(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getBoolean(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10)
                ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Staff login(String username, String password) {
        try {
            String sql = "SELECT * FROM staffs WHERE username=? AND password=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();

            while (rs.next()) {
                return new Staff(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getBoolean(6),
                        rs.getInt(7),
                        rs.getInt(8),
                        rs.getString(9),
                        rs.getString(10)
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
