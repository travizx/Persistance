/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mx.teknei.pcabordo.lib.service;

import com.mx.teknei.pcabordo.lib.entities.SfvhVehi;
import java.util.List;

/**
 * @author Heydrich
 */
public interface IVehiculoService {
    public void GuardarVehiculo(SfvhVehi veh);
    public void ActualizarVehiculo(SfvhVehi veh);
    public void EliminarVehiculo(SfvhVehi veh);
    public List<SfvhVehi> ListarVehiculo();
    public List<SfvhVehi> ObtenerPorPlaca(String matricula);
}
