/* Nama File    : Civitasakademika.java
 * Deskripsi    : berisi atribut dan method dalam class Civitasakademika
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 26-27 April 2026
 */

public class Civitasakademika {
    // Atribut
    protected String nama;
    
    // Konstruktor tanpa parameter
    public Civitasakademika() {

    }

    // Konstruktor dengan parameter
    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    // get 
    public String getNama() {
        return nama;
    }

    // get untuk ovveride
    public String getNomor() {
        return "-";
    }
}
