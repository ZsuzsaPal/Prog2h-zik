
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
public class BudapestKupa {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    
    String sor = sc.nextLine();
    int n = Integer.parseInt(sor);
    ArrayList<Túra> turak=new ArrayList<>();
    
    for(int i=0;i<n;i++){
    sor=sc.nextLine();
    String[] darabok=sor.split(";");
    int ev=Integer.parseInt(darabok[0]);
    int honap=Integer.parseInt(darabok[1]);
    int nap=Integer.parseInt(darabok[2]);
    
    Túra túra = new Túra(ev,honap,nap,darabok[3]);
    for(int j=4;j<darabok.length;j++){
        int resztav=Integer.parseInt(darabok[j]);
        túra.hozzaadResztav(resztav);
    
    }
    turak.add(túra);
  }
        Collections.sort(turak);//turakat ez rendezi csökkenő sorrendbe
        
        Túra túra=turak.get(0);
        System.out.println(túra.toString());
        for(int i=1;i<turak.size();i++){
            if(túra.osszeszamolResztav()==turak.get(i).osszeszamolResztav()){
                System.out.println(turak.get(i).toString());
            }
        }
        
        
        System.out.println();
        System.out.println(turak.get(0).toString());
}
}
