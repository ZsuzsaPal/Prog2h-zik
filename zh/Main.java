/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hanyHallgato = Integer.parseInt(sc.nextLine());
        Hallgato[] h = new Hallgato[hanyHallgato];
        for(int i = 0; i<hanyHallgato;i++){
            String sor = sc.nextLine();
            String[] adat=sor.split(" ");
            h[i]=new Hallgato(Integer.parseInt(adat[0]),Boolean.parseBoolean(adat[1]));
        }
        for(int i=0;i<hanyHallgato;i++){
            Dolgozat elso = h[i].dolgozatotir();
            Dolgozat masodik = h[i].dolgozatotir();
            if(elso.megfelelt()==true && masodik.megfelelt()==true){
                System.out.println("Megfelelt");
            }
            else if(elso.getPontszam()==-1 || masodik.getPontszam()==-1){
                System.out.println("Nem irt");
            }
            
            else{
                System.out.println("Nem felelt meg");
            }
            
        }
    }
}
