/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merlegeles;

/**
 *
 * @author Admin
 */
public class Cegek {
     String nev;
    String varos;
    int ev;
    int bevetel;
    int db;

    public Cegek(String nev, String varos, int ev, int bevetel)
    {
        this.nev = nev;
        this.varos = varos;
        this.ev = ev;
        this.bevetel+=bevetel;
        this.db++;
    }
}
