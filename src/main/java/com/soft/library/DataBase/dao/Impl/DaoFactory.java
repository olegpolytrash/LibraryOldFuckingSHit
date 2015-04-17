/**
 * 
 */
package com.soft.library.DataBase.dao.Impl;

/**
 * @author rd
 *
 */
public class DaoFactory {

    private AuthorDAOImpl authorDAOImpl = null;

    private BookDAOImpl bookDAOImpl = null;
    private LibraryDAOImpl libraryDAOImpl = null;
    private PublisherDAOImpl publisherDAOImpl = null;
    private ReaderDAOImpl readerDAOImpl = null;

    private static DaoFactory instance     = null;

    private DaoFactory() {
        authorDAOImpl = new AuthorDAOImpl();
        bookDAOImpl = new BookDAOImpl();
        libraryDAOImpl = new LibraryDAOImpl();
        publisherDAOImpl = new PublisherDAOImpl();
        readerDAOImpl = new ReaderDAOImpl();
    }

    public static synchronized DaoFactory getInstance() {
        if (instance == null) {
            instance = new DaoFactory();
        }
        return instance;
    }

    public AuthorDAOImpl getAuthorDAOImpl() {
        return authorDAOImpl;
    }

    public BookDAOImpl getBookDAOImpl() {
        return bookDAOImpl;
    }

    public LibraryDAOImpl getLibraryDAOImpl() {
        return libraryDAOImpl;
    }

    public PublisherDAOImpl getPublisherDAOImpl() {
        return publisherDAOImpl;
    }

    public ReaderDAOImpl getReaderDAOImpl() {
        return readerDAOImpl;
    }
}
