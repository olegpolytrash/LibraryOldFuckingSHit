/**
 * 
 */
package com.soft.library.dataBase.dao.impl;

import com.soft.library.dataBase.model.LibraryLogEntry;
import com.soft.library.dataBase.dao.LibraryLogEntryDAO;

/**
 * @author rd
 *
 */
public class LibraryLogEntryDAOImpl extends ElementDAOImpl<LibraryLogEntry> implements LibraryLogEntryDAO {

    public LibraryLogEntryDAOImpl() {
        super(LibraryLogEntry.class);
    }
}
