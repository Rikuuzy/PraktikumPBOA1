/* Nama File    : pns.java
 * Deskripsi    : berisi atribut dan method dalam class Pns.
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 22 Maret 2026
 */

import java.time.LocalDate;

public class PNS extends Manusia implements Pajak{
    // Atribut
    private String nip;
    private static int counterPNS = 0; // counter

    // Method
    // Konstruktor tanpa parameter
    public PNS() {

    }
    
    // Konstruktor dengan parameter
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Konstruktor tanpa alamat
    public PNS(String nama, LocalDate tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, null, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Get & Set
    public String getNip() { 
        return nip; 
    }
    public void setNip(String nip) { 
        this.nip = nip; 
    }

    public static int getCounterPNS() { 
        return counterPNS; 
    }
    
    // Abstract
    @Override
    public int hitungMasaKerja() {
        return tahunKerja() + 7;
    }
 
    // interface
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    // cetakInfo
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP                 : " + nip);
    }
}
