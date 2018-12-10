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
public class Nevek {
    String nev;
    String varos;
    int bevetel;
    int db;

    public Nevek(String nev, String varos) {
        this.nev = nev;
        this.varos = varos;
    }

    public String getNev() {
        return nev;
    }

    public int getBevetel() {
        return bevetel;
    }

    public int getDb() {
        return db;
    }
}
