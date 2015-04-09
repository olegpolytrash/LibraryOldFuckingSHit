package com.soft.library.data;

import java.sql.*;

/**
 * Created by Oleg on 09.04.2015.
 */
public class DBConnection {
    public Connection getConnection() {
return null;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
            String dbClass = "com.mysql.jdbc.Driver";

            Class.forName(dbClass);
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://sql3.freemysqlhosting.net/sql373362",
                    "sql373362", "qB2!dR1%");

        Statement stmt = conn.createStatement();

        String sql = "SELECT * FROM Book";
        ResultSet rs = stmt.executeQuery(sql);

        rs.close();
    }
}
