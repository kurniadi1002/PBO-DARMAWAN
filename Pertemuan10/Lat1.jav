import java.util.Scanner;

// Kelas Enkapsulasi untuk Silinder
class Silinder {
    private double radius;
    private double tinggi;

    // Setter untuk Radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Setter untuk Tinggi
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Metode untuk menghitung volume
    public double hitungVolume() {
        return Math.PI * radius * radius * tinggi;
    }
}

// Main Class
public class Lat1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Silinder silinder = new Silinder();

        System.out.println("=== Hitung Volume Silinder ===");
        System.out.print("Masukkan nilai Radius: ");
        double r = input.nextDouble();
        silinder.setRadius(r); // Input dimasukkan lewat setter

        System.out.print("Masukkan nilai Tinggi: ");
        double t = input.nextDouble();
        silinder.setTinggi(t); // Input dimasukkan lewat setter

        System.out.printf("Volume Silinder: %.2f\n", silinder.hitungVolume());
        
        input.close();
    }
}
