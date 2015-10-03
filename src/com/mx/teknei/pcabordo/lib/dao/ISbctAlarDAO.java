/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SbctAlar;
import java.util.List;


/**
 *
 * @author ajimenez
 */
public interface ISbctAlarDAO extends GenericDao<SbctAlar, Long>{
   public SbctAlar getAlarForName(String nameAlar);
   public List<SbctAlar> listAlar();
}

