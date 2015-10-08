/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.ISfpfItinDAO;
import com.mx.teknei.pcabordo.lib.dao.impl.SfpfItinDAO;
import com.mx.teknei.pcabordo.lib.entities.SfpfItin;
import com.mx.teknei.pcabordo.lib.service.ISfpfItinService;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ajimenez
 */
public class SfpfItinService implements ISfpfItinService {
    
    ISfpfItinDAO itinDAO;

    public SfpfItinService() {
        this.itinDAO = new SfpfItinDAO();
    }
    
    @Override
    public List<SfpfItin> ObtenerItinEntreRangoFecha(Long dateMore, Long dateLess,int id_Ruta ,int id_Estado) {
        return itinDAO.compareTwoDatesInHora_Sali(dateMore, dateLess,id_Ruta,id_Estado);
    }

    @Override
    public void  ActivarItinera(SfpfItin itinerario) {
         itinDAO.update(itinerario);
    }

    @Override
    public void CerrarItinerario(SfpfItin itinerario) {
        itinDAO.update(itinerario);
    }

    @Override
    public SfpfItin BuscarItinPorID(int id) {
        return itinDAO.findByID(id);
    }

    @Override
    public List<SfpfItin> BuscarVehiPorID(Integer idVehi) {
        return itinDAO.findIdVehiculo(idVehi);
    }

    @Override
    public void updateKmRecorridos(int idVehi, Date hora1, Date hora2, double kmReco) {
        itinDAO.updateKmRecorridos(idVehi, hora1, hora2, kmReco);
    }

    


    
}
