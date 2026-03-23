/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 09 Maret 2026
 */
public class Lingkaran extends BangunDatar{
    public double jari;

    public Lingkaran() {
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(warna, border);
        this.jari = diameter / 2;

    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
    System.out.println("Warna   : " + getWarna());
    System.out.println("Border  : " + getBorder());
    System.out.println("Jari-jari: " + jari);
    System.out.println("Luas    : " + getLuas());
    System.out.println("Keliling: " + getKeliling());
}
}
