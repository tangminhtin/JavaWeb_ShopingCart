package Model.DAO;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=DataXXX;";
    private static String username = "sa";
    private static String password = "123456";

    public static Connection lol() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            return null;
        }
    }
}
