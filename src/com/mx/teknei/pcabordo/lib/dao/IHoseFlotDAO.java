
package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SfgfHoseFlot;
import java.util.Date;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 3/08/2015
 * @class IHoseFlotDAO
 */
public interface IHoseFlotDAO extends GenericDao<SfgfHoseFlot, Long>{

    public SfgfHoseFlot findHoseFlotByID(Integer id_hose_flot);
    public List<SfgfHoseFlot> findHoseFlotByDay(Date date);
    
    
}
