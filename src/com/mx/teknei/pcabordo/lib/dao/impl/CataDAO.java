
package com.mx.teknei.pcabordo.lib.dao.impl;

import com.mx.teknei.pcabordo.lib.connection.LoadConnection;
import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.dao.ICataDAO;
import com.mx.teknei.pcabordo.lib.entities.SfpcCata;
import com.mx.teknei.pcabordo.lib.logger.Logg;
import java.util.List;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 26/07/2015
 * @class CataDAO
 */
public class CataDAO extends GenericDaoImp<SfpcCata, Long> implements ICataDAO{

    @Override
    public SfpcCata findCataByID(Integer id_cata) {
        SfpcCata cata = null;
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
            Query queryFindCata = session.createQuery("FROM SfpcCata p WHERE p.idCata=:id_cata");
            queryFindCata.setParameter("id_cata", id_cata);
            cata = (SfpcCata)queryFindCata.uniqueResult();
        } catch (NonUniqueResultException nonE) {
            //Logg.getInstance().fatal( this.getClass().getSimpleName()+"_findCataByID_"+nonE.getMessage() );
        } catch (Exception e) {
            //Logg.getInstance().fatal( this.getClass().getSimpleName()+"_findCataByID_"+e.getMessage() );
        }finally {
            session.flush();
            session.close();
        }
        if( cata == null ){
            throw new RuntimeException("Por alguna razón existe otro id_cata-"+this.getClass().getSimpleName()+"_findCataByID" );
        }else{
            return cata;
        }
    }

    @Override
    public List<SfpcCata> findCataByCodCort(String cod_cata,String cod_cort) {
        List<SfpcCata> listCata = null;
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
            Query queryFindCodCata = session.createQuery("FROM SfpcCata c WHERE c.codCata=:cod_cata AND c.codCort=:cod_cort");
            queryFindCodCata.setParameter("cod_cata", cod_cata);
            queryFindCodCata.setParameter("cod_cort", cod_cort);
            listCata = queryFindCodCata.list();
        } catch (Exception e) {
            //Logg.getInstance().fatal( this.getClass().getSimpleName()+"_findCataByCodCata_"+e.getMessage() );
        }finally{
            session.flush();
            session.close();
        }
        System.out.println(listCata.size());
        if(listCata == null || listCata.size() <= 0) {
            throw new RuntimeException("No manda esto!!!!");
        }else{
            return listCata;
        }
    } 
    
    
    
    

}
