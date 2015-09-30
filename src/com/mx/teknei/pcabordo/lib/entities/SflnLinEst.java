package com.mx.teknei.pcabordo.lib.entities;
// Generated 30/09/2015 04:22:57 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SflnLinEst generated by hbm2java
 */
public class SflnLinEst  implements java.io.Serializable {


     private int idLinEst;
     private SfesEst sfesEst;
     private SflnLin sflnLin;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private int idEsta;
     private int idTipo;
     private Integer idConSis;
     private int noEst;
     private Set sfcoLineEstaDires = new HashSet(0);

    public SflnLinEst() {
    }

	
    public SflnLinEst(int idLinEst, SfesEst sfesEst, SflnLin sflnLin, String usrCrea, Date fchCrea, int idEsta, int idTipo, int noEst) {
        this.idLinEst = idLinEst;
        this.sfesEst = sfesEst;
        this.sflnLin = sflnLin;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
        this.idEsta = idEsta;
        this.idTipo = idTipo;
        this.noEst = noEst;
    }
    public SflnLinEst(int idLinEst, SfesEst sfesEst, SflnLin sflnLin, String usrCrea, Date fchCrea, String usrModi, Date fchModi, int idEsta, int idTipo, Integer idConSis, int noEst, Set sfcoLineEstaDires) {
       this.idLinEst = idLinEst;
       this.sfesEst = sfesEst;
       this.sflnLin = sflnLin;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.idConSis = idConSis;
       this.noEst = noEst;
       this.sfcoLineEstaDires = sfcoLineEstaDires;
    }
   
    public int getIdLinEst() {
        return this.idLinEst;
    }
    
    public void setIdLinEst(int idLinEst) {
        this.idLinEst = idLinEst;
    }
    public SfesEst getSfesEst() {
        return this.sfesEst;
    }
    
    public void setSfesEst(SfesEst sfesEst) {
        this.sfesEst = sfesEst;
    }
    public SflnLin getSflnLin() {
        return this.sflnLin;
    }
    
    public void setSflnLin(SflnLin sflnLin) {
        this.sflnLin = sflnLin;
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
    public Integer getIdConSis() {
        return this.idConSis;
    }
    
    public void setIdConSis(Integer idConSis) {
        this.idConSis = idConSis;
    }
    public int getNoEst() {
        return this.noEst;
    }
    
    public void setNoEst(int noEst) {
        this.noEst = noEst;
    }
    public Set getSfcoLineEstaDires() {
        return this.sfcoLineEstaDires;
    }
    
    public void setSfcoLineEstaDires(Set sfcoLineEstaDires) {
        this.sfcoLineEstaDires = sfcoLineEstaDires;
    }




}


