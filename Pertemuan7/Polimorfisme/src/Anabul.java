public class Anabul {
    // Atribut
    private String nama;

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

    // Method
    public void Gerak() {
        System.out.println("bergerak dengan cara");
    }

    public void Bersuara() {
        System.out.println("berbunyi");
    }
}
