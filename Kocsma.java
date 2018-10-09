/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Kocsma extends VendéglátóIpariEgység {
    private String[] sorlap;

    public Kocsma(String nev, int ferohelyekSzama,boolean dohanyzo,String[] sorlap) {
        super(nev, ferohelyekSzama,true);
        this.sorlap=sorlap;
    }

    public String[] getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return super.toString()+ "Kocsma{" + "sorlap=" + sorlap + '}';
    }
     
    
}
