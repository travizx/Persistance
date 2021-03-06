package com.mx.teknei.pcabordo.lib.entities;
// Generated 8/10/2015 10:59:21 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SfcoLineEstaDire generated by hbm2java
 */
public class SfcoLineEstaDire  implements java.io.Serializable {


     private int idLineEstaDire;
     private CctmDire cctmDire;
     private SflnLinEst sflnLinEst;
     private int idEsta;
     private int idTipo;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;

    public SfcoLineEstaDire() {
    }

	
    public SfcoLineEstaDire(int idLineEstaDire, CctmDire cctmDire, SflnLinEst sflnLinEst, int idEsta, int idTipo, String usrCrea, Date fchCrea) {
        this.idLineEstaDire = idLineEstaDire;
        this.cctmDire = cctmDire;
        this.sflnLinEst = sflnLinEst;
        this.idEsta = idEsta;
        this.idTipo = idTipo;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public SfcoLineEstaDire(int idLineEstaDire, CctmDire cctmDire, SflnLinEst sflnLinEst, int idEsta, int idTipo, String usrCrea, Date fchCrea, String usrModi, Date fchModi) {
       this.idLineEstaDire = idLineEstaDire;
       this.cctmDire = cctmDire;
       this.sflnLinEst = sflnLinEst;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
    }
   
    public int getIdLineEstaDire() {
        return this.idLineEstaDire;
    }
    
    public void setIdLineEstaDire(int idLineEstaDire) {
        this.idLineEstaDire = idLineEstaDire;
    }
    public CctmDire getCctmDire() {
        return this.cctmDire;
    }
    
    public void setCctmDire(CctmDire cctmDire) {
        this.cctmDire = cctmDire;
    }
    public SflnLinEst getSflnLinEst() {
        return this.sflnLinEst;
    }
    
    public void setSflnLinEst(SflnLinEst sflnLinEst) {
        this.sflnLinEst = sflnLinEst;
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
    public String getUsrModi() {
        return this.usrModi;
    }
    
    public void setUsrModi(String usrModi) {
        this.usrModi = usrModi;
    }
    public Date getFchModi() {
        return this.fchModi;
    }
    
    public void setFchModi(Date fchModi) {
        this.fchModi = fchModi;
    }




}


