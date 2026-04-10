import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM HITUNG NILAI AKHIR");

        System.out.print("Nama Siswa : ");
        String nama = input.nextLine();

        System.out.print("Nilai Keaktifan : ");
        double keaktifan = input.nextDouble();

        System.out.print("Nilai Tugas : ");
        double tugas = input.nextDouble();

        System.out.print("Nilai Ujian : ");
        double ujian = input.nextDouble();

        // Proses nilai murni
        double keaktifan20 = keaktifan * 0.2;
        double tugas30 = tugas * 0.3;
        double ujian50 = ujian * 0.5;

        double nilaiAkhir = keaktifan20 + tugas30 + ujian50;

        // Penentuan grade
        String grade;
        if (nilaiAkhir >= 80) {
            grade = "A";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
        } else if (nilaiAkhir >= 59) {
            grade = "C";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
        } else {
            grade = "E"; // nilaiAkhir < 50 {
        }

        // Output
        System.out.println("\nSiswa yang bernama " + nama);
        System.out.println("Dengan Nilai Persentasi Yang dihasilkan:");
        System.out.println("Nilai Keaktifan * 20% : " + keaktifan20);
        System.out.println("Nilai Tugas * 30% : " + tugas30);
        System.out.println("Nilai Ujian * 50% : " + ujian50);

        System.out.println("\nJadi Siswa yang bernama " + nama +
                " memperoleh nilai akhir sebesar " + nilaiAkhir);

        System.out.println("Grade nilai yang didapat adalah " + grade);
    }
}
