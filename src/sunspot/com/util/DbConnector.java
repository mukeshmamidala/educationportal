package sunspot.com.util;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import sunspot.com.entity.TeacherPrefrences;
import sunspot.com.entity.User;
import sunspot.com.entity.UserNotification;



public class DbConnector {

	//share in entire application
    private static DbConnector me;
    private Configuration cfg;
    private SessionFactory sessionFactory;

    private DbConnector() throws HibernateException {
        // build the config
    	 cfg = new Configuration();

        /**
         * Connection Information..
         */
    	cfg.setProperty("hibernate.connection.driver_class","com.mysql.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/portal");
        cfg.setProperty("hibernate.connection.username", "root");
        cfg.setProperty("hibernate.connection.password", "suns");
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
        cfg.setProperty("hibernate.hbm2ddl.auto","update");// carefull make it update after first setup done

        //Create database bankingApp
        /**
         * Mapping Resources..
         */
        cfg.addAnnotatedClass(User.class);
        cfg.addAnnotatedClass(TeacherPrefrences.class);
        cfg.addAnnotatedClass(UserNotification.class);
//        cfg.addAnnotatedClass(CurrentBalance.class);
        sessionFactory = cfg.buildSessionFactory();
    }

    public static synchronized DbConnector getInstance() throws HibernateException {
        if (me == null) {
            me = new DbConnector();
        }
        return me;
    }

    public Session getSession() throws HibernateException {
        Session session = sessionFactory.openSession();
        if (!session.isConnected()) {
            this.reconnect();
            session = sessionFactory.openSession();
        }
        return session;
    }

    private void reconnect() throws HibernateException {
        this.sessionFactory = cfg.buildSessionFactory();

    }
}