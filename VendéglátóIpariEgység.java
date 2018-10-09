/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class VendéglátóIpariEgység {
    private String nev;
    private int ferohelyekSzama;
    private boolean dohanyzo;

    public VendéglátóIpariEgység(String nev, int ferohelyekSzama, boolean dohanyzo) {
        this.nev = nev;
        this.ferohelyekSzama = ferohelyekSzama;
        this.dohanyzo = dohanyzo;
    }

    public String getNev() {
        return nev;
    }

    public int getFerohelyekSzama() {
        return ferohelyekSzama;
    }

    
    public boolean isDohanyzo(){
        return dohanyzo;
    }

    public void setDohanyzo(boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }

    @Override
    public String toString() {
        return "Vend\u00e9gl\u00e1t\u00f3IpariEgys\u00e9g{" + "nev=" + nev + ", ferohelyekSzama=" + ferohelyekSzama + ", dohanyzo=" + dohanyzo + '}';
    }
    
    
    
    
}
