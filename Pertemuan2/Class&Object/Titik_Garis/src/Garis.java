/* Nama File    : Garis.java
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Hadrian Shandhy Yudha
 * Tanggal      : 28 Februari 2026
 */

public class Garis {
    /*************** ATRIBUT *****************/
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    /*************** METHOD *****************/
    // Konstruktor untuk membuat nilai Titik awal dan Titik Akhir
    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    // Konstruktor untuk membuat Titik awal(0,0) dan Titik akhir (1,1)
    public Garis() {
        this.titikAwal = new Titik(0,0);
        this.titikAkhir = new Titik(1,1);
        counterGaris++;
    }
    
    // Selektor
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Mendapatkan panjang sebuah garis.
    public double getPanjang() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy); // akar dari  ((x2 − x1)^2 + (y2 − y1)^2)
    }

    // mendapatkan gradien dari sebuah garis.
    public double getGradient() {
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return dy / dx;
    }

    // mendapatkan titik tengah dari sebuah garis.
    public Titik getTitikTengah() {
        double midX = (titikAkhir.getAbsis() + titikAwal.getAbsis()) / 2;
        double midY = (titikAkhir.getOrdinat() + titikAwal.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }
    
    // mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya
    public boolean isSejajar(Garis g) {
        return this.getGradient() == g.getGradient();
    }
    
    // mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya
    public boolean isTegakLurus(Garis g) {
        return this.getGradient() * g.getGradient() == -1;
    }

    // menampilkan ke layar titik awal dan titik akhir garis.
    public void PrintGaris() {
        System.out.println("TItik Awal : (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
        System.out.println("TItik Awal : (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");
    }

    // menampilkan persamaan garis dalam bentuk string y = mx + c.
    public String getPersamaan() {
        double m = getGradient();
        double c = titikAwal.getOrdinat() - (m * titikAwal.getAbsis());
        return "y = " + m + "x + " + c;
    }
}