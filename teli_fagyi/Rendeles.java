/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teli_fagyi;

import java.util.List;

/**
 *
 * @author Admin
 */
public class Rendeles {
    private String nev;
    private List<String> izek;

    public Rendeles(String nev, List<String> izek) {
        this.nev = nev;
        this.izek = izek;
    }

    public String getNev() {
        return nev;
    }

    public List<String> getIzek() {
        return izek;
    }

    
  
    
    
}
