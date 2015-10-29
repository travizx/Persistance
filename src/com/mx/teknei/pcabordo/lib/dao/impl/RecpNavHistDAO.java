/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import com.mx.teknei.pcabordo.lib.connection.LoadConnection;
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
        Session session = null;
        try {
            session = LoadConnection.getSessionFactory().openSession();
        } catch (ExceptionInInitializerError eiie){
            System.out.println("Error al iniciar la coneccion a BD postgres:"+eiie.getMessage()); 
        } catch (Exception e) {
            System.err.println("Error en LoadConnection."+e.getMessage());
        }
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

    public List<SfmoHistReceNave> listCicloReco(Long hora1, Long hora2, int idVehiculo) {
        
        Transaction trans = null;
        List<SfmoHistReceNave> cicloRe = null;
        Session session = null;
        try {
            session = LoadConnection.getSessionFactory().openSession();
        } catch (ExceptionInInitializerError eiie){
            System.out.println("Error al iniciar la coneccion a BD postgres:"+eiie.getMessage()); 
        } catch (Exception e) {
            System.err.println("Error en LoadConnection."+e.getMessage());
        }
        try {
            SfvhVehi vehi = new SfvhVehi();
            vehi.setIdVehi(idVehiculo);
            trans = session.beginTransaction();
            Query query = session.createQuery("FROM SfmoHistReceNave AS c WHERE  c.fchCrea BETWEEN :hora1 AND :hora2  AND c.sfvhVehi = :id_vehi ORDER BY idRecoNave ASC");
            query.setParameter("hora1", new java.sql.Timestamp(hora1));
            query.setParameter("hora2", new java.sql.Timestamp(hora2));
            query.setParameter("id_vehi", vehi);
            cicloRe = query.list();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return cicloRe;
    }

}
