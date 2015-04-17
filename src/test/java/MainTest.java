import com.soft.library.dataBase.model.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;


/**
 * Example
 */
public class MainTest {
    public void testMethod(){
        Session session = null;
        Transaction tx = null;

        session = TestingSessionFactory.INSTANCE.get().openSession();

        try{
            tx = null;

            tx = session.beginTransaction();

            Author a1 = new Author();
            a1.setName("a1");
            session.save(a1);
            Author a2 = new Author();
            a2.setName("a2");
            session.save(a2);

            Book b1 = new Book();
            b1.setName("b1");
            session.save(b1);

            Book b2 = new Book();
            b2.setName("b2");
            session.save(b2);

            b2.getAuthors().add(a2);
            a1.getBooks().add(b1);

            Publisher p1 = new Publisher();
            p1.setName("p1");
            session.save(p1);

            Reader r1 = new Reader();
            r1.setName("rn1");
            r1.setSurname("rs1");
                    r1.setAddress("a1");
            r1.setMobilePhone("rmob1");
            r1.setBirthDate(new Date(123123));
            session.save(r1);

            Library library = new Library();
            library.setYear(10);
            library.setPages(123);
            library.setBook(b1);
            library.setQuantity(4);
            library.setPublisher(p1);

            session.save(library);

            LibraryLogEntry libraryLogEntry = new LibraryLogEntry();
            libraryLogEntry.setBook(b1);
            libraryLogEntry.setReader(r1);
            libraryLogEntry.setReturned(new Date(123123));
            libraryLogEntry.setTaken(new Date(123123123));
            session.save(libraryLogEntry);

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            if (session != null)
            session.close();
        }

        AuthorTest.getAll();
        BookTest.getAll();
        PublisherTest.getAll();
        ReaderTest.getAll();
        LibraryTest.getAll();
        LibraryLogEntryTest.getAll();

        TestingSessionFactory.INSTANCE.get().close();
    }

    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        mainTest.testMethod();
    }

}
