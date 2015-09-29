/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.impl.SfalConfDAO;
import com.mx.teknei.pcabordo.lib.entities.SfalConf;
import com.mx.teknei.pcabordo.lib.service.ISfalConfService;
import java.util.List;

/**
 *
 * @author ajimenez
 */
public class SfalConfService implements ISfalConfService {

    private SfalConfDAO SfalConfDao;

    public SfalConfService() {

        SfalConfDao = new SfalConfDAO();

    }

    @Override
    public SfalConf getAlarConfForName(String nameConfAlar) {

        return SfalConfDao.getAlarConfForName(nameConfAlar);
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
