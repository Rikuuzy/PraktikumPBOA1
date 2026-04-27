/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 26-27 April 2026
 */

public class Dosen extends Civitasakademika {
    // Atribut
    private String nip;

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }

    // Overriding
    @Override
    public String getNomor() {
        return nip;
    }

    public String getNip() {
        return nip;
    }
}
