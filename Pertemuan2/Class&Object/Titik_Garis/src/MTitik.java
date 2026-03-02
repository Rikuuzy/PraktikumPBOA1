/* Nama File    : MTitik.java
 * Deskripsi    : berisi Main Program Titik
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 23 Februari 2026
 */

public class MTitik {

    public static void main(String[] args) {

        Titik T1 = new Titik();   // Membuat objek titik T1 (0,0)
        Titik T2 = new Titik(3, 4);      // (3,4)
        Titik T3 = new Titik(-2, 5);     // (-2,5)

        // Titik T2 = new Titik(3,5); // Membuat objek titik T2 (3,5)

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        
        // System.out.println("Jumlah Object Titik" + T2.getCounterTitik());

        T1.setAbsis(3);           // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);         // Mengubah ordinat T1 dengan nilai 4
        T1.refleksiX();             //
        T1.refleksiY();
        T1.printTitik();          // Mencetak koordinat T1 ke layar

        T1.geser(3, 4);           // Menggeser T1 sejauh (3,4)

        T1.printTitik();          // Menampilkan koordinat T1 setelah digeser
        System.out.println();

        System.out.println("getRefleksi");
        T2.getRefleksiX();
        T2.getRefleksiY();
        T2.printTitik();
        System.out.println();

        System.out.println("Kuadran");
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Kuadran T2: " + T2.getKuadran());
        System.out.println("Kuadran T3: " + T3.getKuadran());
        System.out.println();

        System.out.println("JarakPusat");
        System.out.println("Jarak T2 ke pusat: " + T2.getJarakPusat());
        System.out.println();

        System.out.println("Jarak Titik");
        System.out.println("Jarak T2 ke T3: " + T2.getJarak(T3));
        System.out.println();

        System.out.println("Jumlah objek Titik: " + Titik.getCounterTitik());
    }
}
// end