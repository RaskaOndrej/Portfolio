/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.sprava_pojistencu;

/**
 *
 * @author Ondřej
 */
public class Pojistenec {
    
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String telefonniCislo;
    
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }
    
    @Override
    public String toString() {
        return String.format(jmeno + " " + prijmeni + "\n"
                             + "Věk: " + vek + " let" + "\n"
                             + "Telefonní číslo: " + telefonniCislo);
    }       
}
