
package com.mx.teknei.pcabordo.lib.service;

import com.mx.teknei.pcabordo.lib.entities.SfemCond;
import com.mx.teknei.pcabordo.lib.entities.SfpcCata;
import java.util.List;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 8/07/2015
 * @class IEmplCondService
 */
public interface IEmplCondService {
//    public void GuardarEmplCond(SfemCond cond);
//    public void ActualizarEmplCond(SfemCond cond);
//    public void EliminarEmplCond(SfemCond cond);
    public List<SfemCond> ListarEmplCond();
    public SfemCond BuscarDatosLogin(String usuario, String contrasenia);
    public List<SfemCond> BuscarUsuario(String usuario);
    public SfpcCata RecuperarLlaveForanea(SfpcCata cata);
}
