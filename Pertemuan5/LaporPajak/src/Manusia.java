/* Nama File    : Manusia.java
 * Deskripsi    : berisi atribut, method, abstract dalam class Manusia.
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 22 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public abstract class Manusia {
    // Atribut
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0; // counter

    // Method
    // Konstruktor
    public Manusia() {

    }
    
    // Konstruktor dengan parameter
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama            = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat          = alamat;
        this.pendapatan      = pendapatan;
        counterMns++;
    }

    // Get & Set
    public String getNama() { 
        return nama; 
    }

    public LocalDate getTglMulaiKerja() { 
        return tgl_mulai_kerja; 
    }

    public String getAlamat() { 
        return alamat; 
    }

    public double getPendapatan() { 
        return pendapatan; 
    }

    public static int getCounterMns() { 
        return counterMns; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public void setTglMulaiKerja(LocalDate tgl) { 
        this.tgl_mulai_kerja = tgl; 
    }

    public void setAlamat(String alamat) { 
        this.alamat = alamat; 
    }

    public void setPendapatan(double pendapatan) { 
        this.pendapatan = pendapatan;
    }

    // Abstract
    public abstract int hitungMasaKerja();

    // Selisih tgl_mulai_kerja dengan hari ini
    protected int tahunKerja() {
        return Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
    }

    // cetakInfo
        public void cetakInfo() {
        System.out.println("Nama                : " + nama);
        System.out.println("Tgl Mulai Kerja     : " + tgl_mulai_kerja);
        System.out.println("Alamat              : " + alamat);
        System.out.printf("Pendapatan          : Rp %,.2f%n", pendapatan);
        System.out.printf ("Masa Kerja          : %d tahun%n", hitungMasaKerja());
        System.out.printf("Pajak               : Rp %,.2f%n", ((Pajak) this).hitungPajak());
    }
}

