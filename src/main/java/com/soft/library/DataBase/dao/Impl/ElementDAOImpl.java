package com.soft.library.DataBase.dao.Impl;

import java.util.List;

import com.soft.library.DataBase.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.soft.library.DataBase.DataBaseCore.SessionFactory;

public class ElementDAOImpl<E> implements BaseDao<E> {
    private Class<E> elementClass;

    public ElementDAOImpl(Class<E> elementClass) {
        this.elementClass = elementClass;
    }

    @Override
    public void save(E element) {
        Session session = null;
        try {
            session = SessionFactory.INSTANCE.get().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(element);
            transaction.commit();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
    }

    @Override
    public void update(E element) {
        Session session = null;
        try {
            session = SessionFactory.INSTANCE.get().openSession();
            Transaction transaction = session.beginTransaction();
            session.update(element);
            transaction.commit();
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
            }
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public E findById(int elementId) {
        Session session = null;
        E element = null;
        try {
           session = SessionFactory.INSTANCE.get().openSession();
           element = (E) session.get(elementClass, elementId);
        } finally {
            if ((session != null) && (session.isOpen())) {
                session.close();
        }    }
        return element;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<E> getAll() {
        Session session = null;
        List<E> elements;
        try {
           session = SessionFactory.INSTANCE.get().openSession();
           elements = session.createCriteria(elementClass).list();
        } finally {
            if ((session != null) && (session.isOpen())) {
                 session.close();
         }   }
         return elements;
    }

    @Override
    public void remove(E element) {
        Session session = null;
        try {
            session = SessionFactory.INSTANCE.get().openSession();
            Transaction transaction = session.beginTransaction();
            session.delete(element);
            transaction.commit();
        } finally {
             if ((session != null) && (session.isOpen())) {
                  session.close();
             }    
        }
    }
}
