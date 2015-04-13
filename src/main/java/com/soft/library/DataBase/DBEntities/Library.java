package com.soft.library.DataBase.DBEntities;

import java.util.HashSet;
import java.util.Set;

/**
 * Database entry.
 */
public class Library {
    private int id;
    private int pages;
    private int year;
    private int quantity;
    private Set<Book> books = new HashSet<>(0);
    private Set<Publisher> publishers = new HashSet<>(0);

    public Library() {
    }

    public Library(int pages, int year, int quantity) {
        this.pages = pages;
        this.year = year;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", pages=" + pages +
                ", year=" + year +
                ", quantity=" + quantity +
                ", books=" + books +
                ", publishers=" + publishers +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Set<Publisher> getPublishers() {
        return publishers;
    }

    public void setPublishers(Set<Publisher> publishers) {
        this.publishers = publishers;
    }
}
