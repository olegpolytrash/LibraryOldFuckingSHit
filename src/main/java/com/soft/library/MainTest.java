package com.soft.library;

import com.soft.library.DataBase.DBEntities.Author;
import com.soft.library.DataBase.DataBaseCore.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Oleg on 10.04.2015.
 */
public class MainTest {
    /* Method to  READ all the employees */
    public void listEmployees( ){
        Session session = SessionFactory.INSTANCE.get().openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            List authors = session.createQuery("FROM Author").list();
            for (Iterator iterator = authors.iterator(); iterator.hasNext();) {
                Author author = (Author) iterator.next();
                System.out.print("id: " + author.getId());
                System.out.print("name: " + author.getName());
                System.out.print("name: " + author.getBooks());
                System.out.println();
            }
            tx.commit();
        }catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        mainTest.listEmployees();
    }

}
