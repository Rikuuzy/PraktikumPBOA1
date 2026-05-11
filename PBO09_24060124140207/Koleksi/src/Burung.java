/* Nama File    : Burung.java
 * Deskripsi    : berisi atribut dan method dalam class Burung
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 3 Mei 2026
 */
public class Burung extends Anabul{
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Burung : " + getNama() + ", bergerak terbang");
    }

    @Override
    public void Bersuara(){
        System.out.println("Burung : " + getNama() + ", berbunyi cuit");
    }
    
}
