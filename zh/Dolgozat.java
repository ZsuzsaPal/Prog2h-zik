/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import egyetem.Pontozhato;

/**
 *
 * @author Admin
 */
public class Dolgozat implements Pontozhato {
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }
    
      public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public boolean megfelelt() {
        if(this.getPontszam() == -1){
            System.out.println("Nem irt");
            return false;
        }
        else if(this.getPontszam() != -1&& this.getPontszam() <=35 ){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "Pontszam:"+ pontszam;
    }
     
  
    
    
}
