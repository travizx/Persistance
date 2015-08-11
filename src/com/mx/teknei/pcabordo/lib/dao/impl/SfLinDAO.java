/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.dao.ISfLinDAO;
import com.mx.teknei.pcabordo.lib.entities.SflnLin;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hjcacho
 */
public class SfLinDAO extends GenericDaoImp<SflnLin, Long> implements ISfLinDAO{

    @Override
    public List<SflnLin> listLineas() {
        List<SflnLin> sfLin = null;
         Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            sfLin = session.createQuery("from SflnLin").list();
        }catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        
        return sfLin;
    }
    
}
