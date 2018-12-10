/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merlegeles;

import java.io.File;
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
    public static void main(String[] args)
    {

        String line;
        String[] sor;

        List<Cegek> cegek=new ArrayList<>();

        try
        {
            File file=new File(args[0]);
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine())
            {
                line=sc.nextLine();
                sor=line.split(":");

                cegek.add(new Cegek(sor[0],sor[1],Integer.parseInt(sor[2]),Integer.parseInt(sor[3])));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }





        List<String> csop_nevek=new ArrayList<>();

        for(Cegek i : cegek)
        {
            if(!csop_nevek.contains(i.nev + " " + i.varos))
            {
                csop_nevek.add(i.nev + " " + i.varos);
            }
        }

        List<Nevek> nevek=new ArrayList<>();

        for(String i : csop_nevek)
        {
            nevek.add(new Nevek(i.split(" ")[0],i.split(" ")[1]));
        }

        for(Nevek x : nevek)
        {
            for (int i = 0; i < cegek.size(); i++)
            {
                if(x.nev.equals(cegek.get(i).nev) && x.varos.equals(cegek.get(i).varos))
                {
                    x.db++;
                    x.bevetel+=cegek.get(i).bevetel;
                }
            }
        }

        Collections.sort(nevek,Comparator.comparing(Nevek::getBevetel,Comparator.reverseOrder()).thenComparing(Nevek::getDb).thenComparing(Nevek::getNev));

        for(Nevek x : nevek)
        {
            System.out.println(x.nev + " (" + x.varos + "): " + x.bevetel);
        }

    }
}
