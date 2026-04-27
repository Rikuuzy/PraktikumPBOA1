/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 26-27 April 2026
 */
public class Mahasiswa extends Civitasakademika{
    // Atribut
    private String nim;
    private Dosen dosenwali;

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama) {
        super(nama);
        this.nim = nim;
        this.dosenwali = null;
    }

    // Overriding
    @Override
    public String getNomor() {
        return nim;
    }
    
    public String getNim() {
        return nim;
    }

    // set
    public void setWali(Dosen dosen) {
        this.dosenwali = dosen;
    }

    // Detail Mahasiswa
    public void tampilDataMahasiswa() {
        String namaWali = (dosenwali != null) ? dosenwali.getNama() : "Belum diatur";
        System.out.println("Nim : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Dosen Wali : " + namaWali);
    }
}
