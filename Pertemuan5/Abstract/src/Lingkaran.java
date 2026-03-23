/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran, implementasi abstract class.
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 22 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize{
    // Atribut
    public double jari;
    
    // Method
    // Konstruktor
    public Lingkaran() {
        setJmlSisi(1);
    }

    // Konstruktor dengan parameter
    public Lingkaran(double diameter, String warna, String border) {
        super(warna, border);
        this.jari = diameter / 2;
        setJmlSisi(1);

    }

    // Get & Set
    public double getJari() {
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    // Abstract
    @Override
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // Interface
     @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }
 
    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }
 
    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100;
    }

    // PrintInfo
    @Override
    public void printInfo() {
    System.out.println("Warna       : " + getWarna());
    System.out.println("Border      : " + getBorder());
    System.out.println("Jari-jari   : " + jari);
    System.out.println("Luas        : " + getLuas());
    System.out.println("Keliling    : " + getKeliling());
    }
}
