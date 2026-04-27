/* Nama File    : Seminar.java
 * Deskripsi    : berisi atribut dan method dalam class Seminar
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 26-27 April 2026
 */

public class Seminar {
    // Atribut
    private Civitasakademika[] pesertas;
    private int banyakPeserta;

    // Konstruktor tanpa parameter
    public Seminar() {
        pesertas = new Civitasakademika[100]; // Array max 100
        banyakPeserta = 0;
    }

    // Method
    public int countPeserta() {
        return banyakPeserta;
    }

    // Procedure Registrasi
    public void registrasi(Civitasakademika pesertaBaru) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = pesertaBaru;
            banyakPeserta++;
            System.out.println("Berhasil Mendaftar: " + pesertaBaru.getNama());
        }
        else {
            System.out.println("Kapasitar seminar penuh");
        }
    }

    // Procedure tampilPeserta
    public void tampilPeserta() {
        System.out.println("Daftar Peserta");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println((i + 1) + ". [" + pesertas[i].getNomor() + "] " + pesertas[i].getNama());
        }
    }

    // Fungsi countMahasiswa
    public int countMahasiswa() {
        int jmlMhs = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                jmlMhs++;
            }
        }
        return jmlMhs;
    }
}
