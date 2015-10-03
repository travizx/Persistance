
package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SfruRuta;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 2/10/2015
 * @class ISfruRutaDAO
 */
public interface ISfruRutaDAO extends GenericDao<SfruRuta, Long>{
    public List<SfruRuta> listRuta();
}
