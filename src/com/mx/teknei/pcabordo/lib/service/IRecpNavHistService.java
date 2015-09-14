/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service;

import com.mx.teknei.pcabordo.lib.entities.SfmoHistReceNave;


/**
 *
 * @author hjcacho
 */
public interface IRecpNavHistService {
    void GuardarRecpNav(SfmoHistReceNave recp);
    void ActualizarRecpNav(SfmoHistReceNave recp);
    void Eliminar(SfmoHistReceNave recp);
}
