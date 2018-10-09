/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TesztVendéglátó {
    public static void main(String[] args) {
        VendéglátóIpariEgység[] v = new VendéglátóIpariEgység[10];
        v[0]= new Étterem("Kerekerdő",50,false,new String[]{"rántott sajt rizzsel","sült hal sültkrumplival","pacalpörkölt"});
        v[1]= new Étterem("Pálma",100,false,new String[]{"tatárbeefsteak","sült oldalas","szűzérme"});
        v[2]= new Étterem("Szilvafa",60,false,new String[]{"sült libamáj","babgulyás","zúzapörkölt"});
        v[3]= new Étterem("Rákolló",120,false,new String[]{"herkenytűburger","sült krumpli","chicken nuggets"});
        v[4]= new Étterem("Ínyenc",90,false,new String[]{"sajttal töltött pulykamell","borzas szelet","rántott karfiol és gomba"});
        v[5]= new Kocsma("Blues",30,true,new String[]{"jim beam","soproni","jägermeister","royal"});
        v[6]= new Kocsma("Teniszke",20,true,new String[]{"jack","kőbányai","gin","rum"});
        v[7]= new Kocsma("Roncs",50,true,new String[]{"hubertus","krusovice","fütyülős","absinth"});
        v[8]= new Kocsma("Valhalla",40,true,new String[]{"heineken","soproni","jägermeister","unicum"});
        v[9]= new Kocsma("Kaktusz",50,true,new String[]{"whisky","borsodi","soproni","baileys"});
        
        Kocsma [] kocsmák = adottItaltKínálóKocsmák("soproni",v);
        for(Kocsma k:kocsmák)
            System.out.println(k);
        
        
    }
    
    public static Kocsma[] adottItaltKínálóKocsmák(String ital,VendéglátóIpariEgység[] t){
        
        int szamlalo=0;
        for(int i=0;i<t.length;i++){
            if(t[i] instanceof Kocsma){
                Kocsma k = (Kocsma)t[i];
                for(int j=0;j<k.getSorlap().length;j++){
                    if(k.getSorlap()[j].equals(ital)){
                        
                        szamlalo++;
                        }
                }
            }
        }
        Kocsma[] kocsma=new Kocsma[szamlalo];
        int l=0;
        for(int i=0;i<t.length;i++){
            if(t[i] instanceof Kocsma){
                Kocsma k = (Kocsma)t[i];
                for(int j=0;j<k.getSorlap().length;j++){
                    if(k.getSorlap()[j].equals(ital)){
                        kocsma[l]=k;
                           l++;  
                    }
                    }
        }
        
      
    }
        return kocsma;
}
}
//Kocsma[] KínálóKocsmák = new Kocsma[t.length];
//KínálóKocsmák[szamlalo]=kocsma;