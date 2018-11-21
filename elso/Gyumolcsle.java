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
public class Gyumolcsle extends Ital{
    private Gyumolcs gy;
    public Gyumolcsle(Gyumolcs gy) {
       this.gy=gy;
    }
    public String mibolFacsartak(){
        return gy.getFajta() ;
    }
  

    @Override
    public String mibolKeszul(){
        return gy.getFajta();
    }
    @Override
    public String milyenIzu(){
        return gy.getIz();
    }
}
