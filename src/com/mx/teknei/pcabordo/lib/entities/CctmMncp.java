package com.mx.teknei.pcabordo.lib.entities;
// Generated 5/08/2015 10:23:13 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CctmMncp generated by hbm2java
 */
public class CctmMncp  implements java.io.Serializable {


     private CctmMncpId id;
     private String nomMncp;
     private int idEsta;
     private int idTipo;
     private String usrCrea;
     private Date fchCrea;
     private Set cctmDires = new HashSet(0);

    public CctmMncp() {
    }

	
    public CctmMncp(CctmMncpId id, int idEsta, int idTipo, String usrCrea, Date fchCrea) {
        this.id = id;
        this.idEsta = idEsta;
        this.idTipo = idTipo;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public CctmMncp(CctmMncpId id, String nomMncp, int idEsta, int idTipo, String usrCrea, Date fchCrea, Set cctmDires) {
       this.id = id;
       this.nomMncp = nomMncp;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.cctmDires = cctmDires;
    }
   
    public CctmMncpId getId() {
        return this.id;
    }
    
    public void setId(CctmMncpId id) {
        this.id = id;
    }
    public String getNomMncp() {
        return this.nomMncp;
    }
    
    public void setNomMncp(String nomMncp) {
        this.nomMncp = nomMncp;
    }
    public int getIdEsta() {
        return this.idEsta;
    }
    
    public void setIdEsta(int idEsta) {
        this.idEsta = idEsta;
    }
    public int getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }
    public String getUsrCrea() {
        return this.usrCrea;
    }
    
    public void setUsrCrea(String usrCrea) {
        this.usrCrea = usrCrea;
    }
    public Date getFchCrea() {
        return this.fchCrea;
    }
    
    public void setFchCrea(Date fchCrea) {
        this.fchCrea = fchCrea;
    }
    public Set getCctmDires() {
        return this.cctmDires;
    }
    
    public void setCctmDires(Set cctmDires) {
        this.cctmDires = cctmDires;
    }




}

