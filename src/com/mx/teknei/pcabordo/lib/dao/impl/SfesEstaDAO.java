
package com.mx.teknei.pcabordo.lib.dao.impl;

import com.mx.teknei.pcabordo.lib.connection.LoadConnection;
import com.mx.teknei.pcabordo.lib.dao.ISfesEstaDAO;
import com.mx.teknei.pcabordo.lib.entities.SfesEst;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 2/10/2015
 * @class SfesEstaDAO
 */
public class SfesEstaDAO extends GenericDaoImp<SfesEst,Long> implements ISfesEstaDAO{

    @Override
    public List<SfesEst> listStation() {
        List<SfesEst> estacionesList = null;
        Transaction trans = null;
        Session session = LoadConnection.getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            estacionesList = session.createQuery("FROM SfesEst").list();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return estacionesList;
    }

}
