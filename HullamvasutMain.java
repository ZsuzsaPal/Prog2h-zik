
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
public class HullamvasutMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String sor = sc.nextLine();
        
        int n = Integer.parseInt(sor);
        
        ArrayList<Hullamvasut>hullamvasut =new ArrayList<>();
        for(int i=0;i<n;i++){
        sor = sc.nextLine();
            String darabok[] = sor.split(";");
            String nev = darabok[0];
            String vilag_nev=darabok[1];
            int magassag=Integer.parseInt(darabok[2]);
            int varakozasi_ido=Integer.parseInt(darabok[3]);
            
            Hullamvasut h = new Hullamvasut(nev,vilag_nev,magassag,varakozasi_ido);        
            hullamvasut.add(h);
        }
        Collections.sort(hullamvasut);
        
        System.out.println("");
        
        for(Hullamvasut h:hullamvasut){
            System.out.println(hullamvasut.toString());
        }
    
}
}

