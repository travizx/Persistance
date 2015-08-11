
package com.mx.teknei.pcabordo.lib.dao.impl;

import com.mx.teknei.pcabordo.lib.dao.IHoseFlotDAO;
import com.mx.teknei.pcabordo.lib.entities.SfgfHoseFlot;
import org.hibernate.Transaction;
import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.logger.Logg;
import java.util.Date;
import java.util.List;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 5/08/2015
 * @class HoseFlotDAO
 */
public class HoseFlotDAO extends GenericDaoImp<SfgfHoseFlot, Long> implements IHoseFlotDAO{

    @Override
    public SfgfHoseFlot findHoseFlotByID(Integer id_hose_flot) {
        SfgfHoseFlot hoseFlot = null;
        Transaction trans = null;
        Session session  = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query queryFindID = session.createQuery("FROM SfgfHoseFlot h WHERE h.idHoraServ=:id_hora_serv");
            queryFindID.setParameter("id_hora_serv", id_hose_flot);
            hoseFlot = (SfgfHoseFlot)queryFindID.uniqueResult();
        } catch (NonUniqueObjectException nonE) {
             Logg.getInstance().fatal( this.getClass().getSimpleName()+"_returnCataByID_"+nonE.getMessage() );
        }catch (Exception e){
            Logg.getInstance().fatal( this.getClass().getSimpleName()+"_returnCataByID_"+e.getMessage() );
        }finally{
            session.flush();
            session.close();
        }
        if(hoseFlot == null){
            throw new RuntimeException("Existe un otro id_hose_flot"+this.getClass().getSimpleName()+"_findHoseFlotByID");
        }else{
            return hoseFlot;
        }
    }

    @Override
    public List<SfgfHoseFlot> findHoseFlotByDay(Date date) {
        List<SfgfHoseFlot> listHoseFlot = null;
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query queryFindByDay = session.createQuery("FROM SfgfHoseFlot h WHERE h.fchOper=:fecha_Find");
            queryFindByDay.setDate("fecha_Find", date);
            listHoseFlot = queryFindByDay.list();
        } catch (Exception e) {
            Logg.getInstance().info( this.getClass().getSimpleName()+"_findCataByCodCata_"+e.getMessage() );
        }finally{
            session.flush();
            session.close();
        }
        if(listHoseFlot == null || listHoseFlot.size() <= 0) {
            throw new RuntimeException("-"+this.getClass().getSimpleName()+"_findHoseFlotByDay_"+"No se encontro ningun resultado");
        }else{
            return listHoseFlot;
        }
     }
    
    
    
}
