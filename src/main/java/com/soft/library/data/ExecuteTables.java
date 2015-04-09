package com.soft.library.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ExecuteTables {
    

    public static boolean insert(String name, String TABLE) {
        String sql = "INSERT INTO " + TABLE + " (name) values (\'" + name + "\')";
        return executeCommand(sql);
    }

    public static boolean removeById(String id, String TABLE) {
        String sql = "DELETE FROM " + TABLE + " WHERE id = " + id;
        return executeCommand(sql);
    }

    public static boolean updateAuthorName(int id, String name, String TABLE) {
        String sql = "UPDATE " + TABLE + " SET name = \'" + name + "\' WHERE id = "
                + id;
        return executeCommand(sql);
    }

    public static List<String> selectById(String id, String TABLE) {
        String sql = "SELECT " + id + " FROM " + TABLE + " WHERE ID = " + id;
        return executeGet(sql);
    }
    public static List<String> selectAll(String TABLE) {
        String sql = "SELECT * FROM " + TABLE;
        return executeGet(sql);
    }

    private static List<String> executeGet(String sql) {
        Connection conn = DBConnection.getConnection();
        Statement stmt;
        List<String> results = new ArrayList<>();
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            int x = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= x; i++) {
                    results.add(rs.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException se) {
        }
        return results;
    }

    private static boolean executeCommand(String sql) {
        int result = 0;
        int changedLines = 0;
        Connection conn = DBConnection.getConnection();
        Statement stmt;
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException se) {
        }
        return result != changedLines;
    }
}