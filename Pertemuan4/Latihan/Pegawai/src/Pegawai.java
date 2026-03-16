/* Nama File    : BangunDatar.java
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 14 Maret 2026
 */

import java.time.LocalDate;

public class Pegawai {
    // ATRIBUT
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    protected double gajiPokok;
    
    // METHOD
    // KONSTRUKTOR TANPA PARAMETER
    public Pegawai() {

    }

    // KONSTRUKTOR DENGAN PARAMETER
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // SELEKTOR
    // MENGEMBALIKAN STRING NIP
    public String getNip() {
        return nip;
    }

    // MENGEMBALIKAN STRING NAMA
    public String getNama() {
        return nama;
    }
    
    // MENGEMBALIKAN DATE TANGGAL LAHIR
    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    // MENGEMBALIKAN DATE TMT
    public LocalDate getTmt() {
        return tmt;
    }

    // MENGEMBALIKAN NILAI GAJIPOKOK
    public double getGajiPokok() {
        return gajiPokok;
    }

    // MUTATOR
    // MENGESET NIP
    public void setNip(String nip) {
        this.nip = nip;
    }

    // MENGESET NAMA
    public void setNama(String nama) {
        this.nama = nama;
    }

    // MENGESET TANGGAL LAHIR
    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    // MENGESET TMT
    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    // MENGESET GAJI POKOK
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // PRINT PEGAWAI
    public void printInfo() {
        System.out.println(("NIP            : " + nip));
        System.out.println(("Nama           : " + nip));
        System.out.println(("Tanggal Lahir  : " + Bantuan.formatTanggal(tanggalLahir)));
        System.out.println(("TMT            : " + Bantuan.formatTanggal(tmt)));
        System.out.println(("Gaji Pokok     : " + Bantuan.formatRupiah(gajiPokok)));
    }
}


