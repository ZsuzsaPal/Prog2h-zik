/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osztalypenz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        List<Gyerekek>lista = new ArrayList();
        
        while(sor.length()>0){
            String[] darabok = sor.split(";");
            Gyerekek gy = new Gyerekek(darabok[0],Integer.parseInt(darabok[1]));
            
            if(lista.contains(gy)){
                lista.get(lista.indexOf(gy)).setPenz(lista.get(lista.indexOf(gy)).getPenz()+gy.getPenz());
            }
            else{
                lista.add(gy);
            }
            sor=sc.nextLine();
            
        }
        for(int i=0;i<lista.size()-1;i++){
            for(int j=i+1;j<lista.size();j++){
                if(lista.get(i).getPenz()==lista.get(j).getPenz()){
                    if(lista.get(i).getNev().compareTo(lista.get(j).getNev())>0){
                        Gyerekek tmp =lista.get(i);
                        lista.set(i,lista.get(j));
                        lista.set(j,tmp);
                    }
                }
            }
        }
        for(Gyerekek i : lista){
            System.out.println(i);
        }
    }
}
