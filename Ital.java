
import java.util.Date;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Ital {
     protected String név;
     protected String kiszerelés;
     private static int ár = 10 ;
     protected Date gyártásiDátum;
     public static double Euroár = 320;

 
    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum = new Date();
    }
 

    public String getNév(){
        return this.név;
    }
    
     public String getKiszerelés(){
         return this.kiszerelés;
     }
     
     
     
     public Date getGyártásiDátum(){
         return this.gyártásiDátum;
     }
 
     public void setÁr(int ár){
         Ital.ár = ár;
     }
    public double getAktuálisÁr(){
         return ár/Euroár;
         
             }
 
     @Override
    public String toString(){
        return név + ","+ kiszerelés + ","+ ár + "Ft";
    
    }
     @Override
    public boolean equals(Object other){
        Ital otherItal = (Ital)other;
        if(this.név != otherItal.név){
            return false;
        }
        if(this.ár != otherItal.ár){
            return false;
        }
        if(this.kiszerelés != otherItal.kiszerelés){
            return false;
        }
       return true;
}
}
