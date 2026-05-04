/* Nama File    : MDatum.java
 * Deskripsi    : berisi aplikasi uji kelas generik dari Datum
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 3 Mei 2026
 */

public class MDatum {
    public static void main(String[] args) {
        // ilustrasi generik datum dari inheritance Anabul
        Datum<Anabul> datumAnabul = new Datum<>();

        Kucing kucing1 = new Kucing("Mimi", 4.0);
        datumAnabul.setIsi(kucing1);

        System.out.println("Isi datum = " + datumAnabul.getIsi().getNama());
    }
    
}
