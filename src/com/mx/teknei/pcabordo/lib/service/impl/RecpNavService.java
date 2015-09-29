/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.IRecpNavDAO;
import com.mx.teknei.pcabordo.lib.dao.impl.RecpNavDAO;
import com.mx.teknei.pcabordo.lib.entities.SfmoReceNave;
import com.mx.teknei.pcabordo.lib.service.IRecpNavService;
import java.util.List;
/**
 *
 * @author HAENCISO
 */
public class RecpNavService implements IRecpNavService{

    private IRecpNavDAO recpDAO;

    public RecpNavService() {
        recpDAO = new RecpNavDAO();
    }
    
    @Override
    public void GuardarRecpNav(SfmoReceNave recp) {
        try{
            recpDAO.add(recp);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void ActualizarRecpNav(SfmoReceNave recp) {
        recpDAO.update(recp);
    }

    @Override
    public void Eliminar(SfmoReceNave recp) {
        recpDAO.erase(recp);
    }

    @Override
    public List<SfmoReceNave> ListarRecpNav() {
        return recpDAO.listRecpNav();
    }

    @Override
    public SfmoReceNave buscarPorVehiculo(int idVehi) {
        return recpDAO.findByIdVehi(idVehi);
    }

    @Override
    public SfmoReceNave buscarPorRecpNav(int idRecpNav) {
        return recpDAO.findByIdRecpNav(idRecpNav);
    }

    @Override
    public SfmoReceNave ultimoRecpNav() {
        return recpDAO.lastRecpNav();
    }
    
}
