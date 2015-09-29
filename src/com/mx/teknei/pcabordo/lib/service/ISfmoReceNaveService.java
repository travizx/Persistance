/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service;


import com.mx.teknei.pcabordo.lib.entities.SfmoReceNave;
import java.util.List;

/**
 *
 * @author ajimenez
 */
public interface ISfmoReceNaveService {
    public void GuardarreceNave(SfmoReceNave receNave);
    public void ActualizarreceNave(SfmoReceNave receNave);
    public void EliminarVehiculo(SfmoReceNave receNave);
    public List<SfmoReceNave> ListarVehiculo();
    public List<SfmoReceNave> ObtenerPorIdVehi(int idVehi);
    
}
