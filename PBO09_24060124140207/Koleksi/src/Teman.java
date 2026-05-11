/* Nama File    : Teman.java
 * Deskripsi    : berisi atribut dan method dari class Teman
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 4 Mei 2026
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teman {
    // Atribut
    private int nbelm;
    private List<String> Lnama;

    // Konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // getNbelm
    public int getNbelm() {
        return nbelm;
    }

    // getNama
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            return Lnama.get(indeks);
        }
        return null;
    }
    
    // setNama
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < Lnama.size()) {
            Lnama.set(indeks, nama);
        }
    }

    // addNama
    public void addNama(String nama) {
        Lnama.add(nama);
        this.nbelm++;
    }

    // delNama
    public void delNama(String nama) {
        Lnama.remove(nama);
        this.nbelm--;
    }

    // isMember
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // gantiNama
    public void gantiNama(String nama, String namabaru) {
        int indeks = Lnama.indexOf(nama);
        Lnama.set(indeks, namabaru);
    }

    // countNama
    public int countNama(String nama) {
        return Collections.frequency(Lnama, nama);
    }
        
    // DetailTeman
    public void showTeman() {
        System.out.println("Daftar Teman : ");
        for (String n : Lnama) {
            System.out.println("-" +  n);
        }
    }
}
