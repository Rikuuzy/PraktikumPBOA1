/* Nama File    : LambdaMahasiswa.java
 * Deskripsi    : Implementasi lambda pada map mahasiswa
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 25 Mei 2026
 */
import java.util.HashMap;
import java.util.Map;


public class LambdaMahasiswa {
    public static void main(String[] args) {
        // Membuat Map dengan key NIM (String) dan value nama mahasiswa (String)
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124140101", "Hadrian");
        mahasiswaMap.put("24060124140102", "Shandhy");
        mahasiswaMap.put("24060124140103", "Yudha");
        mahasiswaMap.put("24060124140104", "Rikuu");

        // lambda digunakan untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
