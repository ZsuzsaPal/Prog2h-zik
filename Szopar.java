/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Szopar implements Comparable<Szopar>{
    //Adattagok
    private String angolSzo;
    private String magyarSzo;

    //Adattagok feltoltese ertekekkel
    public Szopar(String angolSzo, String magyarSzo) {
        this.angolSzo = angolSzo;
        this.magyarSzo = magyarSzo;
    }

    
    //Osszehasonlitast vegez azon az objektumon,amelyiken meghivtak es azon amit parameterkent megkap
    //Ebben a feladatban a Collections.sort() fogja hasznalni es meghivni
    @Override
    public int compareTo(Szopar masik) {
        //Megnezzuk hogy a ket angol szo egyenlo e
        int angolSzoOsszehasonlitasEredmeny=this.angolSzo.compareTo(masik.angolSzo);
        
        if(angolSzoOsszehasonlitasEredmeny==0){
            //Magyar szo szerint hasonlitunk ha ez az eset merul fel
          int magyarSzoOsszehasonlitasEredmeny=this.magyarSzo.compareTo(masik.magyarSzo);
          return magyarSzoOsszehasonlitasEredmeny;
        }
        //nem egyezett meg angol szo szerint,visszaadom melyik angol szo van elorebb ABC szerint
        return angolSzoOsszehasonlitasEredmeny;
    }
    
    //Szebb formaban torteno kiiratas
    @Override
    public String toString(){
        return this.angolSzo+":"+this.magyarSzo;
    }

}
