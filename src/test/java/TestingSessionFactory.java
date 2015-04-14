import org.hibernate.cfg.Configuration;

/**
 * Singleton for the TestingSessionFactory object.
 * Usage example: TestingSessionFactory.INSTANCE.get().openSession();
 */
public enum TestingSessionFactory {
    INSTANCE;

    private final org.hibernate.SessionFactory sessionFactory;

    @SuppressWarnings("deprecation")
    TestingSessionFactory() {
        sessionFactory = new Configuration().configure("hibernateTest.cfg.xml").buildSessionFactory();
    }

    public org.hibernate.SessionFactory get()
    {
        return sessionFactory;
    }
}
