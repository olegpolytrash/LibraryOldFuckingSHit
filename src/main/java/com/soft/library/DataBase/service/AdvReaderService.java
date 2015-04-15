package com.soft.library.DataBase.service;

import com.soft.library.DataBase.DBEntities.Reader;

public class AdvReaderService {

    public static void addReader(String title) {
        Reader reader = new Reader();
        reader.setName(title);
        ReaderService as = new ReaderService();
        as.addReader(reader);
    }

    public static int updateReaders(String oldName, String newName) {
        ReaderService as = new ReaderService();
        int count = 0;
        for (Reader a : as.getAllReader()) {
            if (a.getName().equals(oldName)) {
                a.setName(newName);
                as.updateReader(a);
                count++;
            }
        }
        return count;
    }

    public static void printReaders() {
        ReaderService as = new ReaderService();
        System.out.println("\nAll Books:");
        for (Reader a : as.getAllReader()) {
            System.out.println("reader: id=" + a.getId() + " Title="
                    + a.getName());
        }
    }

    public static Reader getReaderById(int readerId) {
        ReaderService as = new ReaderService();
        return as.getReaderById(readerId);
    }

    public static void deleteReader(String reader) {
        ReaderService as = new ReaderService();
        for (Reader a : as.getAllReader()) {
            if (a.getName().equalsIgnoreCase(reader)) {
                as.deleteReader(a);
                break;
            }
        }

    }
}
