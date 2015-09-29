/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SfopEquiAlar;
import java.util.List;

/**
 *
 * @author ajimenez
 */
public interface ISfopEquiAlarDAO extends GenericDao<SfopEquiAlar, Long>{
    
    public List<SfopEquiAlar> listSfopEquiAlar();
    public List<SfopEquiAlar> getSfopEquiAlarForId(int idOpeqAlar);
 
 
    
}
