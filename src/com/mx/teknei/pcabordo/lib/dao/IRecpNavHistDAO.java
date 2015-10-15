/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SfmoHistReceNave;
import java.util.Date;
import java.util.List;


/**
 *
 * @author hjcacho
 */
public interface IRecpNavHistDAO extends GenericDao<SfmoHistReceNave, Long>{
    public List<SfmoHistReceNave> listHisRecpNav();
    public List<SfmoHistReceNave> listCicloReco(Long hora1, Long hora2, int idVehiculo);
}
