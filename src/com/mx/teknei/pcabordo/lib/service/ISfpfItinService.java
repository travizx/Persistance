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
    
   
    public void ActualizarItinera(SfpfItin itin);
    public List<SfpfItin> ListaItin();
    public List<SfpfItin> ObtenerPorIdEsta(int idEsta);
    
}
