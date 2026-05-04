/* Nama File    : Data.java
 * Deskripsi    : berisi class generik data dengan larik static 
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 3 Mei 2026
 */

public class Data<T> {
    // Atribut
    @SuppressWarnings("unchecked") // hiraukan IDE warning
    private T[] ruang = (T[]) new Object[100];
    private int banyak = 0;
    
    // Method
    // Procedure setIsi
    public void setIsi(int posisi, T object) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null && object != null) {
                banyak++; // posisi sebelum kosong dan akan diisi
            }
            else if (ruang[posisi - 1] != null & object == null) {
                banyak--; // posisi sebelum sudah ada dan akan dihapus
            }
            ruang[posisi - 1] = object;
        }
        else {
            System.out.println("Error posisi harus dalam range 1-100");
        }
    }

    // Fungsi getIsi
    public T getIsi(int posisi) {
        if (posisi > 1 && posisi <= 100) {
            return ruang[posisi - 1];
        }
        else {
            System.out.println("Error posisi diluar batas range");
            return null;
        }
    }

    // Fungsi getSize
    public int getSize() {
        return banyak;
    }
}
