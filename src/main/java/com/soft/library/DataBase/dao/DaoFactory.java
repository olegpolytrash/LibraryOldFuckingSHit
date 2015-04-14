/**
 * 
 */
package com.soft.library.DataBase.dao;

/**
 * @author rd
 *
 */
public class DaoFactory {

    private AuthorDAO         authorDAO    = null;

    private BookDAO           bookDAO      = null;
    private LibraryDAO        libraryDAO   = null;
    private PublisherDAO      publisherDAO = null;
    private ReaderDAO         readerDAO    = null;

    private static DaoFactory instance     = null;

    private DaoFactory() {
        authorDAO = new AuthorDAO();
        bookDAO = new BookDAO();
        libraryDAO = new LibraryDAO();
        publisherDAO = new PublisherDAO();
        readerDAO = new ReaderDAO();
    }

    public static synchronized DaoFactory getInstance() {
        if (instance == null) {
            instance = new DaoFactory();
        }
        return instance;
    }

    public AuthorDAO getAuthorDAO() {
        return authorDAO;
    }

    public BookDAO getBookDAO() {
        return bookDAO;
    }

    public LibraryDAO getLibraryDAO() {
        return libraryDAO;
    }

    public PublisherDAO getPublisherDAO() {
        return publisherDAO;
    }

    public ReaderDAO getReaderDAO() {
        return readerDAO;
    }
}
