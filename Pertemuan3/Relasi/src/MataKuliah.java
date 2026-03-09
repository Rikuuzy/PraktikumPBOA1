/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 02 Maret 2026
 */

public class MataKuliah {
    // Atribut
    private String idMatkul;
    private String nama;
    private Integer sks;

    // Method
    // Konstruktor dengan parameter
    public MataKuliah(String idMatkul, String nama, Integer sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }
    // Konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatkul = " ";
        this.nama = " ";
        this.sks = 0; 
    }

    // Selektor
    // Mengembalikan String dari idMatkul
    public String getidMatkul() {
        return idMatkul;
    }
    
    // Mengembalikan String dari nama
    public String getnama() {
        return nama;
    }

    // Mengembalikan nilai dari sks
    public Integer getsks() {
        return sks;
    }

    // Mutator
    // Mengeset idMatkul
    public void setidMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    // Mengeset nama Matakuliah
    public void setnama(String nama) {
        this.nama = nama;
    }

    // Mengeset sks
    public void setsks(Integer sks) {
        this.sks = sks;
    }
    
    // Mencetak Matakuliah
    public void printDetailMataKuliah() {
        System.out.println("idMatkul : " + idMatkul);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("Jumlah sks : " + sks);
    }
}
