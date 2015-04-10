package com.soft.library.DataBase.DataBaseCore;

import org.hibernate.cfg.Configuration;

/**
 * Singleton for the SessionFactory object.
 * Usage example: SessionFactory.INSTANCE.get().openSession();
 */
public enum SessionFactory {
    INSTANCE;

    private final org.hibernate.SessionFactory sessionFactory;

    SessionFactory() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public org.hibernate.SessionFactory get()
    {
        return sessionFactory;
    }
}
