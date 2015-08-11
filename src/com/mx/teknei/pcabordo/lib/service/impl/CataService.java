package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.ICataDAO;
import com.mx.teknei.pcabordo.lib.dao.impl.CataDAO;
import com.mx.teknei.pcabordo.lib.entities.SfemCond;
import com.mx.teknei.pcabordo.lib.entities.SfpcCata;
import com.mx.teknei.pcabordo.lib.service.ICataService;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 27/07/2015
 * @class CataService
 */
public class CataService implements ICataService {

    private final ICataDAO cataDao;
    private final static String COD_CORT_BLOQ = "bloqueado";
    private final static String COD_CORT_PRI_INT = "intento_1";
    private final static String COD_CORT_SEG_INT = "intento_2";
    private final static String COD_CORT_DESBLOQ = "desbloqueado";

    public CataService() {
        this.cataDao = new CataDAO();
    }

    /**
     * Servicio para encontrar el objeto SfpcCata a partir de un ID
     * @param id_cata Parametro en Integer para encontrar por ID
     * @return Retorna el objeto SfpcCata encontrado y si no manda una excepción 
     * RuntimeException.
     */
    @Override
    public SfpcCata buscarPorID(Integer id_cata) {
        return cataDao.findCataByID(id_cata);
    }
    
    /**
     * Servicio para encontrar coincidencia entre cod_cata y un cod_cort
     * @param cod_cata Parametro String para que compare con cod_cort
     * @param cod_cort Parametro String para que compare con cod_cata
     * @return Retornar una lista de SfpcCata de los que haya encontrado apartir de los dos parametros.
     * @throws RuntimeException 
     */
    @Override
    public List<SfpcCata> buscarCodCorto(String cod_cata, String cod_cort)throws RuntimeException{
        return cataDao.findCataByCodCort(cod_cata, cod_cort);
    }

    /**
     * Servicio que bloqueara al conductor que se le pase como parametro
     *
     * @param cond Obtiene el Entity de tipo condctor el cual se quiere bloquear
     * @return Retorna "true" si el conductor si pudo bloquearse exitosamente y
     * Retorna "false" si el conductor no se pudo bloquear exitosamente.
     */
    @Override
    public boolean bloquearConductor(SfemCond cond) {
        return true;
    }

    @Override
    public boolean desbloquearConductor(SfemCond cond) {
        return false;
    }

}
