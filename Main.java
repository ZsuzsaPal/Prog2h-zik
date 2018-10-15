
import java.util.ArrayList;
import java.util.List;
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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
        String[] feldaraboltElsoSor = line.split(";");
        int n = Integer.parseInt(feldaraboltElsoSor[0]);
        String legkisebbGyerekNeve = feldaraboltElsoSor[1];
        String akinekAszemszogebolNezzukNeve = feldaraboltElsoSor[2];
        
        Gyerek legkisebbGyerek = new Gyerek(legkisebbGyerekNeve, null, null);
        List<Gyerek> gyerekek = new ArrayList<>();
        gyerekek.add(legkisebbGyerek);
        
        for(int i = 0; i < n - 1; i++) {
            line = sc.nextLine();
            String[] feldaraboltSor = line.split(";");
            Gyerek ujgyerek = new Gyerek(feldaraboltSor[0], null, feldaraboltSor[1]);
            gyerekek.add(ujgyerek);
        }
        
        for(Gyerek gyerek : gyerekek) {
            gyerek.elotte = gyerekNevAlapjan(gyerekek, gyerek.elotteAlloNeve);
        }
        
        Gyerek akinekASzemszogebolNezzuk = gyerekNevAlapjan(gyerekek, akinekAszemszogebolNezzukNeve);
        int[] sapkak = {0,0};
        int szamlalo = 0;
        for(Gyerek jelenlegiGyerek = akinekASzemszogebolNezzuk.elotte;
                jelenlegiGyerek != null; jelenlegiGyerek = jelenlegiGyerek.elotte) {
            sapkak[szamlalo % 2]++;
            szamlalo++;
        }
        System.out.println(sapkak[0] + " " + sapkak[1]);
    }
    
    public static Gyerek gyerekNevAlapjan(List<Gyerek> gyerekek, String nev) {
        for (Gyerek gyerek : gyerekek) {
            if(gyerek.nev.equals(nev)) {
                return gyerek;
            }
        }
        return null;
    }
}
