/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.service;

import com.mx.teknei.pcabordo.lib.entities.SfmoReceNave;
import com.mx.teknei.pcabordo.lib.entities.SfmoTipu;
import java.util.List;

/**
 *
 * @author hjcacho
 */
public interface ITipoPuntService {
    public void GuardadPunto(SfmoTipu punto);
    public List<SfmoTipu> ListarTipoPunto();
}
