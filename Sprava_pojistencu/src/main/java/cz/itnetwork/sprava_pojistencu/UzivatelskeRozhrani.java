/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.sprava_pojistencu;

import java.util.Scanner;

/**
 *
 * @author Ondřej
 */
public class UzivatelskeRozhrani {
    
    private Scanner sc = new Scanner(System.in, "Windows-1250");
    
    private Databaze databaze;
    
    public UzivatelskeRozhrani() {
        databaze = new Databaze();
        databaze.pridejPojistence("Petr", "Novák", 45, "111 111 111");
        databaze.pridejPojistence("Karel", "Nový", 32, "222 222 222");
    }
    
    public void pridejPojistence() {
        System.out.println("Zadej jméno: ");
                    String jmeno = sc.nextLine();
                    System.out.println("Zadej příjmení: ");
                    String prijmeni = sc.nextLine();
                    System.out.println("Zadej věk: ");
                    int vek = Integer.parseInt(sc.nextLine());
                    System.out.println("Zadej telefonní číslo: ");
                    String telefonniCislo = sc.nextLine();
                    databaze.pridejPojistence(jmeno, prijmeni, vek, telefonniCislo);
    }
    
    public void vypisVsechnyPojistence() {
        databaze.vypisVsechnyPojistence();
    }
    
    public void najdiPojistence() {
        System.out.println("Zadej jméno pojištěnce:");
                    String hledaneJmeno = sc.nextLine();
                    System.out.println("Zadej příjmení pojištěnce:");
                    String hledanePrijmeni = sc.nextLine();
                    databaze.najdiPojistence(hledaneJmeno, hledanePrijmeni);
    }
    
    public void konecEditace() {
        System.out.println("Program bude ukončen.");
    }
    
    public void neplatnaVolba() {
        System.out.println("Neplatná volba, zadejte prosím číslo v rozmezí 1 - 4:");
    }
    
    
}
