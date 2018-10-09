/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iskola;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
            String nap;
            int orakSzama;
            
            System.out.print("Nap: ");
            nap = sc.next();//beolvassuk és eltároljuk
            
            
            System.out.print("Hány óra: ");
            orakSzama = sc.nextInt();//nextInt mert számról van szóhét
            
            int szamlalo=0;
            Ora[] orak = new Ora[12];
            
            for(int i=0;i< orakSzama;i++){
                int kód;
                String név;
                int kezdés;
               System.out.print("Kód: ");
               kód = sc.nextInt();
               System.out.print("Név: ");
               név = sc.next();
               System.out.print("Kezdés: ");
               kezdés = sc.nextInt();
               Ora ora = new Ora(kód, név, kezdés);
               orak[szamlalo]=ora;
               szamlalo++;
            }
          Orarend orarend = new Orarend(nap);
          for(int j=0;j<orak.length;j++){
              if(orak[j] == null){
                  continue;//azért kell mert ha nincs óra,akkor megyünk tovább
              }
              if(orarend.oratHozzaad(orak[j])){
                  System.out.println("Sikeres hozzáadás");
              }
              else{
                  System.out.println("Sikertelen");
              }
          }
          
          
        System.out.println("Órarend adatai: ");
        System.out.println(orarend.toString());
     }
        
}

