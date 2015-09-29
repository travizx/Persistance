/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.teknei.pcabordo.lib.dao;

import com.mx.teknei.pcabordo.lib.entities.SfpfItin;
import java.util.List;

/**
 *
 * @author ajimenez
 */
public interface ISfpfItinDAO extends GenericDao<SfpfItin, Long>{
    
    public List<SfpfItin>listaItin();
    public List<SfpfItin>getIdItinForEsta(int idEsta);
    
}
