/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

/**
 *
 * @author Admin
 */
public class Hallgato {
    public int mennyitKeszult;
    public boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }
    
    
    public Dolgozat dolgozatotir(){
    double pontszam = 0;
    if(sokatTanul==true){
        pontszam = ((Math.random()* 4)+4) * this.mennyitKeszult;
    }
    else{
        pontszam = (Math.random()*6)*this.mennyitKeszult;
    }
    
    return new Dolgozat((int)pontszam);
    }

    @Override
    public String toString() {
        return "mennyitKeszult=" + mennyitKeszult + ", sokatTanul=" + sokatTanul;
    }
    
    
}
