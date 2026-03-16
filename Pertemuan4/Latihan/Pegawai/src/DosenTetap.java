/* Nama File    : DosenTetap.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 14 Maret 2026
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen{
    // ATRIBUT
    private String nidn;
    private static int bup = 65;

    // METHOD
    // KONSTRUKTOR TANPA PARAMETER
    public DosenTetap() {

    }

    // KONSTRUKTOR DENGAN PARAMETER
    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
 
    }

    // SELEKTOR
    // MENGEMBALIKAN STRING NIDN
    public String getNidn() {
        return nidn;
    }

    // MUTATOR
    // MENGESET NIDN
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }
    
    // METHOD UNTUK MENGHITUNG DATE TANGGAL PENSIUN 
    public LocalDate getTanggalPensiun() {
        LocalDate base = getTanggalLahir().plusYears(bup);
        return base.withDayOfMonth(1).plusMonths(1);
    }

    // METHOD UNTUK MENGHITUNG NILAI TUNJANGAN
    public double getTunjangan() {
        return 0.02 * Bantuan.getMasaKerjaTahun(getTmt()) * gajiPokok;
    }

    // PRINT DOSEN TETAP
    @Override
    public void printInfo() {
    System.out.println("NIP             : " + getNip());
    System.out.println("NIDN            : " + nidn);
    System.out.println("Nama            : " + getNama());
    System.out.println("Tanggal Lahir   : " + Bantuan.formatTanggal(getTanggalLahir()));  
    System.out.println("TMT             : " + Bantuan.formatTanggal(getTmt()));            
    System.out.println("Jabatan         : Dosen Tetap");
    System.out.println("Fakultas        : " + getFakultas());
    System.out.println("Masa Kerja      : " + Bantuan.getMasaKerja(getTmt()));             
    System.out.println("Tanggal Pensiun : " + Bantuan.formatTanggal(getTanggalPensiun())); 
    System.out.println("Gaji Pokok      : " + Bantuan.formatRupiah(gajiPokok));
    
    int masaKerja = Bantuan.getMasaKerjaTahun(getTmt());
    String gaji = Bantuan.formatRupiah(gajiPokok);
    String tunjangan = Bantuan.formatRupiah(getTunjangan());
    System.out.println("Tunjangan       : 2% x " + masaKerja + " x " + gaji + " = " + tunjangan);
    }
}
