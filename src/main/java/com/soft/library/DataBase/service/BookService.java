package com.soft.library.DataBase.service;

import java.util.List;

import com.soft.library.DataBase.DBEntities.Book;
import com.soft.library.DataBase.dao.Impl.DaoFactory;

public class BookService {

    public void addBook(Book book) {
        DaoFactory.getInstance().getBookDAOImpl().addElement(book);
    }

    public void updateBook(Book book) {
        DaoFactory.getInstance().getBookDAOImpl().updateElement(book);
    }

    public Book getBookById(Integer bookId) {
        return DaoFactory.getInstance().getBookDAOImpl().getElementByID(bookId);
    }

    public List<Book> getAllBooks() {
        return DaoFactory.getInstance().getBookDAOImpl().getAllElements();
    }

    public void deleteBook(Book book) {
        DaoFactory.getInstance().getBookDAOImpl().deleteElement(book);
    }

}
