
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SzoparMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Beolvassuk az első sort,aminek 1 db szamot kell tartalmaznia
       String sor=sc.nextLine();
       
       //Atalakitjuk szamma a szoveget mert szövegkent olvastuk be
       int n=Integer.parseInt(sor);
       
       //Ebben taroljuk a forban letrehozott szoparokat,pontosan n darabot
        ArrayList<Szopar> szoparok=new ArrayList<>();
       
       //n darab sort olvasunk be es dolgozunk fel
       for(int i=0;i<n;i++){
           sor = sc.nextLine();
           //Feldaraboljuk a ':' karakter mentén,mert a két szót egy darab ':' választ el
           String[] darabok=sor.split(":");
           
           //letrehozok egy szopar objektumot,megadom neki az angol es magyar szavakat
           Szopar szopar = new Szopar(darabok[0],darabok[1]);
           szoparok.add(szopar);//szoparokhoz adom hozza 
           
           
       }
       //A rendezes itt tortenik meg,meg fogja hivni a compareTo() metodust ahanyszor kell,hogy rendezett legyen a lista
       Collections.sort(szoparok);
        System.out.println("");
       
       //foreach ciklus 
       //2 reszbol all: Szopar szopar-> ciklusvaltozo (Szopar a tipusa)
       //szoparok-> melyik listan megyunk vegig
       for(Szopar szopar:szoparok){
        System.out.println(szopar.toString());
    }
       
    }
}
