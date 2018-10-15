/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

/*az első katona támadóereje - a második védőereje, (ekkor az első katona nyer) 
• vagy a második katona támadóereje - az első védőereje. (ekkor a második nyer) 
• ha a két érték megegyezik, akkor az első katona nyer.
A metódus írja ki mely katonák küzdtek meg, és ki nyert.  
*/


public class Teszt {
    public static Katona megkuzd(Katona kat1,Katona kat2){
        Katona gyoztes = new Katona();
        if(kat1.getTamadoero()>kat2.getVedoero()){
            gyoztes=kat1;
        }
        else if(kat2.getTamadoero()>kat1.getVedoero()){
              gyoztes=kat2;
        }
        if(kat1.getTamadoero()==kat2.getVedoero() && kat2.getTamadoero()==kat1.getVedoero()){
            gyoztes=kat1;
        }
        System.out.println("Ezek a katonak kuzdenek meg egymassal: "+kat1+" "+"es"+" "+kat2);
        System.out.println("A gyoztes: "+gyoztes);
        return gyoztes;
    }
    public static void main(String[] args) {
        Katona katona1 = new Nyilas(1,7,2);
        Katona katona2 = new Nyilas(2,6,3);
        Katona katona3 = new Landzsas(4,6);
        
        Katona gyoztes1 = megkuzd(katona1,katona2);
        Katona gyoztes2 = megkuzd(katona3,gyoztes1);
        System.out.println("Eletben maradt: "+gyoztes2);
    }
    
}
