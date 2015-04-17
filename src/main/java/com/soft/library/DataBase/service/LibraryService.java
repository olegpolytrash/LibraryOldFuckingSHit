package com.soft.library.DataBase.service;

import java.util.List;

import com.soft.library.DataBase.DBEntities.Library;
import com.soft.library.DataBase.dao.Impl.DaoFactory;

public class LibraryService {

        public void addLibrary(Library library) {
            DaoFactory.getInstance().getLibraryDAOImpl().addElement(library);
        }

        public void updateLibrary(Library library) {
            DaoFactory.getInstance().getLibraryDAOImpl().updateElement(library);
        }

        public Library getLibraryById(Integer libraryId) {
            return DaoFactory.getInstance().getLibraryDAOImpl().getElementByID(libraryId);
        }

        public List<Library> getAllLibrarys() {
            return DaoFactory.getInstance().getLibraryDAOImpl().getAllElements();
        }

        public void deleteLibrary(Library library) {
            DaoFactory.getInstance().getLibraryDAOImpl().deleteElement(library);
        }
}
