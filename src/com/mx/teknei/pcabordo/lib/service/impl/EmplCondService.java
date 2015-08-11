package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.ICataDAO;
import com.mx.teknei.pcabordo.lib.dao.IEmplCondDAO;
import com.mx.teknei.pcabordo.lib.dao.impl.CataDAO;
import com.mx.teknei.pcabordo.lib.dao.impl.EmplCondDAO;
import com.mx.teknei.pcabordo.lib.entities.SfemCond;
import com.mx.teknei.pcabordo.lib.entities.SfpcCata;
import com.mx.teknei.pcabordo.lib.service.IEmplCondService;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 8/07/2015
 * @class EmplCondService
 */
public class EmplCondService implements IEmplCondService {
    
    private final IEmplCondDAO emplDAO;
    private final ICataDAO cataDAO;

    public EmplCondService() {
        emplDAO = new EmplCondDAO();
        cataDAO = new CataDAO();
    }

    @Override
    public List<SfemCond> ListarEmplCond() {
        return emplDAO.listEmplConductor();
    }
    
    
    @Override
    public SfemCond BuscarDatosLogin(String usuario, String contrasenia) {
        return emplDAO.findUserAndPass(usuario, contrasenia);
    }

    @Override
    public List<SfemCond> BuscarUsuario(String usuario) {
        return emplDAO.findUser(usuario);
    }

    @Override
    public SfpcCata RecuperarLlaveForanea(SfpcCata cata) {
        return cataDAO.findCataByID(cata.getIdCata() );
    }

}
