import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // TESTING PRINT DOSEN TETAP
        System.out.println("DOSEN TETAP");
        DosenTetap dt = new DosenTetap("9545647548", "78647324", "Andi", 
            LocalDate.of(1990, 5, 5), 
            LocalDate.of(2015, 1, 1), 
            5000000, "Fakultas Sains dan Matematika" );

        dt.printInfo();

        System.out.println("\n");
        
        // TESTING PRINT DOSEN TAMU
        System.out.println("DOSEN TAMU");
        DosenTamu dtu = new DosenTamu("9545647548", "78647321", "Aga", 
            LocalDate.of(1998, 4, 21), 
            LocalDate.of(2018, 8, 5), 
            3000000, "Fakultas Hukum",
            LocalDate.of(2020, 10, 15) );
        
        dtu.printInfo();

        System.out.println("\n");

        // TESTING PRINT TENDIK
        System.out.println("TENAGA KEPENDIDIKAN");
        Tendik tk = new Tendik("1234545","Amirudin", 
            LocalDate.of(1997, 2, 11), 
            LocalDate.of(2015, 1, 15), 
            4000000, "Tata Usaha");
        
        tk.printInfo();
    }
}
