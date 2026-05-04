/* Nama File    : Datum.java
 * Deskripsi    : berisi atribut dan method dalam class Datum
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 3 Mei 2026
 */

public class Datum<T> {
    // Atribut bertipe generik
    private T isi;

    // Method
    // get
    public T getIsi() {
        return isi;
    }

    // prosedur setIsi
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}
