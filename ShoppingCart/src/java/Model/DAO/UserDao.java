package Model.DAO;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class UserDao {

    private String userName;
    private String passWord;
    public UserDao(){
        
    }
    public UserDao(String username, String password) {
        this.userName = username;
        this.passWord = password;
    }

    private String md5(String passwordToHash) {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(passwordToHash.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;

    }

    public boolean isValid() {
        Connection conn = null;
        CallableStatement callableStatement = null;
        Boolean loginState = false;
        String DB_NAME = "SE1605";
        String DB_PORT = "1433";
        String DB_USERNAME = "root";
        String DB_PASSWORD = "root";
        try {
            DBConnection db = new DBConnection(DB_NAME, DB_PORT, DB_USERNAME, DB_PASSWORD);
            conn = db.getConnection();
            callableStatement = conn.prepareCall("{call CheckLogin(?, ?)}");
            callableStatement.setString(1, this.userName);
//            callableStatement.setString(2, md5(this.passWord));
            callableStatement.setString(2, this.passWord);
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                loginState = true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            if (callableStatement != null) {
                try {
                    callableStatement.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        return loginState;
    }
    
    public static void main(String[] args) {
        UserDao dao = new UserDao();
        System.out.println(dao.isValid());
    }

}
//
//
//import Model.DAO.User;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class UserDao extends DBConnection {
//    public User bean = new User();
//    public Connection con;
//    public boolean b = false;
//
//    public UserDao() {
//        DBConnection db = new DBConnection();
//        this.con = db.getConnect();
//    }
//
//    private boolean search(String userName) {
//
//        try {
//            PreparedStatement pst = con.prepareStatement("SELECT * FROM `users` WHERE `uEmail` = ? ");
//            pst.setString(1, userName);
//            ResultSet rs = pst.executeQuery();
//            if (rs.next()) {
//                b = true;
//            } else {
//                b = false;
//            }
//            closeConnection();
//        } catch (SQLException ex) {
//
//            ex.printStackTrace();
//        }
//
//        return b;
//    }
//
//    /**
//     * @param username
//     * @param password
//     * @return
//     */
//    public User signIn(String username, String password) {
//
//        User userSinIn = new User();
//        userSinIn = null;
//        try {
//            if (search(username)) {
////                con = db.getConnect();
//                String sql = "SELECT * FROM `users` WHERE `uEmail`=? AND `uPassword`=?";
//                PreparedStatement pst = con.prepareStatement(sql);
//                pst.setString(1, username);
//                pst.setString(2, password);
////                pst.setString(2, SHA.encrypt(password));
//                ResultSet rs = pst.executeQuery();
//
//                if (rs.next()) {
//                    userSinIn = new User(rs.getInt("uId"), rs.getString("uName"), rs.getString("uEmail"), rs.getString("uJob"), rs.getString("uPassword"), rs.getString("uRole"), rs.getString("uPhoto"), rs.getString("uAddress"));
//                }
//
//                System.out.println(userSinIn);
//                return userSinIn;
//            }
//            closeConnection();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return null;
//    }
//
////    public static void main(String[] args) {
////        UserDao userDao = new UserDao();
////        System.out.println(userDao.signIn("leduchoa911@gmail.com", "hoa"));
////    }
//}
//
