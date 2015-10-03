/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
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
        Session session = getSessionFactory().openSession();
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
