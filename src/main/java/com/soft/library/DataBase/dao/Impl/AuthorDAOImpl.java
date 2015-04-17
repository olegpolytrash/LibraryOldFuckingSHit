/**
 * 
 */
package com.soft.library.dataBase.dao.impl;

import com.soft.library.dataBase.model.Author;
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
