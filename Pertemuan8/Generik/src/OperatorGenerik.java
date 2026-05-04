
/* Nama File    : OperatorGenerik.java
 * Deskripsi    : berisi kelas implementasi operator generik
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 3 Mei 2026
 */

public class OperatorGenerik {
    // Method
    // procedur Tukar
    public <T> void Tukar(T a, T b) {
        System.out.println("Sebelum a ="  + a + ", b = " + b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("Sesudah a ="  + a + ", b = " + b);
    }
    
    // Fungsi Bobot2
    public <T1 extends Kucing, T2 extends Kucing> double Bobot2(T1 k1, T2 k2) {
        return k1.getBobot() + k2.getBobot();
    }
}
