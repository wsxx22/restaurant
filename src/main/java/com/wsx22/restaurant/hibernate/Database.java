package com.wsx22.restaurant.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Database {

    private static Database instance;

    private SessionFactory sessionFactory;
    private Session session;

    private Database () {

        var serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

        try {
            var metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
            sessionFactory = metadata.buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(serviceRegistry);
        }

    }

    public Database getInstance () {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }



}
