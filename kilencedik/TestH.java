package kilencedik;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TestH {
    
    public static void kiirMarkaSzerintLexikografikusanAzonBelulZsebekSzamaSzerintCsokkenobe(List <Hatizsak> lista){
        for(int i = 0;i<lista.size()-1;i++){
            for(int j=i+1;j<lista.size();j++){
                if(lista.get(i).getMarka().compareTo(lista.get(j).getMarka())==0){
                    if(lista.get(i).getZsebekSzama()<lista.get(j).getZsebekSzama()){
                        Hatizsak tmp = lista.get(i);
                        lista.set(i,lista.get(j));
                        lista.set(j, tmp);
                        
                    }
                }
                else if(lista.get(i).getMarka().compareTo(lista.get(j).getMarka())>0){
                    
                    Hatizsak tmp = lista.get(i);
                        lista.set(i,lista.get(j));
                        lista.set(j, tmp);
                        
                }
            }
        }
        for(Hatizsak i : lista){
            System.out.println(i);
        }
    }
    
    
    
    public static void main(String[] args) {
        List<Hatizsak> hatizsak = new ArrayList<Hatizsak>();
        hatizsak.add(new Hatizsak("Heavy Tools",60,10,true));
        hatizsak.add(new Hatizsak("Package",40,4,false));
        hatizsak.add(new Hatizsak("Nike",50,5,true));
        hatizsak.add(new Hatizsak("Vans",56,3,false));
        hatizsak.add(new Hatizsak("Quecha",70,12,true)); 
        hatizsak.add(new Hatizsak("Puma",44,6,true));
        hatizsak.add(new Hatizsak("Adidas",76,8,true));
        hatizsak.add(new Hatizsak("Heavy Tools",40,6,true)); 
        hatizsak.add(new Hatizsak("Heavy Tools",60,10,false));  
        hatizsak.add(new Hatizsak("Fila",25,3,true));
          
        kiirMarkaSzerintLexikografikusanAzonBelulZsebekSzamaSzerintCsokkenobe(hatizsak);
    }
}
