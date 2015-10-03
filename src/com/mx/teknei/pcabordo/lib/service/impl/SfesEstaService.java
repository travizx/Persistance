
package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.ISfesEstaDAO;
import com.mx.teknei.pcabordo.lib.dao.impl.GenericDaoImp;
import com.mx.teknei.pcabordo.lib.dao.impl.SfesEstaDAO;
import com.mx.teknei.pcabordo.lib.entities.SfesEst;
import com.mx.teknei.pcabordo.lib.service.ISfesEstaService;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 2/10/2015
 * @class Isfes_estService
 */
public class SfesEstaService implements ISfesEstaService{

    private ISfesEstaDAO estaDAO;

    public SfesEstaService() {
        this.estaDAO = new SfesEstaDAO();
    }
    
    @Override
    public List<SfesEst> ListarEstaciones() {
        return estaDAO.listStation();
    }
    
}
