package com.soft.library.DataBase.service;

import com.soft.library.DataBase.DBEntities.Book;

public class AdvBookService {

    public static void addBook(String title) {
        Book book = new Book();
        book.setName(title);
        BookService as = new BookService();
        as.addBook(book);
    }

    public static int updateBooks(String oldName, String newName) {
        BookService as = new BookService();
        int count = 0;
        for (Book a : as.getAllBooks()) {
            if (a.getName().equals(oldName)) {
                a.setName(newName);
                as.updateBook(a);
                count++;
            }
        }
        return count;
    }

    public static void printBooks() {
        BookService as = new BookService();
        System.out.println("\nAll Books:");
        for (Book a : as.getAllBooks()) {
            System.out.println("book: id=" + a.getId() + " Title="
                    + a.getName());
        }
    }

    public static Book getBookById(int bookId) {
        BookService as = new BookService();
        return as.getBookById(bookId);
    }

    public static void deleteBook(String book) {
        BookService as = new BookService();
        for (Book a : as.getAllBooks()) {
            if (a.getName().equalsIgnoreCase(book)) {
                as.deleteBook(a);
                break;
            }
        }
    }
}
