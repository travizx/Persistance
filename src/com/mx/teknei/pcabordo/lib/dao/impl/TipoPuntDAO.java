/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.dao.ITipoPuntDAO;
import com.mx.teknei.pcabordo.lib.entities.SfmoReceNave;
import com.mx.teknei.pcabordo.lib.entities.SfmoTipu;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hjcacho
 */
public class TipoPuntDAO extends GenericDaoImp<SfmoTipu, Long> implements ITipoPuntDAO {

    @Override
    public List<SfmoTipu> listTipoPunto() {
        List<SfmoTipu> tipoPunto = new ArrayList<>();
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            tipoPunto = session.createQuery("from SfmoTipu").list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }

        return tipoPunto;
    }

}
