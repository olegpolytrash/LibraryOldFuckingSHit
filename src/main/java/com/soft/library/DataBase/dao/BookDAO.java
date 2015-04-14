/**
 * 
 */
package com.soft.library.DataBase.dao;

import com.soft.library.DataBase.DBEntities.Book;

/**
 * @author rd
 *
 */
public class BookDAO extends ElementDAOImpl<Book> {

    public BookDAO() {
        super(Book.class);
    }
}
