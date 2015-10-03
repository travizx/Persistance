package com.mx.teknei.pcabordo.lib.entities;
// Generated 2/10/2015 11:02:27 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * SfgfHoseFlot generated by hbm2java
 */
public class SfgfHoseFlot  implements java.io.Serializable {


     private int idHoraServ;
     private Date horaInic;
     private Date horaFin;
     private Date fchOper;
     private Integer tipoDia;
     private String descServ;
     private String userCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private Integer idEsta;
     private Integer idTipo;

    public SfgfHoseFlot() {
    }

	
    public SfgfHoseFlot(int idHoraServ, String userCrea, Date fchCrea) {
        this.idHoraServ = idHoraServ;
        this.userCrea = userCrea;
        this.fchCrea = fchCrea;
    }
    public SfgfHoseFlot(int idHoraServ, Date horaInic, Date horaFin, Date fchOper, Integer tipoDia, String descServ, String userCrea, Date fchCrea, String usrModi, Date fchModi, Integer idEsta, Integer idTipo) {
       this.idHoraServ = idHoraServ;
       this.horaInic = horaInic;
       this.horaFin = horaFin;
       this.fchOper = fchOper;
       this.tipoDia = tipoDia;
       this.descServ = descServ;
       this.userCrea = userCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
    }
   
    public int getIdHoraServ() {
        return this.idHoraServ;
    }
    
    public void setIdHoraServ(int idHoraServ) {
        this.idHoraServ = idHoraServ;
    }
    public Date getHoraInic() {
        return this.horaInic;
    }
    
    public void setHoraInic(Date horaInic) {
        this.horaInic = horaInic;
    }
    public Date getHoraFin() {
        return this.horaFin;
    }
    
    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }
    public Date getFchOper() {
        return this.fchOper;
    }
    
    public void setFchOper(Date fchOper) {
        this.fchOper = fchOper;
    }
    public Integer getTipoDia() {
        return this.tipoDia;
    }
    
    public void setTipoDia(Integer tipoDia) {
        this.tipoDia = tipoDia;
    }
    public String getDescServ() {
        return this.descServ;
    }
    
    public void setDescServ(String descServ) {
        this.descServ = descServ;
    }
    public String getUserCrea() {
        return this.userCrea;
    }
    
    public void setUserCrea(String userCrea) {
        this.userCrea = userCrea;
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
    public Integer getIdEsta() {
        return this.idEsta;
    }
    
    public void setIdEsta(Integer idEsta) {
        this.idEsta = idEsta;
    }
    public Integer getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }




}


