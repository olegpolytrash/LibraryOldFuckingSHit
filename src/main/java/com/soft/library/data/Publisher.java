package com.soft.library.data;

import java.util.List;

public class Publisher {
    static final String TABLE = "Publisher";

    public static boolean insert(String name) {
        return ExecuteTables.insert(name, TABLE);
    }

    public static boolean removeById(int id) {
        return ExecuteTables.removeById(id, TABLE);
    }

    public static boolean updateAuthorName(String id, String name) {
        return ExecuteTables.updateAuthorName(id, name, TABLE);
    }

    public static List<String> selectById(int id) {
        return ExecuteTables.selectById(id, TABLE);
    }

    public static List<String> selectAll() {
        return ExecuteTables.selectAll(TABLE);
    }
}