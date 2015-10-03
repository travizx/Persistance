package com.mx.teknei.pcabordo.lib.entities;
// Generated 2/10/2015 11:02:27 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SfalConf generated by hbm2java
 */
public class SfalConf  implements java.io.Serializable {


     private int idConfAlar;
     private CctmArpo cctmArpo;
     private SbctAlar sbctAlar;
     private Integer veloEsta;
     private Double distRadi;
     private String descConfAlar;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private int idEsta;
     private int idTipo;
     private Date tiemAlto;

    public SfalConf() {
    }

	
    public SfalConf(int idConfAlar, String usrCrea, Date fchCrea, int idEsta, int idTipo) {
        this.idConfAlar = idConfAlar;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
        this.idEsta = idEsta;
        this.idTipo = idTipo;
    }
    public SfalConf(int idConfAlar, CctmArpo cctmArpo, SbctAlar sbctAlar, Integer veloEsta, Double distRadi, String descConfAlar, String usrCrea, Date fchCrea, String usrModi, Date fchModi, int idEsta, int idTipo, Date tiemAlto) {
       this.idConfAlar = idConfAlar;
       this.cctmArpo = cctmArpo;
       this.sbctAlar = sbctAlar;
       this.veloEsta = veloEsta;
       this.distRadi = distRadi;
       this.descConfAlar = descConfAlar;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.tiemAlto = tiemAlto;
    }
   
    public int getIdConfAlar() {
        return this.idConfAlar;
    }
    
    public void setIdConfAlar(int idConfAlar) {
        this.idConfAlar = idConfAlar;
    }
    public CctmArpo getCctmArpo() {
        return this.cctmArpo;
    }
    
    public void setCctmArpo(CctmArpo cctmArpo) {
        this.cctmArpo = cctmArpo;
    }
    public SbctAlar getSbctAlar() {
        return this.sbctAlar;
    }
    
    public void setSbctAlar(SbctAlar sbctAlar) {
        this.sbctAlar = sbctAlar;
    }
    public Integer getVeloEsta() {
        return this.veloEsta;
    }
    
    public void setVeloEsta(Integer veloEsta) {
        this.veloEsta = veloEsta;
    }
    public Double getDistRadi() {
        return this.distRadi;
    }
    
    public void setDistRadi(Double distRadi) {
        this.distRadi = distRadi;
    }
    public String getDescConfAlar() {
        return this.descConfAlar;
    }
    
    public void setDescConfAlar(String descConfAlar) {
        this.descConfAlar = descConfAlar;
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
    public Date getTiemAlto() {
        return this.tiemAlto;
    }
    
    public void setTiemAlto(Date tiemAlto) {
        this.tiemAlto = tiemAlto;
    }




}


