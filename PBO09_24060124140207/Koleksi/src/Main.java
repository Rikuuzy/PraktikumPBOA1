/* Nama File    : Main.java
 * Deskripsi    : berisi realisasi dan aplikasi
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 4 Mei 2026
 */
public class Main {
    public static void main(String[] agrs) {
        // Object Piaraan
        Piaraan Toko = new Piaraan();

        // data
        Anggora a1 = new Anggora("Kucing Anggora", 4.0);
        a1.setPanggilan("Neko");

        Anjing aj1 = new Anjing("Anjing Border Collie");
        aj1.setPanggilan("Pickles");

        Burung b1 = new Burung("Burung Lovebird");
        b1.setPanggilan("Coco");

        Kucing k1 = new Kucing("Kucing Munchkin", 2.9);
        k1.setPanggilan("Elfy");

        // enqueue
        Toko.enqueueAnabul(a1);
        Toko.enqueueAnabul(aj1);
        Toko.enqueueAnabul(b1);
        Toko.enqueueAnabul(k1);

        // Aplikasi getNbelm
        System.out.println("Jumlah pasien (nbelm): " + Toko.getNbelm());
        System.out.println();

        // Aplikasi isMember
        System.out.println("Apakah 'Neko' (a1) ada di antrean? " + Toko.isMember(a1));
        System.out.println();

        // showAnabul
        System.out.println("showAnabul");
        Toko.showAnabul();
        System.out.println();

        // countKucing
        System.out.println("countKucing");
        System.out.println("Banyaknya keluarga Kucing dalam antrean: " + Toko.countKucing());
        System.out.println();

        // bobotKucing
        System.out.println("bobotKucing");
        System.out.println("Total bobot keluarga Kucing: " + Toko.bobotKucing() + " kg");
        System.out.println();

        // showJenisAnabul
        System.out.println("showJenisAnabul");
        Toko.showJenisAnabul();
        System.out.println();

        Anabul pendatangPertama = Toko.getAnabul();
        System.out.println("Pendatang pertama: " + pendatangPertama.getPanggilan());

        Anabul pendatangBaru = Toko.dequeueAnabul();
        System.out.println("Memasukkan " + pendatangBaru.getPanggilan());
        System.out.println("Sisa antrean : " + Toko.getNbelm());
    }
}
