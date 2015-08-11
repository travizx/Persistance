
package com.mx.teknei.pcabordo.lib.service;

import com.mx.teknei.pcabordo.lib.entities.SfemCond;
import com.mx.teknei.pcabordo.lib.entities.SfpcCata;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 27/07/2015
 * @class ICataService
 */
public interface ICataService {
    public SfpcCata buscarPorID(Integer id_cata);
    public List<SfpcCata> buscarCodCorto(String cod_cata,String cod_cort);
    public boolean bloquearConductor(SfemCond cond);
    public boolean desbloquearConductor(SfemCond cond);
    
}
