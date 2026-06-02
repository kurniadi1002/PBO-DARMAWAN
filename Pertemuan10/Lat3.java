import java.util.Scanner;

class HitungNilai {
    private double nilaiUts;
    private double nilaiUas;

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public double getNilaiUts() { return nilaiUts; }
    public double getNilaiUas() { return nilaiUas; }

    public double hitungNilaiAkhir() {
        double murniUTS = getNilaiUts() * 0.40;
        double murniUAS = getNilaiUas() * 0.60;
        return murniUTS + murniUAS;
    }
}

class HitungGrade extends HitungNilai {
    
    public char tentukanGrade() {
        double nilaiAkhir = hitungNilaiAkhir(); 
        
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

public class Lat3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        HitungGrade mhs = new HitungGrade();

        System.out.println("=== Input Nilai Mahasiswa ===");
        System.out.print("Masukkan Nilai UTS: ");
        mhs.setNilaiUts(input.nextDouble());

        System.out.print("Masukkan Nilai UAS: ");
        mhs.setNilaiUas(input.nextDouble());

        System.out.println("\n--- Hasil Kelulusan ---");
        System.out.printf("Nilai Akhir : %.2f\n", mhs.hitungNilaiAkhir());
        System.out.println("Grade       : " + mhs.tentukanGrade());

        input.close();
    }
}
