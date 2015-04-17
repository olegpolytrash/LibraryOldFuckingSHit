/**
 * 
 */
package com.soft.library.DataBase.dao.Impl;

import com.soft.library.DataBase.DBEntities.LibraryLogEntry;
import com.soft.library.DataBase.dao.LibraryLogEntryDAO;

/**
 * @author rd
 *
 */
public class LibraryLogEntryDAOImpl extends ElementDAOImpl<LibraryLogEntry> implements LibraryLogEntryDAO {

    public LibraryLogEntryDAOImpl() {
        super(LibraryLogEntry.class);
    }
}
