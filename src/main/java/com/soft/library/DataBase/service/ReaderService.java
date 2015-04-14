/**
 * 
 */
package com.soft.library.DataBase.service;

import java.util.List;

import com.soft.library.DataBase.DBEntities.Publisher;
import com.soft.library.DataBase.DBEntities.Reader;
import com.soft.library.DataBase.dao.DaoFactory;

/**
 * @author rd
 *
 */
public class ReaderService {


    public void addReader(Reader reader) {
        DaoFactory.getInstance().getReaderDAO().addElement(reader);
    }

    public void updateReader(Reader reader) {
        DaoFactory.getInstance().getReaderDAO().updateElement(reader);
    }

    public Reader getReaderById(Long readerId) {
        return DaoFactory.getInstance().getReaderDAO().getElementByID(readerId);
    }

    public List<Reader> getAllReader() {
        return DaoFactory.getInstance().getReaderDAO().getAllElements();
    }

    public void deleteReader(Reader reader) {
        DaoFactory.getInstance().getReaderDAO().deleteElement(reader);
    }

}
