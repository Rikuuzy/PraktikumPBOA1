/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 02 Maret 2026
 */

public class Mahasiswa {
    // Atribut 
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMataKuliah;
    private int jumlahMataKuliah;
    private Dosen dosenWali;
    private Kendaraan kendaraan;


    // Method
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.listMataKuliah = new MataKuliah[50];
        this.jumlahMataKuliah = 0;
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMataKuliah = new MataKuliah[50];
        this.jumlahMataKuliah = 0;
    }
    // Selektor
    // Mengembalikan string Nim;
    public String getNim() {
        return nim;
    }
    
    // Mengembalikan string nama;
    public String getNama() {
        return nama;
    }

    // Mengembalikan string prodi
    public String getProdi(){
        return prodi;
    }

    // Mengembalikan list Matakuliah
    public MataKuliah[] getListMataKuliah() {
        return listMataKuliah;
    }

    // Mengembalikan Dosen Wali
    public Dosen getDosenWali() {
        return dosenWali;
    }

    // Mengembalikan Kendaraan
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    // Mutator
    // Mengeset Nim
    public void setNim(String nim){
        this.nim = nim;
    }

    // Mengeset nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengeset prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Mengeset dosen wali
    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // Mengeset kendaraan
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Method menambahkan mata kuliah ke dalam listMataKuliah
    public void addMataKuliah(MataKuliah newMataKuliah) {
        listMataKuliah[jumlahMataKuliah] = newMataKuliah;
        jumlahMataKuliah++;
    }

    // Method mendapatkan jumlah sks yang diambil
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalSKS += listMataKuliah[i].getsks();
        }
        return totalSKS;
    }

    // Method mendapatkan jumlah mata kuliah yang diambil
    public int getJumlahMataKuliah() {
        return jumlahMataKuliah;
    }

    // Print mahasiswa
    public void printMhs() {
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    // Print detail mahasiswa
    public void printDetailMhs() {
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);

        System.out.println("Daftar Mata Kuliah : ");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            listMataKuliah[i].printDetailMataKuliah();
        }
        System.out.println("Dosen Wali : ") ;
        dosenWali.printDetailDosen();

        System.out.println("Kendaraan : ");
        kendaraan.printDetailKendaraan();
    }
}