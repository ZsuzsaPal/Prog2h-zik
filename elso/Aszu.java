package elso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Aszu extends Bor {
    private int puttonySzam;
    public Aszu(int p,String t, double a) {
        super("",t,"",a);
        this.puttonySzam=p;
    }
public int hanyPuttonyos(){
    return puttonySzam;
}

    @Override
    public String toString() {
        return "Puttony szama:" + puttonySzam;
    }
   

    

    
}
