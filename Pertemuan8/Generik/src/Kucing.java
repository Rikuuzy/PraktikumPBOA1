/* Nama File    : Kucing.java
 * Deskripsi    : berisi atribut dan method dalam class Kucing
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 3 Mei 2026
 */

public class Kucing extends Anabul{
    // Atribut
    private double bobot; // atribut tambahan

    // Konstruktor
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // get & set
    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void Gerak() {
        System.out.println("Kucing : " + getNama() + ", bergerak melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Kucing : " + getNama() + ", berbunyi meong");
    }

}
