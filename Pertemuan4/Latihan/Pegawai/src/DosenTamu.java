/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 14 Maret 2026
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    // ATRIBUT
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;

    // METHOD
    // KONSTRUKTOR TANPA PARAMETER
    public DosenTamu(){

    }

    // KONSTRUKTOR DENGAN PARAMETER
    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate tanggalBerakhirKontrak){
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    // SELEKTOR
    // MENGEMBALIKAN STRING NIDK
    public String getNidk() {
        return nidk;
    }

    // MENGEMBALIKAN DATE TANGGAL BERAKHIR KONTRAK
    public LocalDate getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    // MUTATOR
    // MENGESET NIDK
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    // MENGESET TANGGAL BERAKHIR KONTRAK
    public void setTanggalBerakhirKontrak(LocalDate tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    
    // METHOD UNTUK MENGHITUNG SISA KONTRAK BERDASARKAN HITUNGAN BULAN
    public int getSisaKontrak() {
        LocalDate SaatIni = LocalDate.now();
        int bulan = (tanggalBerakhirKontrak.getYear() - SaatIni.getYear()) * 12;
        bulan += tanggalBerakhirKontrak.getMonthValue() - SaatIni.getMonthValue();
        return bulan;
    }

    // METHOD UNTUK MENGHITUNG NILAI TUNJANGAN
    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    // PRINT DOSEN TAMU
    @Override
    public void printInfo() {
    System.out.println("NIP             : " + getNip());
    System.out.println("NIDK            : " + nidk);
    System.out.println("Nama            : " + getNama());
    System.out.println("Tanggal Lahir   : " + Bantuan.formatTanggal(getTanggalLahir()));  
    System.out.println("TMT             : " + Bantuan.formatTanggal(getTmt()));            
    System.out.println("Jabatan         : Dosen Tamu");
    System.out.println("Fakultas        : " + getFakultas());
    System.out.println("Masa Kerja      : " + Bantuan.getMasaKerja(getTmt()));
    System.out.println("Masa Berakhir   : " + Bantuan.formatTanggal(tanggalBerakhirKontrak));
    System.out.println("Sisa Kontrak    : " + getSisaKontrak() + " bulan ");
    System.out.println("Gaji Pokok      : " + Bantuan.formatRupiah(gajiPokok));
    
    String gaji = Bantuan.formatRupiah(gajiPokok);
    String tunjangan = Bantuan.formatRupiah(getTunjangan());
    System.out.println("Tunjangan       : 2,5% x " + gaji + " = " + tunjangan);
    }

}
