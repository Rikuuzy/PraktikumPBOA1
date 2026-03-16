/* Nama File    : Inheritance.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 09 Maret 2026
 */

public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;

    public BangunDatar() {

    }

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

    public void printInfo() {
        System.out.println("Jumlah Sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }
}
    