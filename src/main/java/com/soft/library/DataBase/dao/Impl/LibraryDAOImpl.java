/**
 * 
 */
package com.soft.library.DataBase.dao.Impl;

import com.soft.library.dataBase.DBEntities.Library;
import com.soft.library.dataBase.dao.LibraryDAO;

/**
 * @author rd
 *
 */
public class LibraryDAOImpl extends ElementDAOImpl<Library> implements LibraryDAO {

    public LibraryDAOImpl() {
        super(Library.class);
    }
}
