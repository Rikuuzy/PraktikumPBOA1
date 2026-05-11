/* Nama File    : MTeman.java
 * Deskripsi    : berisi aplikasi uji coba dari class Teman
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 4 Mei 2026
 */

public class MTeman {
    public static void main(String[] args) {
        Teman T = new Teman();
        T.addNama("Budi");
        T.addNama("Siti");
        T.addNama("Andi");
        T.addNama("Andi");

        System.out.println("Jumlah teman : " + T.getNbelm());
        System.out.println();
        System.out.println("Nama pertama " + T.getNama(0));
        T.setNama(1, "Pandu");
        System.out.println("Koleksi terbaru : ");
        T.showTeman();

        System.out.println("Hapus Pandu");
        T.delNama("Pandu");
        System.out.println("Koleksi terbaru : ");
        T.showTeman();
        System.out.println();

        System.out.println("isMember");
        System.out.println("Adakah Andi : " + T.isMember("Andi"));
        System.out.println();
        
        T.gantiNama("Budi", "Roni" );
        T.showTeman();
        System.out.println();

        System.out.println("countNama");
        System.out.println("Jumlah Andi : " + T.countNama("Andi"));
    }
}
