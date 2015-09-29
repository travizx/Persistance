
package com.mx.teknei.pcabordo.lib.dao.impl;

import com.mx.teknei.pcabordo.lib.dao.IEmplCondDAO;
import com.mx.teknei.pcabordo.lib.entities.SfemCond;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static com.mx.teknei.pcabordo.lib.connection.LoadConnection.getSessionFactory;
import com.mx.teknei.pcabordo.lib.entities.SfpcCata;
import com.mx.teknei.pcabordo.lib.logger.Logg;
import org.hibernate.NonUniqueResultException;
import org.hibernate.Query;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 8/07/2015
 * @class EmplCondDAO
 */
public class EmplCondDAO extends GenericDaoImp<SfemCond, Long> implements IEmplCondDAO{

    
    @Override
    public List<SfemCond> listEmplConductor() {
        List<SfemCond> emplCond = null;
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            emplCond = session.createQuery("FROM SfemCond").list();
        } catch (Exception e) {
            //Logg.getInstance().fatal( this.getClass().getSimpleName()+"_listEmplConductor_"+e.getMessage() );
        }finally{
            session.flush();
            session.close();
        }
        return emplCond;
    }

    @Override
    public List<SfemCond> findUser(String user) {
        List<SfemCond> listUsersFound = null;
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query queryFindUserAndPass = session.createQuery("FROM SfemCond c WHERE c.userCond= :userName");
            queryFindUserAndPass.setParameter("userName", user);
            listUsersFound = queryFindUserAndPass.list();
        } catch (Exception e) {
           // Logg.getInstance().fatal( this.getClass().getSimpleName()+"_findUser_"+e.getMessage() );
        }finally{
            session.flush();
            session.close();
        }
        return listUsersFound;
    }

    @Override
    public SfemCond findUserAndPass(String user , String pass) {
        SfemCond conductor = null;
        Transaction trans = null;
        Session session = getSessionFactory().openSession();
        try {
            trans = session.beginTransaction();
            Query queryFindUserAndPass = session.createQuery("FROM SfemCond c WHERE c.userCond=: userName AND c.passCond=: passw");
            queryFindUserAndPass.setParameter("userName", user);
            queryFindUserAndPass.setParameter("passw", pass);
            conductor = (SfemCond)queryFindUserAndPass.uniqueResult();
        } catch(NonUniqueResultException nonE){
           // Logg.getInstance().fatal( this.getClass().getSimpleName()+"_findUserAndPass_"+nonE.getMessage() );
        }catch (Exception e) {
            //Logg.getInstance().fatal( this.getClass().getSimpleName()+"_findUserAndPass_"+e.getMessage() );
        }finally{
            session.flush();
            session.close();
        }
        if( conductor == null ){
            throw new RuntimeException("Two account found with same account number and type : Acc No-"+this.getClass().getSimpleName()+"_findUserAndPass" );
        }else{
            return conductor;
        }
        
    }

    
    
    
}
