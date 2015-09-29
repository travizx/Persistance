/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.dao.ISfalConfDAO;
import com.mx.teknei.pcabordo.lib.entities.SfalConf;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ajimenez
 */
public class SfalConfDAO extends GenericDaoImp<SfalConf, Long> implements ISfalConfDAO {

    @Override
    public List<SfalConf> listSfalConf() {
        List<SfalConf> confAlar = new ArrayList<>();
        Session session = getSessionFactory().openSession();
        try {
            Transaction trans = null;

            trans = session.beginTransaction();
            confAlar = session.createQuery("from SfalConf").list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return confAlar;
    }

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    @Override
    public SfalConf getAlarConfForName(String nameConfAlar) {
        SfalConf s_alar  = null;
//        List<SfalConf> confAlar = null;
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();


            SQLQuery query = session.createSQLQuery("SELECT * FROM sitm.sfal_conf s WHERE s.id_alar = (SELECT id_alar from sitm.sbct_alar where des_alar = ? )");
            query.addEntity(SfalConf.class);
            query.setString(0, nameConfAlar);
            s_alar = (SfalConf)query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return s_alar;
    }

}
