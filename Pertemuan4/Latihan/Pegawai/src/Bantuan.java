/* Nama File    : Bantuan.java
 * Deskripsi    : berisi method formating dalam class BangunDatar
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 14 Maret 2026
 */

// Testing pendekatan melalui Localisasi dan SYSDATE
import java.text.NumberFormat; // formating angka
import java.time.LocalDate; // representasi tanggal
import java.time.Period; // menghitung selisih 2 tanggal
import java.time.format.DateTimeFormatter; // format LocalDate ke String
import java.util.Locale; // Mengatur lokaliasai bahasa dan negara

public class Bantuan {
    // Formating tanggal standar Indonesia 
     public static String formatTanggal(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return date.format(formatter);
     }

     // Formating Currency (Mata uang) Indonesia
     public static String formatRupiah(double amount) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return nf.format(amount);
     }

     // Period.between(awal, akhir)
     public static String getMasaKerja(LocalDate tmt) {
        Period period = Period.between(tmt, LocalDate.now());
        return period.getYears() + " tahun " + period.getMonths() + " bulan ";
     }

     // Mengambil komponen tahun dari Period untuk penerapan rumus 2% x masaKerjaTahun x gajiPokok
     public static int getMasaKerjaTahun(LocalDate tmt) {
        return Period.between(tmt, LocalDate.now()).getYears();
     }

}
