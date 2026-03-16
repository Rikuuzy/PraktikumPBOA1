/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 14 Maret 2026
 */

import java.time.LocalDate;

public class Dosen extends Pegawai {
    // ATRIBUT
    private String fakultas;

    // METHOD
    // KONSTRUKTOR TANPA PARAMETER
    public Dosen() {

    }

    // KONSTRUKTOR DENGAN PARAMETER
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // SELEKTOR
    // MENGEMBALIKAN STRING FAKULTAS
    public String getFakultas() {
        return fakultas;
    }

    // MUTATOR
    // MENGESET FAKULTAS
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // PRINT DOSEN
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas : " + fakultas);
    }
}
