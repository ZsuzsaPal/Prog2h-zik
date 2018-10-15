
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Túra implements Comparable<Túra> {
    private String nev;
    private Calendar datum;
    private ArrayList<Integer> resztavok;

    public Túra(int ev,int honap,int nap,String nev) {
        this.nev=nev;
        this.datum=new GregorianCalendar(ev,honap -1,nap);
        this.resztavok=new ArrayList<>();
    }
    
    public void hozzaadResztav(int resztav){
        this.resztavok.add(resztav);
    }
    public int osszeszamolResztav(){
        int osszResztav=0;
        for(int i=0;i<this.resztavok.size();i++){
            
            osszResztav+=this.resztavok.get(i);
        }
        return osszResztav;
    }

    @Override
    public int compareTo(Túra masik) {
        int osszResztav=0;
        for(int i=0;i<this.resztavok.size();i++){
            
            osszResztav+=this.resztavok.get(i);
        }
        int osszResztavMasik=0;
        for(int i=0;i<masik.resztavok.size();i++){
            
            osszResztavMasik+=masik.resztavok.get(i);
        }
        if(osszResztav==osszResztavMasik){
            //Dátum alapjan rendezes
            Date datum1 = this.datum.getTime();
            Date datum2=masik.datum.getTime();
            
            int datumKulonbseg=datum1.compareTo(datum2);
            
            if(datumKulonbseg==0){
                //név szerinti rendezés
                return this.nev.compareTo(masik.nev);
            }
                if(datum1.after(datum2)){
                    return 1;
                }
                else{
                    return -1;
            }
        }
        if(osszResztav>osszResztavMasik){
            return -1;
        }
        else{
            return 1;
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat format=new SimpleDateFormat("yyyy;MM;dd;");
        return format.format(this.datum.getTime())+this.nev;
        
    }
    
    
}
