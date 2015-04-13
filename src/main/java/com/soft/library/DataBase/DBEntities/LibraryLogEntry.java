package com.soft.library.DataBase.DBEntities;

import java.sql.Date;

/**
 * Database entry.
 */
public class LibraryLogEntry {
    private int id;
    private Book book;
    private Reader reader;
    private Date taken;
    private Date returned;

    public LibraryLogEntry() {
    }

    public LibraryLogEntry(Book book, Reader reader, Date taken, Date returned) {
        this.book = book;
        this.reader = reader;
        this.taken = taken;
        this.returned = returned;
    }

    @Override
    public String toString() {
        return "LibraryLogEntry{" +
                "id=" + id +
                ", books=" + book +
                ", readers=" + reader +
                ", taken=" + taken +
                ", returned=" + returned +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getTaken() {
        return taken;
    }

    public void setTaken(Date taken) {
        this.taken = taken;
    }

    public Date getReturned() {
        return returned;
    }

    public void setReturned(Date returned) {
        this.returned = returned;
    }
}
