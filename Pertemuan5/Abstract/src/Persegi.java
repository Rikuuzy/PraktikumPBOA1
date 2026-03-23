/* Nama File    : Persegi.java
 * Deskripsi    : berisi atribut dan method dalam class Persegi, implementasi abstract class.
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 22 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize{
    // Atribut
    private double sisi;

    // Method
    // Konstruktor
    public Persegi() {
        setJmlSisi(4);
    }
    // Konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(warna, border);
        this.sisi = sisi;
        setJmlSisi(4);
    }

    // Get & Set
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Abstract
    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return sisi * 4;
    }

    // Diagonal
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
    

    // Interface
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }
 
    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }
 
    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100;
    }
    @Override
    public void printInfo(){
        System.out.println("Jumlah Sisi : " + getJmlSisi());
        System.out.println("Warna       : " + getWarna());
        System.out.println("Border      : " + getBorder());
        System.out.println("Sisi        : " + getSisi());
        System.out.println("Luas        : " + getLuas());
        System.out.println("Keliling    : " + getKeliling());
        System.out.println("Diagonal    : " + getDiagonal());
    }
}
