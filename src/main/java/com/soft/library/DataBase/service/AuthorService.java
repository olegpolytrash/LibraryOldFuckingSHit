/**
 * 
 */
package com.soft.library.DataBase.service;

import com.soft.library.DataBase.DBEntities.Author;
import java.util.List;

import com.soft.library.DataBase.dao.DaoFactory;

public class AuthorService {

    public void addAuthor(Author author) {
        DaoFactory.getInstance().getAuthorDAO().addElement(author);
    }

    public void updateAuthor(Author author) {
        DaoFactory.getInstance().getAuthorDAO().updateElement(author);
    }

    public Author getAuthorById(Long authorId) {
        return DaoFactory.getInstance().getAuthorDAO().getElementByID(authorId);
    }

    public List<Author> getAllAuthors() {
        return DaoFactory.getInstance().getAuthorDAO().getAllElements();
    }

    public void deleteAuthor(Author author) {
        DaoFactory.getInstance().getAuthorDAO().deleteElement(author);
    }
}
