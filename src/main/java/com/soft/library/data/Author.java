package com.soft.library.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Author {
    static final String TABLE = "Author";

    public static boolean insert(String name) {
        return ExecuteTables.insert(name, TABLE);
    }

    public static boolean removeById(String id) {
        return ExecuteTables.removeById(id, TABLE);
    }

    public static boolean updateAuthorName(int id, String name) {
        return ExecuteTables.updateAuthorName(id, name, TABLE);
    }

    public static List<String> selectById(String id) {
        return ExecuteTables.selectById(id, TABLE);
    }
    public static List<String> selectAll() {
        return ExecuteTables.selectAll(TABLE);
    }
}
