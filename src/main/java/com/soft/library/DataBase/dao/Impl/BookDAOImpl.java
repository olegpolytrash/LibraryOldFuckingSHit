/**
 * 
 */
package com.soft.library.DataBase.dao.Impl;

import com.soft.library.dataBase.DBEntities.Book;
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
