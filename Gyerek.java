/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Gyerek {
    public String nev;
    public String elotteAlloNeve;
    public Gyerek elotte;
    
    public Gyerek(String nev, Gyerek elotte, String elotteAlloNeve) {
        this.nev = nev;
        this.elotte = elotte;
        this.elotteAlloNeve = elotteAlloNeve;
    }
}
