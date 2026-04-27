/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 26 April 2026
 */

public class Mahasiswa {
    // Atribut
    private String nim;
    private String nama;
    private String programStudi;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "-990";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }
    
    // Konstruktor dengan parameter
    public Mahasiswa (String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // Konstruktor dengan object lain
    public Mahasiswa(Mahasiswa mhsLain) {
        this.nim = mhsLain.nim;
        this.nama = mhsLain.nama;
        this.programStudi = mhsLain.programStudi;
    }

    // setProgramStudi Varian tanpa parameter
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    // setProgramStudi Varian satu parameter string
    public void setProgramStudi(String prodiBaru) {
        this.programStudi = prodiBaru;
    }

    // setProgramStudi Varian satu parameter object lain
    public void setProgramStudi(Mahasiswa mhsLain) {
        this.programStudi = mhsLain.programStudi;
    }

    // Detail Mahasiswa
    public void printInfo(String namaObject) {
        System.out.println("Data : " + namaObject);
        System.out.println("Nim : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Prodi : " + this.programStudi);
    }
}
