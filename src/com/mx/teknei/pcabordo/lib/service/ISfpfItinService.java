/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service;
import com.mx.teknei.pcabordo.lib.entities.SfmoReceNave;
import com.mx.teknei.pcabordo.lib.entities.SfpfItin;
import java.util.List;

/**
 *
 * @author ajimenez
 */
public interface ISfpfItinService {
    
    public void GuardarItinera(SfpfItin itin);
    public void ActualizarItinera(SfpfItin itin);
    public void EliminarItinera(SfpfItin itin);
    public List<SfmoReceNave> ListarItinera();
    public List<SfmoReceNave> ObtenerPorIdEsta(int idEsta);
    
}
