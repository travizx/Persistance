/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service;
import com.mx.teknei.pcabordo.lib.entities.SfpfItin;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ajimenez
 */
public interface ISfpfItinService {
    
   
    
    public List<SfpfItin> ObtenerItinEntreRangoFecha(Long dateMore, Long dateLess,int id_Ruta ,int id_Estado);
    public void  ActivarItinera(SfpfItin itinerario);
    public void  CerrarItinerario(SfpfItin itinerario);
    public SfpfItin BuscarItinPorID(int id);
    public List<SfpfItin> BuscarVehiPorID(Integer idVehi);
    public void updateKmRecorridos(int idVehi, Date hora1, Date hora2, double kmReco);
    
}
