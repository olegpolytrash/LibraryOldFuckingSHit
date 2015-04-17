import com.soft.library.dataBase.model.LibraryLogEntry;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Oleg on 12.04.2015.
 */
public class LibraryLogEntryTest {
    public static void getAll() {
        Session session = TestingSessionFactory.INSTANCE.get().openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            List authors = session.createQuery("FROM LibraryLogEntry").list();
            for (Iterator iterator = authors.iterator(); iterator.hasNext();) {
                LibraryLogEntry author = (LibraryLogEntry) iterator.next();
                System.out.print(author);
                System.out.println();
            }
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
