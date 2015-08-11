
package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SfemCond;
import com.mx.teknei.pcabordo.lib.entities.SfpcCata;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 8/07/2015
 * @class IEmplCondDAO
 */
public interface IEmplCondDAO extends GenericDao<SfemCond, Long>{
    public List<SfemCond> listEmplConductor();
    public List<SfemCond> findUser(String user);
    public SfemCond findUserAndPass(String user , String pass);
}
