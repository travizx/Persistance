
package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.IHoseFlotDAO;
import com.mx.teknei.pcabordo.lib.dao.impl.HoseFlotDAO;
import com.mx.teknei.pcabordo.lib.entities.SfgfHoseFlot;
import com.mx.teknei.pcabordo.lib.service.IHoseFlotService;
import java.util.Date;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 9/08/2015
 * @class HoseFLotService
 */
public class HoseFLotService implements IHoseFlotService{

    private final IHoseFlotDAO hoseFlotDAO;
    public HoseFLotService() {
        this.hoseFlotDAO = new HoseFlotDAO();
    }

    @Override
    public SfgfHoseFlot buscarPorID(Integer id_hora_flot) {
        return hoseFlotDAO.findHoseFlotByID(id_hora_flot);
    }

    @Override
    public List<SfgfHoseFlot> buscarPorFecha(Date date) {
        return hoseFlotDAO.findHoseFlotByDay(date);
    }

    
}
