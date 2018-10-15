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
public class Fejesek {
    String nev;
    String elotte;

    public Fejesek(String nev, String elotte) {
        this.nev = nev;
        this.elotte = elotte;
    }
    
   
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
        n = Integer.parseInt(line.split(";")[0]);
        String elso=line.split(";")[1];
        String x=line.split(";")[2];
        
        Fejesek t[]=new Fejesek[n-1];
        for(int i=1;i<n-1;i++){
            line=sc.nextLine();
            t[i]=new Fejesek(line.split(";")[0],line.split(";")[1]);
           
        }
        
        String tomb[]=new String[n];
        tomb[0]=elso;
        int index=1;
        int j=0;
        while(index!=n){
            if(elso.equals(t[j].elotte)){
                tomb[index]=t[j].nev;
                index++;
                elso=t[j].nev;
                j=0;
            }
            else{
                j++;
            }
            
        }
        int k=0;
        int piros=0;
        int kek=0;
        while(!x.equals(tomb[k])){
            if(k%2==0){
                piros++;
            }
            else{
                kek++;
            }
            k++;
        }
        System.out.println(piros+" "+kek);   
    }
}
