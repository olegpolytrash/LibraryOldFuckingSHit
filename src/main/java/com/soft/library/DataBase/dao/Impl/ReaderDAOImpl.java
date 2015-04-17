/**
 * 
 */
package com.soft.library.DataBase.dao.Impl;

import com.soft.library.dataBase.DBEntities.Reader;
import com.soft.library.dataBase.dao.ReaderDAO;

/**
 * @author rd
 *
 */
public class ReaderDAOImpl extends ElementDAOImpl<Reader> implements ReaderDAO {

    public ReaderDAOImpl() {
        super(Reader.class);
    }
}
