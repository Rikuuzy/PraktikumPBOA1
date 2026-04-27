/* Nama File    : Kucing.java
 * Deskripsi    : berisi atribut dan method dalam class Kucing
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 26 April 2026
 */
public class Kucing extends Anabul{
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Kucing : " + getNama() + ", bergerak melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Kucing : " + getNama() + ", berbunyi meong");
    }

}
