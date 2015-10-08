package com.mx.teknei.pcabordo.lib.entities;
// Generated 8/10/2015 10:59:21 AM by Hibernate Tools 4.3.1



/**
 * CctmColnId generated by hbm2java
 */
public class CctmColnId  implements java.io.Serializable {


     private int idColn;
     private int idCodp;
     private int idMncp;
     private int idEstd;

    public CctmColnId() {
    }

    public CctmColnId(int idColn, int idCodp, int idMncp, int idEstd) {
       this.idColn = idColn;
       this.idCodp = idCodp;
       this.idMncp = idMncp;
       this.idEstd = idEstd;
    }
   
    public int getIdColn() {
        return this.idColn;
    }
    
    public void setIdColn(int idColn) {
        this.idColn = idColn;
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
    public int getIdEstd() {
        return this.idEstd;
    }
    
    public void setIdEstd(int idEstd) {
        this.idEstd = idEstd;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CctmColnId) ) return false;
		 CctmColnId castOther = ( CctmColnId ) other; 
         
		 return (this.getIdColn()==castOther.getIdColn())
 && (this.getIdCodp()==castOther.getIdCodp())
 && (this.getIdMncp()==castOther.getIdMncp())
 && (this.getIdEstd()==castOther.getIdEstd());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdColn();
         result = 37 * result + this.getIdCodp();
         result = 37 * result + this.getIdMncp();
         result = 37 * result + this.getIdEstd();
         return result;
   }   


}


