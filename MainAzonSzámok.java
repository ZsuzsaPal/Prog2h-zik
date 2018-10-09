/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MainAzonSzámok {
    public static void main(String[] args){
        int[] randomSzamokTomb = new int[100];
        for(int i=0;i<100;i++){
            int generaltSzam=(int)Math.floor(Math.random()*3);
            randomSzamokTomb[i]=generaltSzam;
        }
        tombKiir(randomSzamokTomb);
        boolean vaneBenneNegyEgyformaEgymasUtan = isConsecutiveFour(randomSzamokTomb);
        System.out.println("vaneBenneNegyEgyformaEgymasUtan"+ vaneBenneNegyEgyformaEgymasUtan);
    }
     public static boolean isConsecutiveFour(int[] values){
     for(int i=0;i<values.length-3;i++){
         boolean negyEgymastKovetoEgyezo = values[i]==values[i+1] && values[i]==values[i+2] && values[i]==values[i+3];
         if(negyEgymastKovetoEgyezo){
             System.out.println(i+"."+"indexu helyen kezodik");
             return true;
         }
     }
         
     return false;
     }
     
     public static void tombKiir(int[] tomb){
         for(int i=0;i<tomb.length;i++){
             System.out.println(tomb[i]+" ");
         }
         System.out.println();
     }
}
