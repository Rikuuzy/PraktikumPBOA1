/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi interface.
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 22 Maret 2026
 */

public interface IResize {
 
    // Menambah ukuran menjadi 10% lebih besar
    public void zoomIn();
 
    // Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();
 
    // Menskalakan ukuran sesuai input percent yang diberikan
    public void zoom(int percent);
}
