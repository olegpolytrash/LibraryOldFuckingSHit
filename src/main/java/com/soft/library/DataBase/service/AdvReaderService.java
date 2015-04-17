package com.soft.library.dataBase.service;

import com.soft.library.dataBase.model.Reader;
import com.soft.library.dataBase.dao.ReaderDAO;
import com.soft.library.dataBase.dao.impl.DaoFactory;

public class AdvReaderService {
    private ReaderDAO readerDAO;

    public AdvReaderService() {
        readerDAO = DaoFactory.getInstance().getReaderDAOImpl();
    }

    public void addReader(String title) {
        Reader reader = new Reader();
        reader.setName(title);
        readerDAO.save(reader);
    }

    public int updateReaders(String oldName, String newName) {
        int count = 0;
        for (Reader a : readerDAO.getAll()) {
            if (a.getName().equals(oldName)) {
                a.setName(newName);
                readerDAO.update(a);
                count++;
            }
        }
        return count;
    }

    public void printReaders() {
        System.out.println("\nAll Readers:");
        for (Reader a : readerDAO.getAll()) {
            System.out.println("readerDAO: id=" + a.getId() + " Title="
                    + a.getName());
        }
    }

    public Reader getReaderById(int readerDAOId) {
        return readerDAO.findById(readerDAOId);
    }

    public void deleteReader(String name) {
        for (Reader a : readerDAO.getAll()) {
            if (a.getName().equalsIgnoreCase(name)) {
                readerDAO.remove(a);
                break;
            }
        }
    }
}
