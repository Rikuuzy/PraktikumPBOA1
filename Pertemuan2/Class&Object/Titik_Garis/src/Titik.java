/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 23 Februari 2026
 */

public class Titik {

    /*************** ATRIBUT *****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*************** METHOD *****************/
    //konsturkto untuk membuat dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    // Konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
    }

    // Mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }
    
    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }
    

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
    
    // merefleksikan terhadap sumbu Y
    public void refleksiY() {
        absis = absis * -1; // x -> -x 
    }

    // merefleksikan terhadap sumbu Y
    public void refleksiX() {
        ordinat = ordinat * -1; // y -> -y
    }

    // Posisi Titik terhadap Kuadran
    public int getKuadran() {
        if (absis > 0 && ordinat < 0) { // (x, y)
            return 1;
        }
        else if (absis < 0 && ordinat > 0) { // (-x, y)
            return 2;
        }
        else if (absis < 0 && ordinat < 0) { // (-x, -y)
            return 3;
        }
        else {
            return 4; // (x, -y)
        }
    }
    // Mencari Jarak titik antar pusat
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat); // akar dari x^2 + y^2
    }

    // Mencari jarak antara 2 titik
    public double getJarak(Titik t) {
        double dx = this.absis - t.absis; 
        double dy = this.ordinat - t.ordinat;

        double kuadratX = dx * dx;
        double kuadratY = dy * dy;

        double jumlah = kuadratX + kuadratY; 
        return Math.sqrt(jumlah); // akar dari ((x1-x2)^2 + (y1-y2)^2)
    }
    // Mengembalikan Titik yang Refleksi sumbu X
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat); // (x, y) -> (x, -y)
    }
    
    // Mengembalikan TItik yang relleksi sumbu y
    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat); // (x, y) -> (-x, y)
    }
}
// end