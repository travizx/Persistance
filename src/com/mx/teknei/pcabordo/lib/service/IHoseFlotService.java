
package com.mx.teknei.pcabordo.lib.service;

import com.mx.teknei.pcabordo.lib.entities.SfgfHoseFlot;
import java.util.Date;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 9/08/2015
 * @class IHoseFlotService
 */
public interface IHoseFlotService {
    public SfgfHoseFlot buscarPorID(Integer id_hora_flot);
    public List<SfgfHoseFlot> buscarPorFecha(Date date);
}

