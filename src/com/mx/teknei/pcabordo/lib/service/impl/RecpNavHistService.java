    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service.impl;

import com.mx.teknei.pcabordo.lib.dao.IRecpNavHistDAO;
import com.mx.teknei.pcabordo.lib.dao.impl.RecpNavHistDAO;
import com.mx.teknei.pcabordo.lib.entities.SfmoHistReceNave;
import com.mx.teknei.pcabordo.lib.service.IRecpNavHistService;
import java.util.Date;
import java.util.List;



/**
 *
 * @author hjcacho
 */
public class RecpNavHistService implements IRecpNavHistService{
    
    private IRecpNavHistDAO recpNavHistDAO;
    
    public RecpNavHistService(){
        recpNavHistDAO=new RecpNavHistDAO();
    }
    @Override
    public void GuardarRecpNav(SfmoHistReceNave recp) {
        recpNavHistDAO.add(recp);
    }

    @Override
    public void ActualizarRecpNav(SfmoHistReceNave recp) {
        recpNavHistDAO.update(recp);
    }

    @Override
    public void Eliminar(SfmoHistReceNave recp) {
        recpNavHistDAO.erase(recp);
    }

    @Override
    public List<SfmoHistReceNave> ListarHisRecpNav() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<SfmoHistReceNave> listCicloReco(Date hora1, Date hora2, int idVehiculo) {
        return recpNavHistDAO.listCicloReco(hora1, hora2, idVehiculo);
    }
    
    
}
