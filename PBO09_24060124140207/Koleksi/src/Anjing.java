/* Nama File    : Anjing.java
 * Deskripsi    : berisi atribut dan method dalam class Anjing
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 3 Mei 2026
 */
public class Anjing extends Anabul{
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Anjing : " + getNama() + ", bergerak melata");
    }

    @Override
    public void Bersuara(){
        System.out.println("Anjing : " + getNama() + ", berbunyi guk-guk");
    }
    
}
