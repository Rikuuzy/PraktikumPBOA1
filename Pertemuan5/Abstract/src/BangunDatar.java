/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 09 Maret 2026
 */

public abstract class BangunDatar {
    // Atribut
    private int jmlSisi;
    private String warna;
    private String border;

    // Method 
    // Abstract
    public abstract double getLuas();
    public abstract double getKeliling();

    // Konstruktor tanpa parameter
    public BangunDatar() {

    }

    // Konstruktor dengan parameter
    public BangunDatar(String warna, String border) {
    this.warna = warna;
    this.border = border;
    }

    // Get & Set
    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public boolean isEqualLuas(BangunDatar x) {
        return this.getLuas() == x.getLuas();
    }

    public boolean isEqualKeliling(BangunDatar x) {
        return this.getKeliling() == getKeliling();
    }

    // PrintInfo
    public void printInfo() {
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }
}
    