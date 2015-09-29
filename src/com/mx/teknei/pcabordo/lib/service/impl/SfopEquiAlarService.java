/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service.impl;


import com.mx.teknei.pcabordo.lib.dao.impl.SfopEquiAlarDAO;
import com.mx.teknei.pcabordo.lib.entities.SfopEquiAlar;
import com.mx.teknei.pcabordo.lib.service.ISfopEquiAlarService;
import java.util.List;


/**
 *
 * @author ajimenez
 */
public class SfopEquiAlarService implements ISfopEquiAlarService{
   
private SfopEquiAlarDAO SfopEquiAlarDao;


public SfopEquiAlarService(){
    
    SfopEquiAlarDao =new SfopEquiAlarDAO();
} 


        
    @Override
    public List<SfopEquiAlar> SfopEquiAlar() {
       return SfopEquiAlarDao.listSfopEquiAlar();

}

   @Override
    public void GuardarIdOpeAlar(SfopEquiAlar opeqAlar) {
       SfopEquiAlarDao.add(opeqAlar);
    }
    
}
