import com.soft.library.dataBase.DBEntities.Publisher;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Oleg on 12.04.2015.
 */
public class PublisherTest {
    public static void getAll() {
        Session session = TestingSessionFactory.INSTANCE.get().openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            List publishers = session.createQuery("FROM Publisher").list();
            for (Iterator iterator = publishers.iterator(); iterator.hasNext();) {
                Publisher author = (Publisher) iterator.next();
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
