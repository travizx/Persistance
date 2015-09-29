/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SfmoReceNave;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author ajimenez
 */
public interface ISfmoReceNaveDAO extends GenericDao<SfmoReceNave, Long>{
    
    public List<SfmoReceNave>listSfmoReceNave();
    public List<SfmoReceNave> getIdReceNaveForIdVehi(Integer id_vehi);
    
}
