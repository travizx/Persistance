/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SfvhVehi;
import java.util.List;

/**
 * @author Traviz Xixo <traviz.xixo at mazakuata.org>
 */
public interface IVehiculoDAO extends GenericDao<SfvhVehi, Long>{
    public List<SfvhVehi> listVehiculo();
    public List<SfvhVehi> getVehiculoForId(String matricula);
}
