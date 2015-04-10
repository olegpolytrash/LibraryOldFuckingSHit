package com.soft.library.DataBase.DBEntities;

import java.util.HashSet;
import java.util.Set;

/**
 * Database entry.
 */
public class Author {
    private int id;
    private String name;
    private Set<Book> books = new HashSet<>(0);

    public Author() {
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
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

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
