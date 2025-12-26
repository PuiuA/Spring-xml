package com.company.util;

import org.hibernate.SessionFactory;

public class HibernateUtil {

    private SessionFactory sessionFactory;

    HibernateUtil(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
