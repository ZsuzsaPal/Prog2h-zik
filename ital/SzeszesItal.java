/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

/**
 *
 * @author Admin
 */
public class SzeszesItal extends Ital {
    private double alkoholTartalom;
    public SzeszesItal(double alkoholTartalom,String név, String kiszerelés, int ár) {
        super(név, kiszerelés, ár);
        this.alkoholTartalom=alkoholTartalom;
    }

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return "alkoholTartalom:" + alkoholTartalom +"% alkoholtartalmu"+super.toString();
    }

  
}
