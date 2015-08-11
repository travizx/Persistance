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
 * @author HAENCISO
 */
public interface IRecpNavService {
    public void GuardarRecpNav(SfmoReceNave recp);
    public void ActualizarRecpNav(SfmoReceNave recp);
    public void EliminarCursos(SfmoReceNave recp);
    public List<SfmoReceNave> ListarRecpNav();
}
