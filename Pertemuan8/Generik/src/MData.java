/* Nama File    : MData.java
 * Deskripsi    : berisi aplikasi uji kelas generik Data untuk keluarga object Anabul
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 3 Mei 2026
 */

public class MData {
    public static void main(String[] agrs) {
        Data<Anabul> dataAnabul = new Data<>();
        Kucing kucing = new Kucing("Djaja", 1.8);
        Anjing anjing = new Anjing("Guco");
        Burung burung = new Burung("Melo");

        // Procedure setIsi
        System.out.println("setIsi");
        dataAnabul.setIsi(1, kucing);
        dataAnabul.setIsi(10, anjing);
        dataAnabul.setIsi(50, burung);
        System.out.println("Berhasil di isi");
        System.out.println();

        // Fungsi getIsi
        System.out.println("getIsi");
        Anabul elemen1 = dataAnabul.getIsi(1);
        Anabul elemen10 = dataAnabul.getIsi(10);
        Anabul elemen50 = dataAnabul.getIsi(50);

        if (elemen1 != null) {
            System.out.println("Isi posisi 1 adalah " + elemen1.getClass().getSimpleName() + " bernama: " + elemen1.getNama());
        }
        if (elemen10 != null) {
            System.out.println("Isi posisi 10 adalah " + elemen10.getClass().getSimpleName() + " bernama: " + elemen10.getNama());
        }
        if (elemen50 != null) {
            System.out.println("Isi posisi 50 adalah " + elemen50.getClass().getSimpleName() + " bernama: " + elemen50.getNama());
        }

        // Fungsi getSize
        System.out.println("getSize");
        System.out.println("Banyaknya elemen efektif yang tersimpan saat ini: " + dataAnabul.getSize());
    }
}
