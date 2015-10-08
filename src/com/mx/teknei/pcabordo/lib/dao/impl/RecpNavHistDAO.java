/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.dao.IRecpNavHistDAO;
import com.mx.teknei.pcabordo.lib.entities.SfmoHistReceNave;
import com.mx.teknei.pcabordo.lib.entities.SfvhVehi;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author hjcacho
 */
public class RecpNavHistDAO extends GenericDaoImp<SfmoHistReceNave, Long> implements IRecpNavHistDAO{
    
    
    
    @Override
    public List<SfmoHistReceNave> listHisRecpNav() {
        List<SfmoHistReceNave> recpnav = new ArrayList<>();
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            recpnav = session.createQuery("from SfmoHistReceNave").list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return recpnav;
    }

    public List<SfmoHistReceNave> listCicloReco(Date hora1, Date hora2, int idVehiculo) {

        java.util.Date utilDate = new java.util.Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(hora1);
        cal.set(Calendar.MILLISECOND, 0);

        
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(hora2);
        cal2.set(Calendar.MILLISECOND, 0);

        SfmoHistReceNave s_hist = null;
        Transaction trans = null;
        List<SfmoHistReceNave> cicloRe = null;
        Session session = getSessionFactory().openSession();
        try {
            SfvhVehi vehi = new SfvhVehi();
            vehi.setIdVehi(idVehiculo);
            trans = session.beginTransaction();
            Query query = session.createQuery("FROM SfmoHistReceNave AS c WHERE  c.horaSistReceNave BETWEEN :hora1 AND :hora2 AND c.sfvhVehi = :id_vehi");
            query.setParameter("hora1", new java.sql.Timestamp(hora1.getTime()));
            query.setParameter("hora2", new java.sql.Timestamp(hora2.getTime()));
            query.setParameter("id_vehi", vehi);
            cicloRe = query.list();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return cicloRe;
    }

}
