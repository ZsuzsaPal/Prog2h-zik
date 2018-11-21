package karacsonyi_hozzavalok;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Karacsony implements Comparable<Karacsony> {
    private String hozzavalok;
    private int darab;

    public Karacsony(String hozzavalok, int darab) {
        this.hozzavalok = hozzavalok;
        this.darab = darab;
    }

    public String getHozzavalok() {
        return hozzavalok;
    }

    public int getDarab() {
        return darab;
    }

    public void setHozzavalok(String hozzavalok) {
        this.hozzavalok = hozzavalok;
    }

    public void setDarab(int darab) {
        this.darab = darab;
    }
    

    @Override
    public String toString() {
        return this.hozzavalok + ";" + this.darab;
    }
    
    @Override
    public int compareTo(Karacsony o){
        if(Integer.compare(this.getDarab(),o.getDarab())==0){
            return this.getHozzavalok().compareTo(o.getHozzavalok());
        }
        return -1*Integer.compare(this.getDarab(),o.getDarab());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Karacsony)){
            return false;
        }
        Karacsony k = (Karacsony) obj;
        return this.hozzavalok.equals(k.getHozzavalok());
    }
    
    
    
    
    
}
