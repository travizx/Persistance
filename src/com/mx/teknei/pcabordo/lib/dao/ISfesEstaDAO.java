
package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SfesEst;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 2/10/2015
 * @class ISfesEstaDAO
 */
public interface ISfesEstaDAO extends GenericDao<SfesEst, Long>{
    public List<SfesEst> listStation();
}
