package com.mx.teknei.pcabordo.lib.entities;
// Generated 9/09/2015 12:08:38 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SfmoHistReceNave generated by hbm2java
 */
public class SfmoHistReceNave  implements java.io.Serializable {


     private int idRecoNave;
     private SfvhVehi sfvhVehi;
     private String numSeriRecoNave;
     private String modeReceNave;
     private Double latiReceNave;
     private Double longReceNave;
     private Double veloReceNave;
     private Double distRecoReceNave;
     private Date fchReceNave;
     private Double timeRecoReceNave;
     private Date horaSistReceNave;
     private Date horaGpsReceNave;
     private int idEsta;
     private Integer idTipo;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private Integer idConSis;

    public SfmoHistReceNave() {
    }

	
    public SfmoHistReceNave(int idRecoNave, int idEsta, String usrCrea, Date fchCrea) {
        this.idRecoNave = idRecoNave;
        this.idEsta = idEsta;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public SfmoHistReceNave(int idRecoNave, SfvhVehi sfvhVehi, String numSeriRecoNave, String modeReceNave, Double latiReceNave, Double longReceNave, Double veloReceNave, Double distRecoReceNave, Date fchReceNave, Double timeRecoReceNave, Date horaSistReceNave, Date horaGpsReceNave, int idEsta, Integer idTipo, String usrCrea, Date fchCrea, String usrModi, Date fchModi, Integer idConSis) {
       this.idRecoNave = idRecoNave;
       this.sfvhVehi = sfvhVehi;
       this.numSeriRecoNave = numSeriRecoNave;
       this.modeReceNave = modeReceNave;
       this.latiReceNave = latiReceNave;
       this.longReceNave = longReceNave;
       this.veloReceNave = veloReceNave;
       this.distRecoReceNave = distRecoReceNave;
       this.fchReceNave = fchReceNave;
       this.timeRecoReceNave = timeRecoReceNave;
       this.horaSistReceNave = horaSistReceNave;
       this.horaGpsReceNave = horaGpsReceNave;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.idConSis = idConSis;
    }
   
    public int getIdRecoNave() {
        return this.idRecoNave;
    }
    
    public void setIdRecoNave(int idRecoNave) {
        this.idRecoNave = idRecoNave;
    }
    public SfvhVehi getSfvhVehi() {
        return this.sfvhVehi;
    }
    
    public void setSfvhVehi(SfvhVehi sfvhVehi) {
        this.sfvhVehi = sfvhVehi;
    }
    public String getNumSeriRecoNave() {
        return this.numSeriRecoNave;
    }
    
    public void setNumSeriRecoNave(String numSeriRecoNave) {
        this.numSeriRecoNave = numSeriRecoNave;
    }
    public String getModeReceNave() {
        return this.modeReceNave;
    }
    
    public void setModeReceNave(String modeReceNave) {
        this.modeReceNave = modeReceNave;
    }
    public Double getLatiReceNave() {
        return this.latiReceNave;
    }
    
    public void setLatiReceNave(Double latiReceNave) {
        this.latiReceNave = latiReceNave;
    }
    public Double getLongReceNave() {
        return this.longReceNave;
    }
    
    public void setLongReceNave(Double longReceNave) {
        this.longReceNave = longReceNave;
    }
    public Double getVeloReceNave() {
        return this.veloReceNave;
    }
    
    public void setVeloReceNave(Double veloReceNave) {
        this.veloReceNave = veloReceNave;
    }
    public Double getDistRecoReceNave() {
        return this.distRecoReceNave;
    }
    
    public void setDistRecoReceNave(Double distRecoReceNave) {
        this.distRecoReceNave = distRecoReceNave;
    }
    public Date getFchReceNave() {
        return this.fchReceNave;
    }
    
    public void setFchReceNave(Date fchReceNave) {
        this.fchReceNave = fchReceNave;
    }
    public Double getTimeRecoReceNave() {
        return this.timeRecoReceNave;
    }
    
    public void setTimeRecoReceNave(Double timeRecoReceNave) {
        this.timeRecoReceNave = timeRecoReceNave;
    }
    public Date getHoraSistReceNave() {
        return this.horaSistReceNave;
    }
    
    public void setHoraSistReceNave(Date horaSistReceNave) {
        this.horaSistReceNave = horaSistReceNave;
    }
    public Date getHoraGpsReceNave() {
        return this.horaGpsReceNave;
    }
    
    public void setHoraGpsReceNave(Date horaGpsReceNave) {
        this.horaGpsReceNave = horaGpsReceNave;
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


