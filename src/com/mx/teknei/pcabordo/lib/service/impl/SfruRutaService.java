
package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.ISfruRutaDAO;
import com.mx.teknei.pcabordo.lib.dao.impl.SfruRutaDao;
import com.mx.teknei.pcabordo.lib.entities.SfruRuta;
import com.mx.teknei.pcabordo.lib.service.ISfruRutaService;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 2/10/2015
 * @class SfruRuta
 */
public class SfruRutaService implements ISfruRutaService{

    private ISfruRutaDAO rutaDAO;

    public SfruRutaService() {
        this.rutaDAO = new SfruRutaDao();
    }
    
    
    @Override
    public List<SfruRuta> ListarRutas() {
        return rutaDAO.listRuta();
    }
    
}
