package com.mx.teknei.pcabordo.lib.entities;
// Generated 30/09/2015 04:22:57 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SfmoTipu generated by hbm2java
 */
public class SfmoTipu  implements java.io.Serializable {


     private int idTpun;
     private SflnLin sflnLin;
     private String tipoPunt;
     private Double latd;
     private Double lont;
     private Date fecRegs;
     private int idEsta;
     private Integer idTipo;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private Integer idConSis;

    public SfmoTipu() {
    }

	
    public SfmoTipu(int idTpun, int idEsta, String usrCrea, Date fchCrea) {
        this.idTpun = idTpun;
        this.idEsta = idEsta;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public SfmoTipu(int idTpun, SflnLin sflnLin, String tipoPunt, Double latd, Double lont, Date fecRegs, int idEsta, Integer idTipo, String usrCrea, Date fchCrea, String usrModi, Date fchModi, Integer idConSis) {
       this.idTpun = idTpun;
       this.sflnLin = sflnLin;
       this.tipoPunt = tipoPunt;
       this.latd = latd;
       this.lont = lont;
       this.fecRegs = fecRegs;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.idConSis = idConSis;
    }
   
    public int getIdTpun() {
        return this.idTpun;
    }
    
    public void setIdTpun(int idTpun) {
        this.idTpun = idTpun;
    }
    public SflnLin getSflnLin() {
        return this.sflnLin;
    }
    
    public void setSflnLin(SflnLin sflnLin) {
        this.sflnLin = sflnLin;
    }
    public String getTipoPunt() {
        return this.tipoPunt;
    }
    
    public void setTipoPunt(String tipoPunt) {
        this.tipoPunt = tipoPunt;
    }
    public Double getLatd() {
        return this.latd;
    }
    
    public void setLatd(Double latd) {
        this.latd = latd;
    }
    public Double getLont() {
        return this.lont;
    }
    
    public void setLont(Double lont) {
        this.lont = lont;
    }
    public Date getFecRegs() {
        return this.fecRegs;
    }
    
    public void setFecRegs(Date fecRegs) {
        this.fecRegs = fecRegs;
    }
    public int getIdEsta() {
        return this.idEsta;
    }
    
    public void setIdEsta(int idEsta) {
        this.idEsta = idEsta;
    }
    public Integer getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(Integer idTipo) {
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
    public Integer getIdConSis() {
        return this.idConSis;
    }
    
    public void setIdConSis(Integer idConSis) {
        this.idConSis = idConSis;
    }




}


