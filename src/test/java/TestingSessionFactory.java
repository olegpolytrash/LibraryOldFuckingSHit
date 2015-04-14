import org.hibernate.cfg.Configuration;

/**
 * Singleton for the TestingSessionFactory object.
 * Usage example: TestingSessionFactory.INSTANCE.get().openSession();
 */
public enum TestingSessionFactory {
    INSTANCE;

    private org.hibernate.SessionFactory sessionFactory;

    TestingSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernateTest.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public org.hibernate.SessionFactory get()
    {
        return sessionFactory;
    }
}
