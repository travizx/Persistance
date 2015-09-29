/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.dao.ISfmoReceNaveDAO;
import com.mx.teknei.pcabordo.lib.entities.SfmoReceNave;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ajimenez
 */
public class SfmoReceNaveDAO extends GenericDaoImp<SfmoReceNave, Long> implements ISfmoReceNaveDAO{

    @Override
    public List<SfmoReceNave> listSfmoReceNave() {
        
           List<SfmoReceNave> receNave = new ArrayList<>();
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            receNave = session.createQuery("from SfmoReceNave").list();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return receNave;
        
   //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SfmoReceNave> getIdReceNaveForIdVehi(Integer idVehi) {
        
        List<SfmoReceNave>receNave =new ArrayList<>();
        Transaction tran=null;
        Session session=getSessionFactory().openSession();
        try{
        
        tran=session.beginTransaction();
        Query query = session.createQuery("from SfmoReceNave E WHERE E.idVehi = :idVehi");
        query.setParameter("idVehi", idVehi);
        receNave= query.list();
        return null;
        }catch (Exception e){
            
            e.printStackTrace();
            
        }finally{
           session.close();
           session.flush();
            
        }
        return receNave;
      
        
        }
        //new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     
    
}
