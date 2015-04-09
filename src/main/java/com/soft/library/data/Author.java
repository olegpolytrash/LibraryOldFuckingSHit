package com.soft.library.data;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Author {

    public static boolean insert(String name) {
        boolean ret = false;
        Statement stmt = null;
        Connection conn = DBConnection.getConnection();
        String sql = "INSERT INTO Author name (" + name + ")";
        try {
            stmt = conn.createStatement();
            ret = stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return ret;
    }
}
