/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service;

import com.mx.teknei.pcabordo.lib.entities.SfmoHistReceNave;
import java.util.Date;
import java.util.List;


/**
 *
 * @author hjcacho
 */
public interface IRecpNavHistService {
    void GuardarRecpNav(SfmoHistReceNave recp);
    void ActualizarRecpNav(SfmoHistReceNave recp);
    void Eliminar(SfmoHistReceNave recp);
    public List<SfmoHistReceNave> ListarHisRecpNav();
    public List<SfmoHistReceNave> listCicloReco(Date hora1, Date hora2, int idVehiculo);
}
