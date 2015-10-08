package com.mx.teknei.pcabordo.lib.entities;
// Generated 8/10/2015 10:59:21 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SfpfItin generated by hbm2java
 */
public class SfpfItin  implements java.io.Serializable {


     private int idItin;
     private SfcrVehiCond sfcrVehiCond;
     private SfesEst sfesEstByIdEstaOrig;
     private SfesEst sfesEstByIdEstaDest;
     private SfruRuta sfruRuta;
     private SfvhVehi sfvhVehi;
     private Date horaSaliItin;
     private Date horaLlegItin;
     private Date horaSaliRealItin;
     private Date horaLlegRealItin;
     private String direItin;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private int idEsta;
     private Integer idTipo;
     private Integer idConSis;
     private Integer idTipoLin;
     private Integer idCond;
     private Double kmReco;
     private Integer numCorri;
     private Set sfdtDitis = new HashSet(0);

    public SfpfItin() {
    }

	
    public SfpfItin(int idItin, String usrCrea, Date fchCrea, int idEsta) {
        this.idItin = idItin;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
        this.idEsta = idEsta;
    }
    public SfpfItin(int idItin, SfcrVehiCond sfcrVehiCond, SfesEst sfesEstByIdEstaOrig, SfesEst sfesEstByIdEstaDest, SfruRuta sfruRuta, SfvhVehi sfvhVehi, Date horaSaliItin, Date horaLlegItin, Date horaSaliRealItin, Date horaLlegRealItin, String direItin, String usrCrea, Date fchCrea, String usrModi, Date fchModi, int idEsta, Integer idTipo, Integer idConSis, Integer idTipoLin, Integer idCond, Double kmReco, Integer numCorri, Set sfdtDitis) {
       this.idItin = idItin;
       this.sfcrVehiCond = sfcrVehiCond;
       this.sfesEstByIdEstaOrig = sfesEstByIdEstaOrig;
       this.sfesEstByIdEstaDest = sfesEstByIdEstaDest;
       this.sfruRuta = sfruRuta;
       this.sfvhVehi = sfvhVehi;
       this.horaSaliItin = horaSaliItin;
       this.horaLlegItin = horaLlegItin;
       this.horaSaliRealItin = horaSaliRealItin;
       this.horaLlegRealItin = horaLlegRealItin;
       this.direItin = direItin;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.idConSis = idConSis;
       this.idTipoLin = idTipoLin;
       this.idCond = idCond;
       this.kmReco = kmReco;
       this.numCorri = numCorri;
       this.sfdtDitis = sfdtDitis;
    }
   
    public int getIdItin() {
        return this.idItin;
    }
    
    public void setIdItin(int idItin) {
        this.idItin = idItin;
    }
    public SfcrVehiCond getSfcrVehiCond() {
        return this.sfcrVehiCond;
    }
    
    public void setSfcrVehiCond(SfcrVehiCond sfcrVehiCond) {
        this.sfcrVehiCond = sfcrVehiCond;
    }
    public SfesEst getSfesEstByIdEstaOrig() {
        return this.sfesEstByIdEstaOrig;
    }
    
    public void setSfesEstByIdEstaOrig(SfesEst sfesEstByIdEstaOrig) {
        this.sfesEstByIdEstaOrig = sfesEstByIdEstaOrig;
    }
    public SfesEst getSfesEstByIdEstaDest() {
        return this.sfesEstByIdEstaDest;
    }
    
    public void setSfesEstByIdEstaDest(SfesEst sfesEstByIdEstaDest) {
        this.sfesEstByIdEstaDest = sfesEstByIdEstaDest;
    }
    public SfruRuta getSfruRuta() {
        return this.sfruRuta;
    }
    
    public void setSfruRuta(SfruRuta sfruRuta) {
        this.sfruRuta = sfruRuta;
    }
    public SfvhVehi getSfvhVehi() {
        return this.sfvhVehi;
    }
    
    public void setSfvhVehi(SfvhVehi sfvhVehi) {
        this.sfvhVehi = sfvhVehi;
    }
    public Date getHoraSaliItin() {
        return this.horaSaliItin;
    }
    
    public void setHoraSaliItin(Date horaSaliItin) {
        this.horaSaliItin = horaSaliItin;
    }
    public Date getHoraLlegItin() {
        return this.horaLlegItin;
    }
    
    public void setHoraLlegItin(Date horaLlegItin) {
        this.horaLlegItin = horaLlegItin;
    }
    public Date getHoraSaliRealItin() {
        return this.horaSaliRealItin;
    }
    
    public void setHoraSaliRealItin(Date horaSaliRealItin) {
        this.horaSaliRealItin = horaSaliRealItin;
    }
    public Date getHoraLlegRealItin() {
        return this.horaLlegRealItin;
    }
    
    public void setHoraLlegRealItin(Date horaLlegRealItin) {
        this.horaLlegRealItin = horaLlegRealItin;
    }
    public String getDireItin() {
        return this.direItin;
    }
    
    public void setDireItin(String direItin) {
        this.direItin = direItin;
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
    public Integer getIdTipo() {
        return this.idTipo;
    }
    
    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }
    public Integer getIdConSis() {
        return this.idConSis;
    }
    
    public void setIdConSis(Integer idConSis) {
        this.idConSis = idConSis;
    }
    public Integer getIdTipoLin() {
        return this.idTipoLin;
    }
    
    public void setIdTipoLin(Integer idTipoLin) {
        this.idTipoLin = idTipoLin;
    }
    public Integer getIdCond() {
        return this.idCond;
    }
    
    public void setIdCond(Integer idCond) {
        this.idCond = idCond;
    }
    public Double getKmReco() {
        return this.kmReco;
    }
    
    public void setKmReco(Double kmReco) {
        this.kmReco = kmReco;
    }
    public Integer getNumCorri() {
        return this.numCorri;
    }
    
    public void setNumCorri(Integer numCorri) {
        this.numCorri = numCorri;
    }
    public Set getSfdtDitis() {
        return this.sfdtDitis;
    }
    
    public void setSfdtDitis(Set sfdtDitis) {
        this.sfdtDitis = sfdtDitis;
    }




}


