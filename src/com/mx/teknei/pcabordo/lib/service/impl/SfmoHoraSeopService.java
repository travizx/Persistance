/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.ISfmoHoraSeopDAO;
import com.mx.teknei.pcabordo.lib.dao.impl.SfmoHoraSeopDAO;
import com.mx.teknei.pcabordo.lib.entities.SfmoHoraSeop;
import com.mx.teknei.pcabordo.lib.service.ISfmoHoraSeopService;
import java.util.List;

/**
 *
 * @author ajimenez
 */
public class SfmoHoraSeopService implements ISfmoHoraSeopService {

    private ISfmoHoraSeopDAO SfmoHoraSeopDao;

    public SfmoHoraSeopService() {
        SfmoHoraSeopDao = new SfmoHoraSeopDAO();
    }

    @Override
    public List<SfmoHoraSeop> SfmoHoraSeop() {
        return SfmoHoraSeopDao.SfmoHoraSeop();
    }

}
