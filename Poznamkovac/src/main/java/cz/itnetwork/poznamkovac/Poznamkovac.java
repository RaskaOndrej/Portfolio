/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cz.itnetwork.poznamkovac;

import java.util.Scanner;

/**
 *
 * @author Ondřej
 */
public class Poznamkovac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Diar diar = new Diar();
        String volba = "";
        // hlavní cyklus
        while (!volba.equals("4")) {
            diar.vypisUvodniObrazovku();
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat záznam");
            System.out.println("2 - Vyhledat záznamy");
            System.out.println("3 - Vymazat záznam");
            System.out.println("4 - Konec");
            volba = sc.nextLine();
            System.out.println();
            // reakce na volbu
            switch (volba) {
                case "1":
                    diar.pridejZaznam();
                    break;
                case "2":
                    diar.vyhledejZaznamy();
                    break;
                case "3":
                    diar.vymazZaznamy();
                    break;
                case "4":
                    System.out.println("Libovolnou klávesou ukončíte program...");
                    break;
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                    break;
            }
        }
    }
}
