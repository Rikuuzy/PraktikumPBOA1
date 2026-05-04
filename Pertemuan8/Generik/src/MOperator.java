/* Nama File    : MOperator.java
 * Deskripsi    : berisi aplikasi uji method pada OperatorGenerik
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 3 Mei 2026
 */

public class MOperator{
    public static void main(String[] agrs) {
        OperatorGenerik op = new OperatorGenerik();

        // Procedure tukar sesama integer
        System.out.println("Tukar Sesama Integer");
        op.Tukar(1,4);
        System.out.println();

        // Procedure tukar sesama string
        System.out.println("Tukar Sesama String");
        op.Tukar("Anjing", "Kucing");
        System.out.println();

        // Procedure Tukar sesama keluarga anabul
        System.out.println("Tukar Sesama Keluarga Anabul");
        Kucing kucing1 = new Kucing("Toya", 2.5);
        Anjing anjing1 = new Anjing("Dogi");
        op.Tukar(kucing1.getNama(), anjing1.getNama());
        System.out.println();
        // Fungsi Bobot2
        System.out.println("Hitung Jumlah Bobot dari 2 Anabul");
        Anggora KucingAnggora = new Anggora("Talia", 6.0);
        Kembangtelon Kucingkembangtelon = new Kembangtelon("leny", 4.0);
        double sumBobot = op.Bobot2(KucingAnggora, Kucingkembangtelon);
        System.out.println("SumBobot = " + sumBobot + "kg");
    }
}
