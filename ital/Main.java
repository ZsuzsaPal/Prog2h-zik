/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ital;

/**
 *
 * @author Admin
 */
public class Main {
    public static void rendezNevAlapjan(Ital[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getNév().compareTo(t[j].getNév()) > 0) {
                    Ital temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }
    }

    public static void rendezArAlapjan(Ital[] t) {
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].getÁr() > t[j].getÁr()) {
                    Ital temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Ital[] italok = {
            new SzeszesItal(72, "Tátratea", "0.5 l", 2300),
            new Ital("Coca Cola", "0.5 l", 450),
            new SzeszesItal(9.3, "Csíki", "500 ml", 680),
            new SzeszesItal(4.6, "Kőbányai", "0.5 l", 200),
            new Ital("Pepsi", "1.75 l", 530),
            new SzeszesItal(40, "Royal", "0.7 l", 2100),
            new Ital("Lipton", "1.75 l", 530),
            new Ital("Mirinda", "1.75 l", 530),};

        System.out.println("3 legmagasabb alk.tartalmú ital:");
        for (Ital i : Dolgozat.kulonbozo(italok)) {
            System.out.println(i);
        }

        System.out.println("\nItalok név alapján:");
        rendezNevAlapjan(italok);

        for (Ital i : italok) {
            System.out.println(i.getNév() + ": " + i);
        }

        System.out.println("\nItalok ár alapján:");
        rendezArAlapjan(italok);

        for (Ital i : italok) {
            System.out.println(i.getÁr() + "Ft: " + i);
        }
    }
}
