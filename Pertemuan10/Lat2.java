 import java.util.Scanner;

class Kalkulator {
    private double nilaiSatu;
    private double nilaiDua;

    public void setNilaiSatu(double nilaiSatu) {
        this.nilaiSatu = nilaiSatu;
    }

    public void setNilaiDua(double nilaiDua) {
        this.nilaiDua = nilaiDua;
    }

    public double tambah() { return nilaiSatu + nilaiDua; }
    public double kurang() { return nilaiSatu - nilaiDua; }
    public double kali() { return nilaiSatu * nilaiDua; }
    public double bagi() { 
        if (nilaiDua == 0) {
            System.out.println("Error: Pembagian dengan nol tidak bisa dilakukan.");
            return 0;
        }
        return nilaiSatu / nilaiDua; 
    }
}

public class Lat2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();

        System.out.println("=== Kalkulator Aritmatika ===");
        System.out.print("Masukkan Nilai Satu: ");
        kal.setNilaiSatu(input.nextDouble());

        System.out.print("Masukkan Nilai Dua: ");
        kal.setNilaiDua(input.nextDouble());

        System.out.println("\n--- Hasil Operasi ---");
        System.out.println("Penjumlahan : " + kal.tambah());
        System.out.println("Pengurangan : " + kal.kurang());
        System.out.println("Perkalian   : " + kal.kali());
        System.out.println("Pembagian   : " + kal.bagi());

        input.close();
    }
}
