/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service.impl;


import com.mx.teknei.pcabordo.lib.dao.impl.SbctAlarDAO;
import com.mx.teknei.pcabordo.lib.entities.SbctAlar;
import com.mx.teknei.pcabordo.lib.service.ISbctAlarService;
import java.util.List;

/**
 *
 * @author ajimenez
 */
public class SbctAlarService implements ISbctAlarService{
    
    private SbctAlarDAO alarDao;
    
    public SbctAlarService(){
        
        alarDao = new SbctAlarDAO();
    
}

    @Override
    public SbctAlar getAlarForName(String nameAlar) {
        
        return alarDao.getAlarForName(nameAlar);
        
    }

    @Override
    public List<SbctAlar> ListarAlarmas() {
        return alarDao.listAlar();
    }

   


   
   
    
    

    
}
