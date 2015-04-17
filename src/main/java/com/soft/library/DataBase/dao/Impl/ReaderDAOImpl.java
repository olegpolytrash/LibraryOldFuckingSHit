/**
 * 
 */
package com.soft.library.dataBase.dao.impl;

import com.soft.library.dataBase.model.Reader;
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
