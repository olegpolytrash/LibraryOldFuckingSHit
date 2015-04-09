package com.soft.library.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Oleg on 09.04.2015.
 */
public class DBConnection {
    

    public static Connection getConnection() {
        String dbClass = "com.mysql.jdbc.Driver";
        Connection conn = null;

        try {
            Class.forName(dbClass);
            conn = DriverManager.getConnection(
                    "jdbc:mysql://sql3.freemysqlhosting.net/sql373362",
                    "sql373362", "qB2!dR1%");
        } catch (ClassNotFoundException e) {
            System.out.println("can");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public void closeConnection(Connection conn) {
        try {
            if (conn != null)
                conn.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
