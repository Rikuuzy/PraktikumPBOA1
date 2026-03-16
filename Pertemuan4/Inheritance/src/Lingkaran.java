public class Lingkaran extends BangunDatar{
    public double jari;

    public Lingkaran() {
        setJmlSisi(1);
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(warna, border);
        this.jari = diameter / 2;

    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }
}
