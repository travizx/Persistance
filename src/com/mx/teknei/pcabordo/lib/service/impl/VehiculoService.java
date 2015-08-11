/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.impl.VehiculoDAO;
import com.mx.teknei.pcabordo.lib.entities.SfvhVehi;
import com.mx.teknei.pcabordo.lib.service.IVehiculoService;
import java.util.List;

/**
 * @author Heydrich
 */
public class VehiculoService implements IVehiculoService{

    private VehiculoDAO vehiculoDao;

    public VehiculoService() {
        vehiculoDao = new VehiculoDAO();
    }
    
    @Override
    public void GuardarVehiculo(SfvhVehi veh) {
        vehiculoDao.add(veh);
    }

    @Override
    public void ActualizarVehiculo(SfvhVehi veh) {
        vehiculoDao.update(veh);
    }

    @Override
    public void EliminarVehiculo(SfvhVehi veh) {
        vehiculoDao.erase(veh);
    }

    @Override
    public List<SfvhVehi> ListarVehiculo() {
        return vehiculoDao.listVehiculo();
    }

    @Override
    public List<SfvhVehi> ObtenerPorPlaca(String matricula) {
        return vehiculoDao.getVehiculoForId(matricula);
    }

}
    