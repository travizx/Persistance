/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import com.mx.teknei.pcabordo.lib.dao.IRecpNavDAO;
import java.util.ArrayList;
import java.util.List;
import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.entities.SfmoReceNave;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author HAENCISO
 */
public class RecpNavDAO extends GenericDaoImp<SfmoReceNave, Long> implements IRecpNavDAO{

    @Override
    public List<SfmoReceNave> listRecpNav() {
        List<SfmoReceNave> recpnav = new ArrayList<>();
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            recpnav = session.createQuery("from SfmoReceNave").list();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        
        return recpnav;
    }
    
}
