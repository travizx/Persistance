package com.mx.teknei.pcabordo.lib.entities;
// Generated 29/09/2015 01:25:12 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CctmDire generated by hbm2java
 */
public class CctmDire  implements java.io.Serializable {


     private int idDire;
     private CctmCiud cctmCiud;
     private CctmCodp cctmCodp;
     private CctmColn cctmColn;
     private CctmEstd cctmEstd;
     private CctmMncp cctmMncp;
     private Double latDire;
     private Double lonDire;
     private String callDire;
     private String nintDire;
     private String nextDire;
     private Integer idTipoUbi;
     private int idEsta;
     private int idTipo;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private Set sfesEsts = new HashSet(0);

    public CctmDire() {
    }

	
    public CctmDire(int idDire, int idEsta, int idTipo, String usrCrea, Date fchCrea) {
        this.idDire = idDire;
        this.idEsta = idEsta;
        this.idTipo = idTipo;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
    }
    public CctmDire(int idDire, CctmCiud cctmCiud, CctmCodp cctmCodp, CctmColn cctmColn, CctmEstd cctmEstd, CctmMncp cctmMncp, Double latDire, Double lonDire, String callDire, String nintDire, String nextDire, Integer idTipoUbi, int idEsta, int idTipo, String usrCrea, Date fchCrea, String usrModi, Date fchModi, Set sfesEsts) {
       this.idDire = idDire;
       this.cctmCiud = cctmCiud;
       this.cctmCodp = cctmCodp;
       this.cctmColn = cctmColn;
       this.cctmEstd = cctmEstd;
       this.cctmMncp = cctmMncp;
       this.latDire = latDire;
       this.lonDire = lonDire;
       this.callDire = callDire;
       this.nintDire = nintDire;
       this.nextDire = nextDire;
       this.idTipoUbi = idTipoUbi;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.sfesEsts = sfesEsts;
    }
   
    public int getIdDire() {
        return this.idDire;
    }
    
    public void setIdDire(int idDire) {
        this.idDire = idDire;
    }
    public CctmCiud getCctmCiud() {
        return this.cctmCiud;
    }
    
    public void setCctmCiud(CctmCiud cctmCiud) {
        this.cctmCiud = cctmCiud;
    }
    public CctmCodp getCctmCodp() {
        return this.cctmCodp;
    }
    
    public void setCctmCodp(CctmCodp cctmCodp) {
        this.cctmCodp = cctmCodp;
    }
    public CctmColn getCctmColn() {
        return this.cctmColn;
    }
    
    public void setCctmColn(CctmColn cctmColn) {
        this.cctmColn = cctmColn;
    }
    public CctmEstd getCctmEstd() {
        return this.cctmEstd;
    }
    
    public void setCctmEstd(CctmEstd cctmEstd) {
        this.cctmEstd = cctmEstd;
    }
    public CctmMncp getCctmMncp() {
        return this.cctmMncp;
    }
    
    public void setCctmMncp(CctmMncp cctmMncp) {
        this.cctmMncp = cctmMncp;
    }
    public Double getLatDire() {
        return this.latDire;
    }
    
    public void setLatDire(Double latDire) {
        this.latDire = latDire;
    }
    public Double getLonDire() {
        return this.lonDire;
    }
    
    public void setLonDire(Double lonDire) {
        this.lonDire = lonDire;
    }
    public String getCallDire() {
        return this.callDire;
    }
    
    public void setCallDire(String callDire) {
        this.callDire = callDire;
    }
    public String getNintDire() {
        return this.nintDire;
    }
    
    public void setNintDire(String nintDire) {
        this.nintDire = nintDire;
    }
    public String getNextDire() {
        return this.nextDire;
    }
    
    public void setNextDire(String nextDire) {
        this.nextDire = nextDire;
    }
    public Integer getIdTipoUbi() {
        return this.idTipoUbi;
    }
    
    public void setIdTipoUbi(Integer idTipoUbi) {
        this.idTipoUbi = idTipoUbi;
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
    public Set getSfesEsts() {
        return this.sfesEsts;
    }
    
    public void setSfesEsts(Set sfesEsts) {
        this.sfesEsts = sfesEsts;
    }




}


