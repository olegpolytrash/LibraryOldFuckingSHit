package com.soft.library.DataBase.service;

import java.util.List;

import com.soft.library.DataBase.DBEntities.Library;
import com.soft.library.DataBase.dao.DaoFactory;

public class LibraryService {

        public void addLibrary(Library library) {
            DaoFactory.getInstance().getLibraryDAO().addElement(library);
        }

        public void updateLibrary(Library library) {
            DaoFactory.getInstance().getLibraryDAO().updateElement(library);
        }

        public Library getLibraryById(Integer libraryId) {
            return DaoFactory.getInstance().getLibraryDAO().getElementByID(libraryId);
        }

        public List<Library> getAllLibrarys() {
            return DaoFactory.getInstance().getLibraryDAO().getAllElements();
        }

        public void deleteLibrary(Library library) {
            DaoFactory.getInstance().getLibraryDAO().deleteElement(library);
        }
}
