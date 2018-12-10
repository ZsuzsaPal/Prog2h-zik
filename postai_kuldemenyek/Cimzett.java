/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postai_kuldemenyek;

/**
 *
 * @author Admin
 */
public class Cimzett {
    private String cimzett_neve;
    private int iranyitoszam;
    private String telepules;
    private String utca;
    private int hazszam;
    private int csomag_erteke;

    public Cimzett(String cimzett_neve, int iranyitoszam, String telepules, String utca, int hazszam, int csomag_erteke) {
        this.cimzett_neve = cimzett_neve;
        this.iranyitoszam = iranyitoszam;
        this.telepules = telepules;
        this.utca = utca;
        this.hazszam = hazszam;
        this.csomag_erteke = csomag_erteke;
    }

    public String getCimzett_neve() {
        return cimzett_neve;
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public String getTelepules() {
        return telepules;
    }

    public String getUtca() {
        return utca;
    }

    public int getHazszam() {
        return hazszam;
    }

    public int getCsomag_erteke() {
        return csomag_erteke;
    }

    @Override
    public String toString(){
    
        StringBuilder sb=new StringBuilder();

        sb.append(telepules)
                .append(", ")
                .append(utca)
                .append(" ")
                .append(hazszam)
                .append("., ")
                .append(cimzett_neve)
                .append(", ")
                .append(csomag_erteke)
                .append(" Ft");

        return sb.toString();

    }
}
