/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

/**
 *
 * @author Admin
 */
public class Ora {
    private int kód;
    private String név;
    private int kezdés;

    public Ora(int kód, String név, int kezdés) {
        this.kód = kód;
        this.név = név;
        this.kezdés = kezdés;
        if(kezdés < 8){
            this.kezdés=8;
        }
        if(kezdés>19){
            this.kezdés=19;
        }
    }

    public int getKód() {
        return kód;
    }

    public void setKód(int kód) {
        this.kód = kód;
    }

    public String getNév() {
        return név;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public int getKezdés() {
        return kezdés;
    }

    public void setKezdés(int kezdés) {
        this.kezdés = kezdés;
    }

    @Override
    public String toString() {
        return "Ora{" + "k\u00f3d=" + kód + ", n\u00e9v=" + név + ", kezd\u00e9s=" + kezdés + '}';
    }
    
    
}
