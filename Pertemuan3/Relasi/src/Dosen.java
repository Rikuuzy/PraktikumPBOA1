/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 02 Maret 2026
 */

public class Dosen {
    // Atribut 
    private String nip;
    private String nama;
    private String prodi;

    // Method
    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Konstruktor tanpa parameter
    public Dosen() {
        this.nip = " ";
        this.nama = " ";
        this.prodi = " ";
    }

    // Selektor 
    // Mengembalikan String dari nip
    public String getNip() {
        return nip;
    }

    // Mengembalikan String dari nama dosen
    public String getNama() {
        return nama;
    }

    // Mengembalikan String dari prodi
    public String getProdi() {
        return prodi;
    }
    
    // Mutator
    // Mengeset nip    
    public void setNip(String nip) {
        this.nip = nip;
    } 
    // Mengeset nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Mengeset prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Mencetak Dosen
    public void printDetailDosen() {
        System.out.println("Nip : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }
}
