/* Nama File    : Coercion.java
 * Deskripsi    : Program penggunaan Polimorfisme AD HOC Overloading Pada Class Mahasiswa.
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 26 April 2026
 */

public class Overloading {
    public static void main(String[] args) {
        System.out.println("Realisasi dan Aplikasi Konstruktor Mahasiswa");
        
        System.out.println("Tanpa parameter");
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.printInfo("Mahasiswa 1");
        System.out.println();
        
        System.out.println("3 Parameter");
        Mahasiswa mhs2 = new Mahasiswa("123", "Renaldi Putra", "Informatika");
        mhs2.printInfo("Mahasiswa 2");
        System.out.println();

        System.out.println("1 parameter object mahasiswa lain (kloning)");
        Mahasiswa mhs3 = new Mahasiswa(mhs2);
        mhs3.printInfo("Mahasiswa 3 Hasil Kloning");
        System.out.println();

        System.out.println("Aplikasi Overloading setProgramStudi");
        mhs1.setProgramStudi();
        System.out.println("Varian 1");
        mhs1.printInfo("Mahasiswa 1");
        System.out.println();

        mhs2.setProgramStudi("Teknik Elektro");
        System.out.println("Varian 2");
        mhs2.printInfo("Mahasiswa 2");
        System.out.println();

        mhs3.setProgramStudi(mhs1);
        System.out.println("Varian 3");
        mhs3.printInfo("Mahasiswa 3");
        System.out.println();
    }
}
