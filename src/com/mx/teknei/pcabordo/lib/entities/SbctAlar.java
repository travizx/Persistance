package com.mx.teknei.pcabordo.lib.entities;
// Generated 30/09/2015 04:22:57 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SbctAlar generated by hbm2java
 */
public class SbctAlar  implements java.io.Serializable {


     private int idAlar;
     private Integer idPrio;
     private String desAlar;
     private int idEsta;
     private int idTipo;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private Integer idTipoAlar;
     private Set sfopEquiAlars = new HashSet(0);
     private Set sfalConfs = new HashSet(0);

    public SbctAlar() {
    }

	
    public SbctAlar(int idAlar, int idEsta, int idTipo, String usrCrea, Date fchCrea) {
        this.idAlar = idAlar;
        this.idEsta = idEsta;
        this.idTipo = idTipo;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public SbctAlar(int idAlar, Integer idPrio, String desAlar, int idEsta, int idTipo, String usrCrea, Date fchCrea, String usrModi, Date fchModi, Integer idTipoAlar, Set sfopEquiAlars, Set sfalConfs) {
       this.idAlar = idAlar;
       this.idPrio = idPrio;
       this.desAlar = desAlar;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.idTipoAlar = idTipoAlar;
       this.sfopEquiAlars = sfopEquiAlars;
       this.sfalConfs = sfalConfs;
    }
   
    public int getIdAlar() {
        return this.idAlar;
    }
    
    public void setIdAlar(int idAlar) {
        this.idAlar = idAlar;
    }
    public Integer getIdPrio() {
        return this.idPrio;
    }
    
    public void setIdPrio(Integer idPrio) {
        this.idPrio = idPrio;
    }
    public String getDesAlar() {
        return this.desAlar;
    }
    
    public void setDesAlar(String desAlar) {
        this.desAlar = desAlar;
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
    public Integer getIdTipoAlar() {
        return this.idTipoAlar;
    }
    
    public void setIdTipoAlar(Integer idTipoAlar) {
        this.idTipoAlar = idTipoAlar;
    }
    public Set getSfopEquiAlars() {
        return this.sfopEquiAlars;
    }
    
    public void setSfopEquiAlars(Set sfopEquiAlars) {
        this.sfopEquiAlars = sfopEquiAlars;
    }
    public Set getSfalConfs() {
        return this.sfalConfs;
    }
    
    public void setSfalConfs(Set sfalConfs) {
        this.sfalConfs = sfalConfs;
    }




}


