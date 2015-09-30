/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SfmoHoraSeop;

import java.util.List;

/**
 *
 * @author ajimenez
 */
public interface ISfmoHoraSeopDAO extends GenericDao<SfmoHoraSeop, Long> {

    public List<SfmoHoraSeop>SfmoHoraSeop();
    public SfmoHoraSeop getSfmoHoraSeopForName(String nameHora);
    

  

}
