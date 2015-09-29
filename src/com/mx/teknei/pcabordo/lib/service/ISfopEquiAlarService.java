/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service;

import com.mx.teknei.pcabordo.lib.entities.SfopEquiAlar;
import java.util.List;

/**
 *
 * @author ajimenez
 */
public interface ISfopEquiAlarService{
   
    public List<SfopEquiAlar>SfopEquiAlar();
   public void GuardarIdOpeAlar(SfopEquiAlar opeqAlar);
    
}
