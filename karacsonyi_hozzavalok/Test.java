/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karacsonyi_hozzavalok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        List<Karacsony> lista=new ArrayList();
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        while(sor.length()>0){
            String[] darabolt=sor.split(";");
            Karacsony k = new Karacsony(darabolt[0],Integer.parseInt(darabolt[1]));
         
            if(lista.contains(k)){
                lista.get(lista.indexOf(k)).setDarab(lista.get(lista.indexOf(k)).getDarab()+k.getDarab());
            }
            else{
                lista.add(k);
            }
            sor=sc.nextLine();
        }
        Collections.sort(lista);
        for(Karacsony i : lista){
            System.out.println(i);
        }
        
        
        
    }
}
