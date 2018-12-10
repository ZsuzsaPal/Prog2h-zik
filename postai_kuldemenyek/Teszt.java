/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postai_kuldemenyek;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Teszt {
    public static void main(String[] args) {
        String line;
        String[] sor;
        
        List<Cimzett> cimzettek = new ArrayList<Cimzett>();
        
        try{
            FileReader fr = new FileReader(new File("sample.txt"));
            BufferedReader br = new BufferedReader(fr);
            Scanner sc = new Scanner(fr);
            while(sc.hasNextLine()) //megnezi h van e meg kovetkezo sor
            {
                line=sc.nextLine();
                sor=line.split(":");
                cimzettek.add(new Cimzett(sor[0],Integer.parseInt(sor[1]),sor[2],sor[3],Integer.parseInt(sor[4]),Integer.parseInt(sor[5])));
            }
            }catch(Exception e){
            e.printStackTrace();
        }
        
        List<Integer> iranyitok=new ArrayList<>();

        for(Cimzett item : cimzettek)
        {
            if(!iranyitok.contains(item.getIranyitoszam())) //megnezzuk,hogy az iranyitoszamokat tartalmazza-e mar az iranyitok lista,ha nem, hozzaadjuk
            {
                iranyitok.add(item.getIranyitoszam());
            }
        }
         Collections.sort(iranyitok);//itt rendezzuk az iranyitoszamokat tartalmazo listat(alapertelmezetten csokkenobe

        int osszeg=0;
        List<Cimzett> kiir=new ArrayList<>();

        for(Integer item : iranyitok)
        {
            for(Cimzett item2 : cimzettek)
            {
                if(item==item2.getIranyitoszam())
                {
                    osszeg+=item2.getCsomag_erteke();

                    kiir.add(item2); //kiir.add(new Cimzett(item2.getCimzett_neve(),item2.getIranyitoszam(),item....))
                }
            }

            Collections.sort(kiir, Comparator.comparing(Cimzett::getTelepules)
                    .thenComparing(Cimzett::getUtca)
                    .thenComparing(Cimzett::getHazszam)
                    .thenComparing(Cimzett::getCimzett_neve)
                    .thenComparing(Cimzett::getCsomag_erteke,Comparator.reverseOrder()));

            System.out.println(item + ": " + osszeg + " Ft");
            for(Cimzett item3 : kiir)
            {
                // System.out.println(item3.getTelepules() + " " + item3.getUtca() + " " + item3.getHazszam() + " " + item3.getCimzett_neve() + " " + item3.getCsomag_erteke());
                System.out.println(item3.toString());
            }

            osszeg=0;
            kiir=new ArrayList<>();

        }
    
    }
}
