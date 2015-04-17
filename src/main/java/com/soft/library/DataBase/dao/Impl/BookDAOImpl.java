/**
 * 
 */
package com.soft.library.dataBase.dao.impl;

import com.soft.library.dataBase.model.Book;
import com.soft.library.dataBase.dao.BookDAO;

/**
 * @author rd
 *
 */
public class BookDAOImpl extends ElementDAOImpl<Book> implements BookDAO {

    public BookDAOImpl() {
        super(Book.class);
    }
}
