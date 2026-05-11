/* Nama File    : Anabul.java
 * Deskripsi    : berisi atribut dan method dalam class Anabul
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 3 Mei 2026
 */
public class Anabul {
    // Atribut
    private String nama;
    private String panggilan;

    // Konstruktor tanpa parameter
    public Anabul() {

    }

    // Konstruktor dengan Parameter
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Get
    public String getNama() {
        return nama;
    }

    public String getPanggilan() {
        return panggilan;
    }
    
    // set
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    // Method
    public void Gerak() {
        System.out.println("bergerak dengan cara");
    }

    public void Bersuara() {
        System.out.println("berbunyi");
    }
    
}
