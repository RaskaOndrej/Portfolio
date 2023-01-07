/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cz.itnetwork.sprava_pojistencu;

import java.util.Scanner;

/**
 *
 * @author Ondřej
 */
public class Sprava_pojistencu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        UzivatelskeRozhrani editorPojistencu = new UzivatelskeRozhrani();        

        int volba = 0;
        
        while (volba != 4) {
            System.out.println("------------------------------");
            System.out.println("Evidence pojištěnců");
            System.out.println("------------------------------");
            System.out.println("Zvol akci:");
            System.out.println("1 - Přidat nového pojištěnce");
            System.out.println("2 - Vypsat všechny pojištěnce");
            System.out.println("3 - Vyhledat pojištěnce");
            System.out.println("4 - Konec");
            volba = Integer.parseInt(sc.nextLine());
            System.out.println("");
            switch (volba) {
                case 1:
                    editorPojistencu.pridejPojistence();
                break;
                case 2:
                   editorPojistencu.vypisVsechnyPojistence();
                break;
                case 3:
                    editorPojistencu.najdiPojistence();
                break;
                case 4:
                    editorPojistencu.konecEditace();
                break;
                default:
                    editorPojistencu.neplatnaVolba();
                break;
            }
        }        
    }
}
