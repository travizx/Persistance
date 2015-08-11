
package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SfpcCata;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 26/07/2015
 * @class ICataDAO
 */
public interface ICataDAO extends GenericDao<SfpcCata, Long>{
    public SfpcCata findCataByID(Integer id_cata);
    public List<SfpcCata> findCataByCodCort(String cod_cata, String cod_cort);
}
