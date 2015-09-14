/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.dao.IRecpNavDAO;
import java.util.ArrayList;
import java.util.List;
import com.mx.teknei.pcabordo.lib.entities.SfmoReceNave;
import com.mx.teknei.pcabordo.lib.logger.Logg;
import org.hibernate.Criteria;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

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

    @Override
    public SfmoReceNave findByIdVehi(int idVehi) {
        SfmoReceNave recpnav = null;
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Criteria crit = session.createCriteria(SfmoReceNave.class);
            Criteria vehi = crit.createCriteria("sfvhVehi");
            vehi.add(Restrictions.eq("idVehi", idVehi));
            recpnav = (SfmoReceNave)crit.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            trans.commit();
            session.flush();
            session.close();
        }
        
        return recpnav;
    }

    @Override
    public SfmoReceNave lastRecpNav() {
        SfmoReceNave rec_nav = null;
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
//            Query queryFindCata = session.createQuery("FROM SfmoReceNave r ORDER BY r.idRecoNave DESC LIMIT 1");
            Query queryFindLastRec = session.createQuery("FROM SfmoReceNave r ORDER BY r.idRecoNave DESC");
            queryFindLastRec.setMaxResults(1);
            queryFindLastRec.setFirstResult(0);
            rec_nav = (SfmoReceNave)queryFindLastRec.uniqueResult();
        } catch (NonUniqueResultException nonE) {
            Logg.getInstance().fatal( this.getClass().getSimpleName()+"_lastRecpNav_"+"Error No es el unico REGISTRO que regreso la BD_"+nonE.getMessage() );
        } catch (Exception e) {
            Logg.getInstance().fatal( this.getClass().getSimpleName()+"_lastRecpNav_"+e.getMessage() );
        }finally {
            session.flush();
            session.close();
        }
        if( rec_nav == null ){
            throw new RuntimeException("NO HAY NINGUNA COORDENADA EN LA BD_"+this.getClass().getSimpleName()+"_lastRecpNav" );
        }else{
            return rec_nav;
        }
    }

    @Override
    public SfmoReceNave findByIdRecpNav(int idRecpNav) {
        SfmoReceNave recpnav = null;
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Criteria crit = session.createCriteria(SfmoReceNave.class);
            crit.add(Restrictions.eq("idRecoNave", idRecpNav));
            recpnav = (SfmoReceNave)crit.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return recpnav;
    }
    
}
