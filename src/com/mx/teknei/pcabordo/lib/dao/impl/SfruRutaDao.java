
package com.mx.teknei.pcabordo.lib.dao.impl;

import com.mx.teknei.pcabordo.lib.connection.LoadConnection;
import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.dao.ISfruRutaDAO;
import com.mx.teknei.pcabordo.lib.entities.SfmoReceNave;
import com.mx.teknei.pcabordo.lib.entities.SfruRuta;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 2/10/2015
 * @class SfruRutaDao
 */
public class SfruRutaDao extends GenericDaoImp<SfruRuta, Long> implements ISfruRutaDAO{

    @Override
    public List<SfruRuta> listRuta() {
        List<SfruRuta> rutaList = null;
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
            rutaList = session.createQuery("FROM SfruRuta").list();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        
        return rutaList;
    }

}
