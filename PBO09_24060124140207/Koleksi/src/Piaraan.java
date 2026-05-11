/* Nama File    : Piaraan.java
 * Deskripsi    : berisi atribut dan method dari class Piaraan
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 4 Mei 2026
 */

import java.util.LinkedList;
import java.util.Queue;
public class Piaraan {
    // Atribut
    private int nbelm;
    private Queue<Anabul> Lanabul;
    
    // Konstruktor
    public Piaraan () {
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    // get banyaka elemen
    public int getNbelm() {
        return this.nbelm;
    }

    // Menambahkan elemen ekhir ke antrean
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    // mengecek anabul ada dalam antrean
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    // ambil data anabul pertama
    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    // ambil data anabul pertama sekaligus mengeluarkan dari antrean
    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.poll();
        }
        return null;
    }

    // procedure showAnabul
    public void showAnabul() {
        System.out.println("Daftar Anabul");
        for (Anabul a : Lanabul) {
            if (a.getPanggilan() != null) {
                System.out.println("- " + a.getPanggilan());
            }
            else {
                System.out.println("- " + a.getNama());
            }
        }
    }
    // menghitung jumlah keluarga Kucing dalam antrean
    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // menghitung total bobot Kucing dalam antrean
    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                totalBobot += ((Kucing) a).getBobot();
            }
        }
        return totalBobot;
    }

    // procedure showJenisAnabul
    public void showJenisAnabul() {
        System.out.println("Daftar Anabul beserta Jenis Kelasnya");
        for (Anabul a : Lanabul) {
            String tampil;
            if (a.getPanggilan() != null) {
                tampil = a.getPanggilan();
            }
            else {
                tampil = a.getNama();
            }
            System.out.println("- " + tampil + ", Jenis : " + a.getClass().getSimpleName());
        }
    }

    
}
