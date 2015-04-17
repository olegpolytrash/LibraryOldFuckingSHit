/**
 * 
 */
package com.soft.library.DataBase.dao.Impl;

import com.soft.library.DataBase.DBEntities.Book;
import com.soft.library.DataBase.dao.BookDAO;

/**
 * @author rd
 *
 */
public class BookDAOImpl extends ElementDAOImpl<Book> implements BookDAO {

    public BookDAOImpl() {
        super(Book.class);
    }
}
