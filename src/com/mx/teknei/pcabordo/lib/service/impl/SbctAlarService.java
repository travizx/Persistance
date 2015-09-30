/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service.impl;


import com.mx.teknei.pcabordo.lib.dao.impl.SbctAlarDAO;
import com.mx.teknei.pcabordo.lib.entities.SbctAlar;
import com.mx.teknei.pcabordo.lib.service.ISbctAlarService;

/**
 *
 * @author ajimenez
 */
public class SbctAlarService implements ISbctAlarService{
    
    private SbctAlarDAO SbctAlarDao;
    
    public SbctAlarService(){
        
        SbctAlarDao =new SbctAlarDAO();
    
}

    @Override
    public SbctAlar getAlarForName(String nameAlar) {
        
        return SbctAlarDao.getAlarForName(nameAlar);
        
    }

   


   
   
    
    

    
}
