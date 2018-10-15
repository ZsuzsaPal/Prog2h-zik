
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Nyilas extends Katona {
    private int lotav;

    public Nyilas(int tamadoero, int vedoero,int lotav){
        super(tamadoero+=lotav, vedoero);
        this.lotav = lotav;
    }

    public int getLotav() {
        return lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    @Override
    public String toString() {
        return "Nyilas: " + "TE:"+this.getTamadoero()+","+ "VE:"+super.getVedoero();
    }



    @Override
    public boolean equals(Object obj) {
       super.equals(obj);
       if(!(obj instanceof Nyilas)){
           return false;
       }
       Nyilas ny=(Nyilas)obj;
       if(this.lotav==ny.lotav){
           return true;
       }
       else{
           return false;
       }
    }
    
    

}
