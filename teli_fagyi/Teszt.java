/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teli_fagyi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Teszt {
    public static void main(String[] args) {
        
         String line;
        String[] sor;
        String[] izek_sor;
        String nev;

        List<String> izek=new ArrayList<>();
        List<Rendeles> rendelesek=new ArrayList<>();

        Scanner sc=null;
        File file=new File(args[0]);

        try
        {
            sc=new Scanner(file);

            while(sc.hasNextLine())
            {
                line=sc.nextLine();

                sor=line.split(";");

                nev=sor[0];

                izek_sor=sor[1].split(",");

                for (int i = 0; i < izek_sor.length; i++)
                {
                    izek.add(izek_sor[i]);
                }

                rendelesek.add(new Rendeles(nev,izek));

                izek=new ArrayList<>();

            }

        }
        catch (Exception e)
        {

        }

        for(Rendeles item : rendelesek)
        {
            System.out.printf(item.getNev() + ": ");
            for(String item2 : item.getIzek())
            {
                System.out.printf("%s ",item2);
            }

            System.out.println();
        }

        System.out.println();

        List<Fagyi> fagyik=new ArrayList<>();

        Scanner sc2=new Scanner(System.in);

        while(sc2.hasNextLine())
        {
            line=sc2.nextLine();
            sor=line.split(";");

            fagyik.add(new Fagyi(sor[0],Integer.parseInt(sor[1])));

        }

        for(Fagyi item : fagyik)
        {
            System.out.println(item.getNev() + " " + item.getAr());
        }

        boolean van=true;
        int db=0;

        List<Rendeles> jok=new ArrayList<>();

        for(Rendeles item : rendelesek)
        {
            for(String item2 : item.getIzek())
            {
                for(Fagyi item3 : fagyik)
                {
                    if(!item3.getNev().equals(item2))
                    {
                        van=false;
                    }
                    else
                    {
                        van=true;
                        break;
                    }
                }

            }
            if(van)
            {
                db++;
                jok.add(item);
            }
        }

        int ar=0;

        for(Rendeles item : jok)
        {
            for(String item2 : item.getIzek())
            {
                for(Fagyi item3 : fagyik)
                {
                    if(item2.equals(item3.getNev()))
                    {
                        ar+=item3.getAr();
                    }
                }
            }
        }

        System.out.println(db +" rendeles");
        System.out.println(ar + " Ft");
        
    
        
     }
        
    }

