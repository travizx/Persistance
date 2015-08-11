/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.ITipoPuntDAO;
import com.mx.teknei.pcabordo.lib.dao.impl.TipoPuntDAO;
import com.mx.teknei.pcabordo.lib.entities.SfmoTipu;
import com.mx.teknei.pcabordo.lib.service.ITipoPuntService;

/**
 *
 * @author hjcacho
 */
public class TipoPuntService implements ITipoPuntService{
    private ITipoPuntDAO tipoPunto;
    
    public TipoPuntService(){
        tipoPunto = new TipoPuntDAO();
    }

    @Override
    public void GuardadPunto(SfmoTipu punto) {
        tipoPunto.add(punto);
    } 
}
