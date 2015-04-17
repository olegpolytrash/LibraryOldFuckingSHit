/**
 * 
 */
package com.soft.library.DataBase.dao.Impl;

import com.soft.library.dataBase.DBEntities.Author;
import com.soft.library.dataBase.dao.AuthorDAO;

/**
 * @author rd
 *
 */

public class AuthorDAOImpl extends ElementDAOImpl<Author> implements AuthorDAO {

    public AuthorDAOImpl() {
        super(Author.class);
    }


}
