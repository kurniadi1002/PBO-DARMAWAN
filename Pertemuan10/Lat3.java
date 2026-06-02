import java.util.Scanner;

// Superclass (Kelas Induk) yang menerapkan Enkapsulasi
class HitungNilai {
    private double nilaiUts;
    private double nilaiUas;

    // Setter
    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    // Getter (diperlukan agar subclass bisa mengakses nilainya)
    public double getNilaiUts() { return nilaiUts; }
    public double getNilaiUas() { return nilaiUas; }

    // Metode menghitung Nilai Akhir sesuai ketentuan
    public double hitungNilaiAkhir() {
        double murniUTS = getNilaiUts() * 0.40;
        double murniUAS = getNilaiUas() * 0.60;
        return murniUTS + murniUAS;
    }
}

// Subclass (Kelas Anak) menerapkan Pewarisan
class HitungGrade extends HitungNilai {
    
    // Metode untuk mencari Grade berdasarkan Nilai Akhir
    public char tentukanGrade() {
        double nilaiAkhir = hitungNilaiAkhir(); // Memanggil fungsi dari kelas induk
        
        if (nilaiAkhir >= 85) {
            return 'A';
        } else if (nilaiAkhir >= 70) {
            return 'B';
        } else if (nilaiAkhir >= 55) {
            return 'C';
        } else if (nilaiAkhir >= 40) {
            return 'D';
        } else {
            return 'E';
        }
    }
}

// Main Class
public class Lat3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Membuat objek dari subclass
        HitungGrade mhs = new HitungGrade();

        System.out.println("=== Input Nilai Mahasiswa ===");
        System.out.print("Masukkan Nilai UTS: ");
        mhs.setNilaiUts(input.nextDouble());

        System.out.print("Masukkan Nilai UAS: ");
        mhs.setNilaiUas(input.nextDouble());

        // Output hasil pencatatan
        System.out.println("\n--- Hasil Kelulusan ---");
        System.out.printf("Nilai Akhir : %.2f\n", mhs.hitungNilaiAkhir());
        System.out.println("Grade       : " + mhs.tentukanGrade());

        input.close();
    }
}
