
import java.util.Random;
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
public class MainJáték {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
       while(true){
         String valasztott;
        valasztott = sc.nextLine();
        if(valasztott.equals("vege")){
            break;
        }
        if(!valasztott.equals("ko") && !valasztott.equals("papir") && !valasztott.equals("ollo")){
            continue;
        }
        Random random = new Random();
        int gepValasztott=random.nextInt(3);//boundos kell,mert az adja vissza,hogy mennyi max,ETTŐL kisebb számot generál
           System.out.println("Gép ezt adta:" );
        if (gepValasztott==0){
            System.out.println("Kő");
         }
        if (gepValasztott==1){
            System.out.println("Papír");
         }
        if (gepValasztott==2){
            System.out.println("olló");
         }
        //0->ko
        //1->papir
        //2->ollo
        if(valasztott.equals("ko") && gepValasztott==0 ){
            System.out.println("Döntetlen");
        }
        else if(valasztott.equals("ko") && gepValasztott==1){
            System.out.println("Gép nyert");
        }
        else if(valasztott.equals("ko") && gepValasztott==2){
            System.out.println("Ön nyert");
        }
       }
        
        
        
    }
}
