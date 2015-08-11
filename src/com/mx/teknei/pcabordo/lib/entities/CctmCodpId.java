package com.mx.teknei.pcabordo.lib.entities;
// Generated 5/08/2015 10:23:13 AM by Hibernate Tools 4.3.1



/**
 * CctmCodpId generated by hbm2java
 */
public class CctmCodpId  implements java.io.Serializable {


     private int idCodp;
     private int idMncp;
     private int idCiud;
     private int idEstd;

    public CctmCodpId() {
    }

    public CctmCodpId(int idCodp, int idMncp, int idCiud, int idEstd) {
       this.idCodp = idCodp;
       this.idMncp = idMncp;
       this.idCiud = idCiud;
       this.idEstd = idEstd;
    }
   
    public int getIdCodp() {
        return this.idCodp;
    }
    
    public void setIdCodp(int idCodp) {
        this.idCodp = idCodp;
    }
    public int getIdMncp() {
        return this.idMncp;
    }
    
    public void setIdMncp(int idMncp) {
        this.idMncp = idMncp;
    }
    public int getIdCiud() {
        return this.idCiud;
    }
    
    public void setIdCiud(int idCiud) {
        this.idCiud = idCiud;
    }
    public int getIdEstd() {
        return this.idEstd;
    }
    
    public void setIdEstd(int idEstd) {
        this.idEstd = idEstd;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CctmCodpId) ) return false;
		 CctmCodpId castOther = ( CctmCodpId ) other; 
         
		 return (this.getIdCodp()==castOther.getIdCodp())
 && (this.getIdMncp()==castOther.getIdMncp())
 && (this.getIdCiud()==castOther.getIdCiud())
 && (this.getIdEstd()==castOther.getIdEstd());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdCodp();
         result = 37 * result + this.getIdMncp();
         result = 37 * result + this.getIdCiud();
         result = 37 * result + this.getIdEstd();
         return result;
   }   


}

