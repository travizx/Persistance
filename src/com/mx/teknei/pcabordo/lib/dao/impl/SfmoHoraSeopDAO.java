/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import com.mx.teknei.pcabordo.lib.connection.LoadConnection;
import com.mx.teknei.pcabordo.lib.dao.ISfmoHoraSeopDAO;
import com.mx.teknei.pcabordo.lib.entities.SfmoHoraSeop;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author ajimenez
 */
public class SfmoHoraSeopDAO extends GenericDaoImp<SfmoHoraSeop, Long> implements ISfmoHoraSeopDAO  {

    @Override
    public List<SfmoHoraSeop> listHoraSeop() {
        List<SfmoHoraSeop> horaOpeList = null;
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
            horaOpeList = session.createQuery("FROM SfmoHoraSeop").list();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return horaOpeList;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SfmoHoraSeop getSfmoHoraSeopForName(String nameHora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<SfmoHoraSeop> listSfmoHoraSeop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
