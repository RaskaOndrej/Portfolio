/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.sprava_pojistencu;

import java.util.ArrayList;

/**
 *
 * @author Ondřej
 */
public class Databaze {
    
    private ArrayList<Pojistenec> pojistenci;
    
    public Databaze() {
        pojistenci = new ArrayList<>();
    }
    
    public void pridejPojistence(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        pojistenci.add(new Pojistenec(jmeno, prijmeni, vek, telefonniCislo));
    }
    
    public void vypisVsechnyPojistence() {
        for (Pojistenec p : pojistenci) {
            System.out.println(p);
            System.out.println("");
        }
    }
    
    public void najdiPojistence(String hledaneJmeno, String hledanePrijmeni) {
        ArrayList<Pojistenec> nalezeniPojistenci = new ArrayList<>();
        for (Pojistenec p : pojistenci) {
            if (p.getJmeno().equals(hledaneJmeno) && p.getPrijmeni().equals(hledanePrijmeni)) {
                nalezeniPojistenci.add(p);
            }                        
        }
        if (!nalezeniPojistenci.isEmpty()) {
            System.out.println("Nalezeno " + nalezeniPojistenci.size() + " záznamů:");
            System.out.println("");
            for (Pojistenec p : nalezeniPojistenci) {
                System.out.println(p);
                System.out.println("");               
            }
        }
        else {
            System.out.println("Zadaným parametrům neodpovídá žádný záznam v databázi.");
        }        
    }
}