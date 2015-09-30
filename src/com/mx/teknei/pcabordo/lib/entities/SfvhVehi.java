package com.mx.teknei.pcabordo.lib.entities;
// Generated 30/09/2015 04:22:57 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SfvhVehi generated by hbm2java
 */
public class SfvhVehi  implements java.io.Serializable {


     private int idVehi;
     private Integer idEmpCond;
     private String placVehi;
     private int idTipoVehi;
     private int kmVehi;
     private int idEdoVehi;
     private String usrCrea;
     private Date fchCrea;
     private String usrModi;
     private Date fchModi;
     private int idEsta;
     private int idTipo;
     private int idModeVehi;
     private Integer anioMode;
     private Integer capPas;
     private String noEcon;
     private Date fchAlta;
     private Date fchOper;
     private Integer idConSis;
     private Set sfpfItins = new HashSet(0);
     private Set sfmoReceNaves = new HashSet(0);
     private Set sfmoHistReceNaves = new HashSet(0);
     private Set sfcrVehiConds = new HashSet(0);
     private Set sfopEquiAlars = new HashSet(0);

    public SfvhVehi() {
    }

	
    public SfvhVehi(int idVehi, String placVehi, int idTipoVehi, int kmVehi, int idEdoVehi, String usrCrea, Date fchCrea, int idEsta, int idTipo, int idModeVehi) {
        this.idVehi = idVehi;
        this.placVehi = placVehi;
        this.idTipoVehi = idTipoVehi;
        this.kmVehi = kmVehi;
        this.idEdoVehi = idEdoVehi;
        this.usrCrea = usrCrea;
        this.fchCrea = fchCrea;
        this.idEsta = idEsta;
        this.idTipo = idTipo;
        this.idModeVehi = idModeVehi;
    }
    public SfvhVehi(int idVehi, Integer idEmpCond, String placVehi, int idTipoVehi, int kmVehi, int idEdoVehi, String usrCrea, Date fchCrea, String usrModi, Date fchModi, int idEsta, int idTipo, int idModeVehi, Integer anioMode, Integer capPas, String noEcon, Date fchAlta, Date fchOper, Integer idConSis, Set sfpfItins, Set sfmoReceNaves, Set sfmoHistReceNaves, Set sfcrVehiConds, Set sfopEquiAlars) {
       this.idVehi = idVehi;
       this.idEmpCond = idEmpCond;
       this.placVehi = placVehi;
       this.idTipoVehi = idTipoVehi;
       this.kmVehi = kmVehi;
       this.idEdoVehi = idEdoVehi;
       this.usrCrea = usrCrea;
       this.fchCrea = fchCrea;
       this.usrModi = usrModi;
       this.fchModi = fchModi;
       this.idEsta = idEsta;
       this.idTipo = idTipo;
       this.idModeVehi = idModeVehi;
       this.anioMode = anioMode;
       this.capPas = capPas;
       this.noEcon = noEcon;
       this.fchAlta = fchAlta;
       this.fchOper = fchOper;
       this.idConSis = idConSis;
       this.sfpfItins = sfpfItins;
       this.sfmoReceNaves = sfmoReceNaves;
       this.sfmoHistReceNaves = sfmoHistReceNaves;
       this.sfcrVehiConds = sfcrVehiConds;
       this.sfopEquiAlars = sfopEquiAlars;
    }
   
    public int getIdVehi() {
        return this.idVehi;
    }
    
    public void setIdVehi(int idVehi) {
        this.idVehi = idVehi;
    }
    public Integer getIdEmpCond() {
        return this.idEmpCond;
    }
    
    public void setIdEmpCond(Integer idEmpCond) {
        this.idEmpCond = idEmpCond;
    }
    public String getPlacVehi() {
        return this.placVehi;
    }
    
    public void setPlacVehi(String placVehi) {
        this.placVehi = placVehi;
    }
    public int getIdTipoVehi() {
        return this.idTipoVehi;
    }
    
    public void setIdTipoVehi(int idTipoVehi) {
        this.idTipoVehi = idTipoVehi;
    }
    public int getKmVehi() {
        return this.kmVehi;
    }
    
    public void setKmVehi(int kmVehi) {
        this.kmVehi = kmVehi;
    }
    public int getIdEdoVehi() {
        return this.idEdoVehi;
    }
    
    public void setIdEdoVehi(int idEdoVehi) {
        this.idEdoVehi = idEdoVehi;
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
    public int getIdModeVehi() {
        return this.idModeVehi;
    }
    
    public void setIdModeVehi(int idModeVehi) {
        this.idModeVehi = idModeVehi;
    }
    public Integer getAnioMode() {
        return this.anioMode;
    }
    
    public void setAnioMode(Integer anioMode) {
        this.anioMode = anioMode;
    }
    public Integer getCapPas() {
        return this.capPas;
    }
    
    public void setCapPas(Integer capPas) {
        this.capPas = capPas;
    }
    public String getNoEcon() {
        return this.noEcon;
    }
    
    public void setNoEcon(String noEcon) {
        this.noEcon = noEcon;
    }
    public Date getFchAlta() {
        return this.fchAlta;
    }
    
    public void setFchAlta(Date fchAlta) {
        this.fchAlta = fchAlta;
    }
    public Date getFchOper() {
        return this.fchOper;
    }
    
    public void setFchOper(Date fchOper) {
        this.fchOper = fchOper;
    }
    public Integer getIdConSis() {
        return this.idConSis;
    }
    
    public void setIdConSis(Integer idConSis) {
        this.idConSis = idConSis;
    }
    public Set getSfpfItins() {
        return this.sfpfItins;
    }
    
    public void setSfpfItins(Set sfpfItins) {
        this.sfpfItins = sfpfItins;
    }
    public Set getSfmoReceNaves() {
        return this.sfmoReceNaves;
    }
    
    public void setSfmoReceNaves(Set sfmoReceNaves) {
        this.sfmoReceNaves = sfmoReceNaves;
    }
    public Set getSfmoHistReceNaves() {
        return this.sfmoHistReceNaves;
    }
    
    public void setSfmoHistReceNaves(Set sfmoHistReceNaves) {
        this.sfmoHistReceNaves = sfmoHistReceNaves;
    }
    public Set getSfcrVehiConds() {
        return this.sfcrVehiConds;
    }
    
    public void setSfcrVehiConds(Set sfcrVehiConds) {
        this.sfcrVehiConds = sfcrVehiConds;
    }
    public Set getSfopEquiAlars() {
        return this.sfopEquiAlars;
    }
    
    public void setSfopEquiAlars(Set sfopEquiAlars) {
        this.sfopEquiAlars = sfopEquiAlars;
    }




}


