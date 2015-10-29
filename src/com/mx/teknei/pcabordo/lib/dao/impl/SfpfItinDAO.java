/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao.impl;

import com.mx.teknei.pcabordo.lib.connection.LoadConnection;
import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.dao.ISfpfItinDAO;
import com.mx.teknei.pcabordo.lib.entities.SfpfItin;
import com.mx.teknei.pcabordo.lib.entities.SfruRuta;
import com.mx.teknei.pcabordo.lib.entities.SfvhVehi;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ajimenez
 */
public class SfpfItinDAO extends GenericDaoImp<SfpfItin, Long> implements ISfpfItinDAO {

    @Override
    public List<SfpfItin> getIdItinForEsta(int idEsta) {

        List<SfpfItin> itin = null;
        Transaction tran = null;
        Session session = getSessionFactory().openSession();
        try {

            tran = session.beginTransaction();
            Query query = session.createQuery("from SfpfItin E WHERE E.idEsta = :idEsta");
            query.setParameter("idEsta", idEsta);
            itin = query.list();
            return null;
        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            session.close();
            session.flush();

        }
        return itin;

    }

    @Override
    public List<SfpfItin> listaItin() {
        List<SfpfItin> itin = null;
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            itin = session.createQuery("from SfpfItin").list();
        } catch (Exception e) {
            System.out.println("-ERROR DAO:"+e.getMessage()+"--"+this.getClass().getSimpleName());
        } finally {
            session.flush();
            session.close();
        }
        return itin;

    }

    @Override
    public List<SfpfItin> compareTwoDatesInHora_Sali(Long dateMore, Long dateLess,int id_Ruta ,int id_Estado) {
        List<SfpfItin> itin = null;
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
                Query query = session.createQuery("FROM SfpfItin AS c WHERE c.horaSaliItin BETWEEN :stDate AND :edDate AND sfruRuta = :ruta AND idEsta = :id_esta");//AND sfruRuta = :ruta AND idEsta = :id_esta"
                query.setTimestamp("stDate", new Timestamp(dateMore));
                query.setTimestamp("edDate", new Timestamp(dateLess));
                SfruRuta rutaEnty = new SfruRuta();
                rutaEnty.setIdRuta(id_Ruta);
                query.setParameter("ruta", rutaEnty);
                query.setParameter("id_esta", id_Estado);
                itin = query.list();

        } catch (Exception e) {
            System.out.println("-ERROR DAO:"+e.getMessage()+"--"+this.getClass().getSimpleName());
        } finally {
            session.close();
        }
        return itin;
    }

    @Override
    public SfpfItin findByID(int id) {
        SfpfItin intiEnty = null;
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
            Query query = session.createQuery("FROM SfpfItin s WHERE s.idItin= :idITIN");
            query.setParameter("idITIN", id);
            intiEnty = (SfpfItin)query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.close();
        }
        
        return intiEnty;
    }

    @Override
    public void updateKmRecorridos(int idVehi, Date hora1, Date hora2, double kmReco) {
        Session session = null;
        try {
            session = LoadConnection.getSessionFactory().openSession();
        } catch (ExceptionInInitializerError eiie){
            System.out.println("Error al iniciar la coneccion a BD postgres:"+eiie.getMessage()); 
        } catch (Exception e) {
            System.err.println("Error en LoadConnection."+e.getMessage());
        }
        try {
            Transaction tran = session.beginTransaction(); 
            SfvhVehi vehi = new SfvhVehi();
            vehi.setIdVehi(idVehi);
            Query query = session.createQuery("update SfpfItin set kmReco = :kmReco"
                    + " where sfvhVehi = :sfvhVehi AND horaSaliRealItin =  :horaSaliRealItin AND horaLlegRealItin= :horaLlegRealItin AND idEsta ='3'");

            System.out.println("Valor de km" + " " + kmReco);
            query.setParameter("kmReco", kmReco);
            query.setParameter("sfvhVehi", vehi);
            System.out.println("Valor de vehi" + " " + vehi.getIdVehi());
            query.setParameter("horaSaliRealItin", hora1);
            query.setParameter("horaLlegRealItin", hora2);
            int result = query.executeUpdate();
            tran.commit();
            System.out.println("Valor de result" + " " + result);
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    @Override
    public List<SfpfItin> findIdVehiculo(int idVehi) {
        List<SfpfItin> itin = null;
        Transaction tran = null;
        Session session = null;
        try {
            session = LoadConnection.getSessionFactory().openSession();
        } catch (ExceptionInInitializerError eiie){
            System.out.println("Error al iniciar la coneccion a BD postgres:"+eiie.getMessage()); 
        } catch (Exception e) {
            System.err.println("Error en LoadConnection."+e.getMessage());
        }
        try {

            tran = session.beginTransaction();
            Query query = session.createSQLQuery("select * from sitm.sfpf_itin e WHERE e.id_vehi = ?")
                    .addEntity(SfpfItin.class)
                    .setParameter(0, idVehi);

            itin = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return itin;
    }

    
    
    

}
