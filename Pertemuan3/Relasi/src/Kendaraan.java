/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 02 Maret 2026
 */

public class Kendaraan {
    // Atribut
    private String noPlat;
    private String jenis;

    // Method
    // Konstruktor dengan parameter
    public Kendaraan (String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = " ";
        this.jenis = " ";
    }

    // Selektor
    // Mengembalikan String noPLat
    public String getnoPlat() {
        return noPlat;
    }

    // Mengembailkan String jenis
    public String getjenis() {
        return jenis;
    }

    // Mutator
    // Mengeset noPlat
    public void setnoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // Mengeset jenis
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Mencetak kendaraan
    public void printDetailKendaraan() {
        System.out.println("noPlat : " + noPlat);
        System.out.println("Jenis Kendaraan : " + jenis);
    }
}
