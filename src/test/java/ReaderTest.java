import com.soft.library.dataBase.DBEntities.Reader;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Oleg on 12.04.2015.
 */
public class ReaderTest {
    public static void getAll() {
        Session session = TestingSessionFactory.INSTANCE.get().openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            List readers = session.createQuery("FROM Reader").list();
            for (Iterator iterator = readers.iterator(); iterator.hasNext();) {
                Reader author = (Reader) iterator.next();
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
