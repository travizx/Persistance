/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mx.teknei.pcabordo.lib.dao.impl;

import com.mx.teknei.pcabordo.lib.connection.LoadConnection;
import com.mx.teknei.pcabordo.lib.dao.IVehiculoDAO;
import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.entities.SfvhVehi;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * @author Traviz Xixo <traviz.xixo at mazakuata.org>
 */
public class VehiculoDAO extends GenericDaoImp<SfvhVehi, Long> implements IVehiculoDAO{

    @Override
    public List<SfvhVehi> listVehiculo() {
        List<SfvhVehi> vehiculo = new ArrayList<>();
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
            vehiculo = session.createQuery("from SfvhVehi").list();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return vehiculo;
    }
    
    public List<SfvhVehi> getVehiculoForId(String matricula){
        List<SfvhVehi> vehiculo = new ArrayList<>();
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
            Query query = session.createQuery("from SfvhVehi E WHERE E.placVehi = :placa_vehiculo");
            query.setParameter("placa_vehiculo", matricula);
            vehiculo = query.list();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.flush();
            session.close();
        }
        return  vehiculo;
    }
    
}
