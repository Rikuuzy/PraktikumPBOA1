/* Nama File    : Main.java
 * Deskripsi    : berisi Aplikasi/Main Program
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 26-27 April 2026
 */

public class Main {
    public static void main(String[] args) {
        // Instance Seminar
        Seminar seminarCivita = new Seminar();
        System.out.println();

        // 2 Object dosen dan 5 mahasiswa
        Dosen d1 = new Dosen("101", "Dr. Tri Saputra");
        Dosen d2 = new Dosen("102", "Dr. Budi Raharja");
        
        Mahasiswa m1 = new Mahasiswa("A11", "Reza");
        Mahasiswa m2 = new Mahasiswa("A12", "Ciko");
        Mahasiswa m3 = new Mahasiswa("A13", "Yono");
        Mahasiswa m4 = new Mahasiswa("A14", "Faras");
        Mahasiswa m5 = new Mahasiswa("A15", "Nino");

        System.out.println("Registrasi");
        seminarCivita.registrasi(d1);
        seminarCivita.registrasi(d2);
        seminarCivita.registrasi(m1);
        seminarCivita.registrasi(m2);
        seminarCivita.registrasi(m3);
        seminarCivita.registrasi(m4);
        seminarCivita.registrasi(m5);
        System.out.println();

        System.out.println("Total Peserta Saat Ini: " + seminarCivita.countPeserta() + " orang");
        System.out.println();

        System.out.println("Jumlah Mahasiswa : " + seminarCivita.countMahasiswa() + " orang");
        System.out.println("Jumlah Dosen : " + (seminarCivita.countPeserta() - seminarCivita.countMahasiswa()) + " orang");
        System.out.println();

        seminarCivita.tampilPeserta();
        System.out.println();

        System.out.println("Data Mahasiswa");
        m1.setWali(d1);
        m2.setWali(d2);
        m3.setWali(d2);
        m4.setWali(d1);

        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}
