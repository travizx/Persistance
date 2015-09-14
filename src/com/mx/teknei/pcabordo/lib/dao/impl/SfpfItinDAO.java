/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.dao.ISfpfItinDAO;
import com.mx.teknei.pcabordo.lib.entities.SfpfItin;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


/**
 *
 * @author ajimenez
 */
public class SfpfItinDAO extends GenericDaoImp<SfpfItin, Long> implements ISfpfItinDAO{

    @Override
    public List<SfpfItin> listSfpfItin() {
        
   List<SfpfItin> itin = new ArrayList<>();
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            itin = session.createQuery("from SfpfItin").list();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return itin;
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SfpfItin> getIdItinForEsta(int idEsta) {
        
        List<SfpfItin>itin =new ArrayList<>();
        Transaction tran=null;
        Session session=getSessionFactory().openSession();
        try{
        
        tran=session.beginTransaction();
        Query query = session.createQuery("from SfpfItin E WHERE E.idEsta = :idEsta");
        query.setParameter("idEsta", idEsta);
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
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

