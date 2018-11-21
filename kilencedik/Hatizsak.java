package kilencedik;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Hatizsak implements Comparable<Hatizsak>{
    private String marka;
    private double urtartalom;
    private int zsebekSzama;
    private boolean vizhatlan;

    public Hatizsak(String marka, double urtartalom, int zsebekSzama, boolean vizhatlan) {
        this.marka = marka;
        this.urtartalom = urtartalom;
        this.zsebekSzama = zsebekSzama;
        this.vizhatlan = vizhatlan;
    }

    public String getMarka() {
        return marka;
    }

    public double getUrtartalom() {
        return urtartalom;
    }

    public int getZsebekSzama() {
        return zsebekSzama;
    }

    public void isVizhatlan(boolean vizhatlan) {
        this.vizhatlan = vizhatlan;
    }

    @Override
    public String toString() {
        return "Hatizsak markaja:" + marka + ", urtartalma" + urtartalom + ", zsebek szama=" + zsebekSzama + ", vizhatlan-e:" + vizhatlan;
        
    }
    
    public int compareTo(Hatizsak t){
        return Integer.compare(this.zsebekSzama,t.zsebekSzama);
    }
    
    
    
    
}
