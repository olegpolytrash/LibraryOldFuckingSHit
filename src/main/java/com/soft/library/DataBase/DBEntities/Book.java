package com.soft.library.DataBase.DBEntities;

/**
 * Created by Oleg on 10.04.2015.
 */
public class Book {
    private int id;
    private String name;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
