/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Lemaradt {
    // A 13-as véletlenül lemaradt.
    // A Metódusok osztályba megírva:
     public static int kisebbFibonacci(int n){
             int a=0;
           int b=1;
           
        int i=0;
        
        int k=1;
            
            while (k<n){
                
                k=a+b;
                
                b=a;
                a=k;
                k=b;
                
                i++;
        }
            return k;
       
  }
   
 // A Mainben meghivva pedig:
     m.kisebbFibonacci(203);
}
