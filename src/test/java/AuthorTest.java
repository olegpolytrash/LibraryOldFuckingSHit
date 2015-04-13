import com.soft.library.DataBase.DBEntities.Author;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Oleg on 12.04.2015.
 */
public class AuthorTest {
    public static void getAll() {
        Session session = TestingSessionFactory.INSTANCE.get().openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            List authors = session.createQuery("FROM Author").list();
            for (Iterator iterator = authors.iterator(); iterator.hasNext();) {
                Author author = (Author) iterator.next();
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

    @Test
    public void testInsert() {
        Session session = TestingSessionFactory.INSTANCE.get().openSession();
        Transaction tx = session.getTransaction();

        Author author1 = new Author("author1");
        session.save(author1);

        tx.commit();
        session.close();
    }
}
