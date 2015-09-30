/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.dao.ISbctAlarDAO;
import com.mx.teknei.pcabordo.lib.entities.SbctAlar;
import com.mx.teknei.pcabordo.lib.entities.SfalConf;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ajimenez
 */
public class SbctAlarDAO extends GenericDaoImp<SbctAlar, Long> implements ISbctAlarDAO {
 @Override
    public SbctAlar getAlarForName(String nameAlar) {
        
        SbctAlar s_alar = null;
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            SQLQuery query = session.createSQLQuery("select * from sitm.sbct_alar s where s.des_alar=?");
            query.addEntity(SbctAlar.class);
            query.setString(0, nameAlar);
            s_alar = (SbctAlar) query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return s_alar;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
