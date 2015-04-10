package com.soft.library.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Manages connection to the database
 */
public class DBConnection {
    /**
     * Get opened, ready-to-use connection
     * @return an opened connection, or null if a connection couldn't be opened
     */
    public static Connection getConnection() {
        String dbClass = "com.mysql.jdbc.Driver";
        Connection conn = null;

        try {
            Class.forName(dbClass);
            conn = DriverManager.getConnection(
                    "jdbc:mysql://sql3.freemysqlhosting.net/sql373362",
                    "sql373362", "qB2!dR1%");
        } catch (ClassNotFoundException e) {
            System.out.println("couldn't open a connection to the database");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    /**
     * Close the connection passed as an argument
     * @param connection connection to be closed
     */
    public void closeConnection(Connection connection) {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }
}
