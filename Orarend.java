/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

/**
 *
 * @author Admin
 */
public class Orarend {
    private String nap;
    private Ora[] orak;
    private int szamlalo;

    public Orarend(String nap) {
        this.nap = nap;
        this.szamlalo=0;
        this.orak = new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public Ora[] getOrak() {
        return orak;
    }


    public int getSzamlalo() {
        return szamlalo;
    }

    

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", orak=" + orak + ", szamlalo=" + szamlalo + '}';
    }
    
  public boolean oratHozzaad(Ora ora){
      if(szamlalo==12){
          return false;
      }
      int kezdodik = ora.getKezdés();
      for(int i=0;i<orak.length;i++){
          //a nullal meg kell nézni hogy ott szabad 
          if(orak[i]!= null && orak[i].getKezdés()==kezdodik){
              return false;
          }
      }
      orak[szamlalo]=ora;
      szamlalo++;
      
      return true;
        
  }
}
