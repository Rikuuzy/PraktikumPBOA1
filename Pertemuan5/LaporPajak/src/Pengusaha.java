import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    // Atribut
    private String npwp;
    private static int counterPengusaha = 0; // counter

    // Method
    // Konstruktor tanpa parameter
    public Pengusaha() {

    }
    
    // Konstruktor dengan parameter
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    // Get & Set
    public String getNpwp() { 
        return npwp; 
    }

    public void setNpwp(String npwp) { 
        this.npwp = npwp; 
    }

    public static int getCounterPengusaha() { 
        return counterPengusaha; 
    }
    
    // Abstract
    @Override
    public int hitungMasaKerja() {
        return tahunKerja() + 0;
    }

    // interface
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    // cetakInfo
    @Override
    public void cetakInfo() {;
        super.cetakInfo();
        System.out.println("NPWP                : " + npwp);
    }

}
