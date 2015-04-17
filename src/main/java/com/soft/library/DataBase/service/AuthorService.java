/**
 * 
 */
package com.soft.library.DataBase.service;

import com.soft.library.DataBase.DBEntities.Author;
import java.util.List;

import com.soft.library.DataBase.dao.Impl.DaoFactory;

public class AuthorService {

    public void addAuthor(Author author) {
        DaoFactory.getInstance().getAuthorDAOImpl().addElement(author);
    }

    public void updateAuthor(Author author) {
        DaoFactory.getInstance().getAuthorDAOImpl().updateElement(author);
    }

    public Author getAuthorById(Integer authorId) {
        return DaoFactory.getInstance().getAuthorDAOImpl().getElementByID(authorId);
    }

    public List<Author> getAllAuthors() {
        return DaoFactory.getInstance().getAuthorDAOImpl().getAllElements();
    }

    public void deleteAuthor(Author author) {
        DaoFactory.getInstance().getAuthorDAOImpl().deleteElement(author);
    }
}
