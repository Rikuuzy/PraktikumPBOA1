/* Nama File    : MGaris.java
 * Deskripsi    : berisi Main Program Garis
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 23 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {
        System.out.println("=== TESTING CLASS GARIS ===\n");

        // Test Constructor with parameters
        System.out.println("Constructor :");
        Titik A = new Titik(0, 0);
        Titik B = new Titik(3, 4);
        Garis G1 = new Garis(A, B);
        G1.PrintGaris();
        System.out.println();

        // Test Default Constructor
        System.out.println("Constructor default:");
        Garis G2 = new Garis();
        G2.PrintGaris();
        System.out.println();

        // Test getPanjang() - Length
        System.out.println("Panjang Garis :");
        System.out.println("Panjang : " + G1.getPanjang());
        System.out.println();

        // Test getGradient() - Slope
        System.out.println("Gradien Garis :");
        System.out.println("Gradien: " + G1.getGradient());
        System.out.println();

        // Test getTitikTengah()
        System.out.println("Titik Tengah Garis :");
        Titik tengah = G1.getTitikTengah();
        System.out.println("TitikTengah: (" + tengah.getAbsis() + ", " + tengah.getOrdinat() + ")");
        System.out.println();

        // Test isSejajar()
        System.out.println("Cek Garis Sejajar:");
        Garis G3 = new Garis(new Titik(1, 1), new Titik(4, 5)); 
        Garis G4 = new Garis(new Titik(0, 2), new Titik(3, 6)); 
        System.out.println("G3 isSejajar G4 :" + G3.isSejajar(G4));
        System.out.println();

        // Test isTegakLurus()
        System.out.println("Cek Garis Tegak Lurus:");
        Garis G5 = new Garis(new Titik(0, 0), new Titik(1, 1)); 
        Garis G6 = new Garis(new Titik(0, 0), new Titik(1, -1));
        System.out.println("G5 isTegakLurus G6 : " + G5.isTegakLurus(G6));
        System.out.println();

        // Test getPersamaan()
        System.out.println("Persamaan Garis G1:");
        System.out.println(G1.getPersamaan());
        System.out.println();
    }
}