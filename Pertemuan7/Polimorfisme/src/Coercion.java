/* Nama File    : Coercion.java
 * Deskripsi    : Program penggunaan Polimorfisme AD HOC Coersion.
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 26 April 2026
 */

public class Coercion {
    public static void main(String[] args) throws Exception {
        // Ilustrasi Konsep Casting
        System.out.println("Ilustrasi Konsep");
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;
        double nilaiReal = (double) nilaiInt;
        System.out.println("Integer : " + nilaiInt);
        System.out.println("Character : " + nilaiChar);
        System.out.println("Real : " + nilaiReal);
        System.out.println();

        // Mengembalikan format real ke integer
        System.out.println("Konversi real ke integer di dalam variable berbeda");
        double iniReal = 65.0;
        int kembalikan = (int) iniReal;
        System.out.println("Nilai Asli real : " + iniReal);
        System.out.println("Konversi integer : " + kembalikan);
        System.out.println();

        // Konkat dan penjumlahan
        System.out.println("Konkat & Penjumlahan parseInt");
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        System.out.println("Hasil Konkat X + Y : " + S);
        System.out.println("Penjumlahan");
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Hasil Penjumlahan : " + Z);
        System.out.println();

        System.out.println("Konkat & Penjumlahan parseDouble");
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        System.out.println("Hasil Konkat P + Q : " + R);
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Hasil Penjumlahan : " + D);
        System.out.println();

        // Mengisi Object dari hasil konversi
        System.out.println("Konversi nilai S ke object Integer A");
        Integer A = Integer.parseInt(S);
        System.out.println("Nilai Integer A : " + A);
        System.out.println();

        System.out.println("Konversi nilai A ke object Integer T");
        String T = A.toString();
        System.out.println("Nilai Integer A : " + T);
        System.out.println();

    }
}
