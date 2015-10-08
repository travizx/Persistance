/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SfpfItin;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ajimenez
 */
public interface ISfpfItinDAO extends GenericDao<SfpfItin, Long> {

    public List<SfpfItin> listaItin();
    public List<SfpfItin> getIdItinForEsta(int idEsta);
    public List<SfpfItin> compareTwoDatesInHora_Sali(Long dateMore, Long dateLess,int id_Ruta ,int id_Estado);
    public SfpfItin findByID(int id);
    public void updateKmRecorridos(int idVehi, Date hora1, Date hora2,double kmReco);
    public List<SfpfItin>findIdVehiculo(int idVehi);

}
