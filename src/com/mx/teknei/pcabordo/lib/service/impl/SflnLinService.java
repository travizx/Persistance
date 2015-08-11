/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.ISfLinDAO;
import com.mx.teknei.pcabordo.lib.dao.impl.SfLinDAO;
import com.mx.teknei.pcabordo.lib.entities.SflnLin;
import com.mx.teknei.pcabordo.lib.service.ISfLinService;
import java.util.List;

/**
 *
 * @author hjcacho
 */
public class SflnLinService implements ISfLinService{
    private ISfLinDAO lineaDAO;
    
    public SflnLinService() {
        lineaDAO = new SfLinDAO();
    }
    @Override
    public List<SflnLin> ListarLineas() {
        return lineaDAO.listLineas();
    }
    
    
}
