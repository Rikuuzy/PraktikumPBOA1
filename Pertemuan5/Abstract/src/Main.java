public class Main {
    public static void main(String[] args) {
        System.out.println("Persegi");
        Persegi P = new Persegi(10, "Merah", "Hitam");
        P.printInfo();
        System.out.println("\n");
        
        System.out.println("ZoomIn");
        P.zoomIn();
        P.printInfo();
        System.out.println("\n");
        
        System.out.println("ZoomOut");
        P.zoomOut();
        P.printInfo();
        System.out.println("\n");
        
        System.out.println("Zoom");
        P.zoom(50);
        P.printInfo();
        System.out.println("\n");
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Lingkaran");
        Lingkaran L = new Lingkaran(14, "Hijau", "Hitam");
        L.printInfo();
        System.out.println("\n");
        
        System.out.println("ZoomIn");
        L.zoomIn();
        L.printInfo();
        System.out.println("\n");
        
        System.out.println("ZoomOut");
        L.zoomOut();
        L.printInfo();
        System.out.println("\n");
        
        System.out.println("Zoom");
        L.zoom(50);
        L.printInfo();
        System.out.println("\n");
    }
    
}
