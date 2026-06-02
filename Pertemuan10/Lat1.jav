import java.util.Scanner;

class Silinder {
    private double radius;
    private double tinggi;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * radius * radius * tinggi;
    }
}

public class Lat1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Silinder silinder = new Silinder();

        System.out.println("=== Hitung Volume Silinder ===");
        System.out.print("Masukkan nilai Radius: ");
        double r = input.nextDouble();
        silinder.setRadius(r); 

        System.out.print("Masukkan nilai Tinggi: ");
        double t = input.nextDouble();
        silinder.setTinggi(t);
        System.out.printf("Volume Silinder: %.2f\n", silinder.hitungVolume());
        
        input.close();
    }
}
