/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.dao.ISfopEquiAlarDAO;
import com.mx.teknei.pcabordo.lib.entities.SfopEquiAlar;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author ajimenez
 */
public class SfopEquiAlarDAO extends GenericDaoImp<SfopEquiAlar, Long> implements ISfopEquiAlarDAO{

    @Override
    public List<SfopEquiAlar> listSfopEquiAlar() {
           List<SfopEquiAlar> opAlar = new ArrayList<>();
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            opAlar = session.createQuery("from SfopEquiAlar").list();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return opAlar;
        
        
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SfopEquiAlar> getSfopEquiAlarForId(int idOpeqAlar) {
        
        List<SfopEquiAlar>itin =new ArrayList<>();
        Transaction tran=null;
        Session session=getSessionFactory().openSession();
        try{
        
        tran=session.beginTransaction();
        Query query = session.createQuery("from SfopEquiAlar E WHERE E.idOpeqAlar = :idOpeqAlar");
        query.setParameter("idOpeqAlar", idOpeqAlar);
        itin= query.list();
        return null;
        }catch (Exception e){
            
            e.printStackTrace();
            
        }finally{
           session.close();
           session.flush();
            
        }
        return itin;
      
        
        }
        
          ///throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
