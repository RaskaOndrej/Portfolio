/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.poznamkovac;

import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 *
 * @author Ondřej
 */
public class Databaze {
    
    private ArrayList<Zaznam> zaznamy;
    
        public Databaze() {
        zaznamy = new ArrayList<>();
    }

    public void pridejZaznam(LocalDateTime datumCas, String text) {
            zaznamy.add(new Zaznam(datumCas, text));
        }

    public ArrayList<Zaznam> najdiZaznamy(LocalDateTime datum, boolean dleCasu) {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for (Zaznam z : zaznamy) {
            if ((dleCasu && z.getDatumCas().equals(datum)) ||
                (!dleCasu && z.getDatumCas().toLocalDate().equals(datum.toLocalDate()))) {
                nalezene.add(z);
            }
        }
        return nalezene;
    }

    public void vymazZaznamy(LocalDateTime datum) {
        ArrayList<Zaznam> nalezeno = najdiZaznamy(datum, true);
        for (Zaznam z : nalezeno) {
            zaznamy.remove(z);
        }
    }    
}
