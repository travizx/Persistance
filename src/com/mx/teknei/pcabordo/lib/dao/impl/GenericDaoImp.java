/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;


import com.mx.teknei.pcabordo.lib.connection.LoadConnection;
import java.lang.reflect.ParameterizedType;
import java.io.Serializable;
import com.mx.teknei.pcabordo.lib.db.exception.UnableToSaveException;
import com.mx.teknei.pcabordo.lib.dao.GenericDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HAENCISO
 */
public class GenericDaoImp<Entity, K extends Serializable> implements GenericDao<Entity, K> {

    public Class<Entity> domainClass = getDomainClass();
    private Session session;
    private Transaction trans;

    protected Class getDomainClass() {
        if (domainClass == null) {
            ParameterizedType thisType = (ParameterizedType) getClass()
                    .getGenericSuperclass();
            domainClass = (Class) thisType.getActualTypeArguments()[0];
        }
        return domainClass;
    }

    private Session getHibernateTemplate() {
        Session session = null;
        try {
            session = LoadConnection.getSessionFactory().openSession();
        } catch (ExceptionInInitializerError eiie){
            System.out.println("Error al iniciar la coneccion a BD postgres:"+eiie.getMessage()); 
            eiie.printStackTrace();
        } catch (Exception e) {
            System.err.println("Error en LoadConnection."+e.getMessage());
            e.printStackTrace();
        }
        return session;
    }

    @Override
    public void add(Entity t) {
        try {
            session = getHibernateTemplate();
            session.save(t);
            Transaction trans = session.beginTransaction();
            trans.commit();
        } catch (HibernateException e) {
           System.out.println(e.getMessage());
            throw new UnableToSaveException(e);
        }finally{
            session.close();
        }
    }

    @Override
    public void update(Entity t) {
        try {
            session = getHibernateTemplate();
            session.update(t);
            Transaction trans = session.beginTransaction();
            trans.commit();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            throw new UnableToSaveException(e);
        }finally{
            session.close();
        }
        
    }

    @Override
    public Entity find(K id) {
        Entity returnValue = null;
        try {
            session = getHibernateTemplate();
            returnValue = (Entity) session.load(domainClass, id);
            Transaction trans = session.beginTransaction();
            trans.commit();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            throw new UnableToSaveException(e);
        }finally{
            session.close();
        }
        return returnValue;
    }

    @Override
    public void erase(Entity t) {
        try {
            session = getHibernateTemplate();
            session.delete(t);
            Transaction trans = session.beginTransaction();
            trans.commit();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            throw new UnableToSaveException(e);
        }finally{
            session.close();
        }
    }

}
