/* Nama File    : Tendik.java
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 14 Maret 2026
 */

import java.time.LocalDate;

public class Tendik extends Pegawai{
    // ATRIBUT
    private String bidang;
    private static int bup= 55;

    // METHOD
    // KONSTRUKTOR TANPA PARAMETER
    public Tendik() {

    }

    // KONSTRUKTOR DENGAN PARAMETER
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    // SELEKTOR
    // MENGEMBALIKAN STRING BIDANG
    public String getBidang() {
        return bidang;
    }

    // MUTATOR
    // MENGESET BIDANG
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    // METHOD UNTUK MENGHITUNG DATE TANGGAL PENSIUN
    public LocalDate getTanggalPensiun() {
    LocalDate base = getTanggalLahir().plusYears(bup);
    return base.withDayOfMonth(1).plusMonths(1);
    }

    // METHOD UNTUK MENGHITUNG NILAI TUNJANGAN
    public double getTunjangan() {
        return 0.01 * Bantuan.getMasaKerjaTahun(getTmt()) * gajiPokok;
    }

    // PRINT TENDIK
    @Override
    public void printInfo() {
    System.out.println("NIP             : " + getNip());
    System.out.println("Nama            : " + getNama());
    System.out.println("Tanggal Lahir   : " + Bantuan.formatTanggal(getTanggalLahir()));  
    System.out.println("TMT             : " + Bantuan.formatTanggal(getTmt()));            
    System.out.println("Jabatan         : Tenaga Kependidikan");
    System.out.println("Bidang          : " + bidang);
    System.out.println("Masa Kerja      : " + Bantuan.getMasaKerja(getTmt()));
    System.out.println("Tanggal Pensiun : " + Bantuan.formatTanggal(getTanggalPensiun()));
    System.out.println("Gaji Pokok      : " + Bantuan.formatRupiah(gajiPokok));
    
    int masaKerja = Bantuan.getMasaKerjaTahun(getTmt());
    String gaji = Bantuan.formatRupiah(gajiPokok);
    String tunjangan = Bantuan.formatRupiah(getTunjangan());
    System.out.println("Tunjangan       : 1% x " + masaKerja + " x " + gaji + " = " + tunjangan);
    }

}
