/**
 * 
 */
package com.soft.library.DataBase.service;

import java.util.List;

import com.soft.library.DataBase.DBEntities.Reader;
import com.soft.library.DataBase.dao.Impl.DaoFactory;

/**
 * @author rd
 *
 */
public class ReaderService {


    public void addReader(Reader reader) {
        DaoFactory.getInstance().getReaderDAOImpl().addElement(reader);
    }

    public void updateReader(Reader reader) {
        DaoFactory.getInstance().getReaderDAOImpl().updateElement(reader);
    }

    public Reader getReaderById(Integer readerId) {
        return DaoFactory.getInstance().getReaderDAOImpl().getElementByID(readerId);
    }

    public List<Reader> getAllReader() {
        return DaoFactory.getInstance().getReaderDAOImpl().getAllElements();
    }

    public void deleteReader(Reader reader) {
        DaoFactory.getInstance().getReaderDAOImpl().deleteElement(reader);
    }

}
