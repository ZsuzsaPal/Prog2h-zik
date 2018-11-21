/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osztalypenz;

import java.util.Objects;

/**
 *
 * @author Admin
 */
public class Gyerekek implements Comparable<Gyerekek>{
    private String nev;
    private int penz;

    public Gyerekek(String nev, int penz) {
        this.nev = nev;
        this.penz = penz;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getPenz() {
        return penz;
    }

    public void setPenz(int penz) {
        this.penz = penz;
    }

    @Override
    public String toString() {
        return this.nev+ ";" + this.penz;
    }
    
   
    @Override
    public int compareTo(Gyerekek gy){
        if(Integer.compare(this.getPenz(),gy.getPenz())==0){
            return this.getNev().compareTo(gy.getNev());
        }
        return -1*Integer.compare(this.getPenz(),gy.getPenz());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Gyerekek)){
        return false;
    }
        Gyerekek gy = (Gyerekek) obj;
        return this.nev.equals(gy.getNev());
    }
    
    
    
    
}
