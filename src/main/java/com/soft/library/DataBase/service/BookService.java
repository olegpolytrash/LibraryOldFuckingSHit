package com.soft.library.DataBase.service;

import java.util.List;

import com.soft.library.DataBase.DBEntities.Book;
import com.soft.library.DataBase.dao.DaoFactory;

public class BookService {

    public void addBook(Book book) {
        DaoFactory.getInstance().getBookDAO().addElement(book);
    }

    public void updateBook(Book book) {
        DaoFactory.getInstance().getBookDAO().updateElement(book);
    }

    public Book getBookById(Long bookId) {
        return DaoFactory.getInstance().getBookDAO().getElementByID(bookId);
    }

    public List<Book> getAllBooks() {
        return DaoFactory.getInstance().getBookDAO().getAllElements();
    }

    public void deleteBook(Book book) {
        DaoFactory.getInstance().getBookDAO().deleteElement(book);
    }

}
