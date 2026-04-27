/* Nama File    : Coercion.java
 * Deskripsi    : Program penggunaan Polimorfisme AD HOC Coersion pada Class Anabul.
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 26 April 2026
 */

public class Inclusion {
    public static void main(String[] args) {
        System.out.println("Aplikasi Inclusion");

        Anabul[] Peliharaan = new Anabul[3];
        Peliharaan[0] = new Kucing("Neko");
        Peliharaan[1] = new Anjing("Inu");
        Peliharaan[2] = new Burung("Tori");

        for(int i = 0; i < Peliharaan.length; i++) {
            Peliharaan[i].Gerak();
            Peliharaan[i].Bersuara();
            System.out.println();
        }
    }
}
