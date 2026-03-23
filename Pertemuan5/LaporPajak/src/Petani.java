import java.time.LocalDate;

public class Petani extends Manusia implements Pajak{
    // Atribut
    private String asal_kota;
    private static int counterPetani = 0; // counter

    // Method
    // Konstruktor tanpa parameter
    public Petani() {

    }

    // Konstruktor dengan parameter
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Get & Set
    public String getAsalKota() { 
        return asal_kota; 
    }
    
    public void setAsalKota(String kota) { 
        this.asal_kota = kota; 
    }

    public static int getCounterPetani() { 
        return counterPetani; 
    }

    // Abstract 
    @Override
    public int hitungMasaKerja() {
        return tahunKerja() + 2;
    }

    // interface\
    @Override
    public double hitungPajak() {
        return 0;
    }

    // cetakInfo
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota           : " + asal_kota);
    }
}
