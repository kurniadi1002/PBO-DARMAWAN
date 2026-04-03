import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        double luas = Math.PI * r * r;
        double keliling = 2 * Math.PI * r;

        System.out.println("Luas Lingkaran = " + luas);
        System.out.println("Keliling Lingkaran = " + keliling);
    }
}