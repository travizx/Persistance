/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.connection;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author javier
 */
public class LoadConnection {

    private static SessionFactory sessionFactory;
    private static Integer countSessions;
    private static final Integer NUMERO_PERMITIDO_CONECCIONES = 50;

    static {
        
        countSessions = 0;
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.

            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

        } catch (Throwable ex) {
            // Log the exception. 
            sessionFactory = null;
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        countSessions++;
        if (countSessions > NUMERO_PERMITIDO_CONECCIONES) {
            sessionFactory.close();
            sessionFactory = null;
            try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
                // config file.

                sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

            } catch (Throwable ex) {
                // Log the exception. 
                System.err.println("Initial SessionFactory creation failed." + ex);
//                getSessionFactory();
                throw new ExceptionInInitializerError(ex);
                
            }
            System.out.println("Entro;");
            countSessions = 0;
        }
        return sessionFactory;

    }

    public static int getSessionOpen() {
        return countSessions;
    }

}
