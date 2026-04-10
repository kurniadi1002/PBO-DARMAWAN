import java.util.Scanner;

public class HitungNilaiRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.println("PROGRAM HITUNG NILAI RATA-RATA\n");

        System.out.print("Nama Siswa : ");
        String nama = input.nextLine();

        System.out.print("Nilai Pertandingan I : ");
        double n1 = input.nextDouble();

        System.out.print("Nilai Pertandingan II : ");
        double n2 = input.nextDouble();

        System.out.print("Nilai Pertandingan III : ");
        double n3 = input.nextDouble();

        // Proses
        double rata = (n1 + n2 + n3) / 3;
        String hadiah;

        // Seleksi hadiah
        if (rata >= 85) {
            hadiah = "Seperangkat Komputer P4";
        } else if (rata >= 70) {
            hadiah = "Uang sebesar Rp. 500.000";
        } else {
            hadiah = "Hadiah Hiburan";
        }

        // Output
        System.out.println("\nSiswa yang bernama " + nama);
        System.out.println("Memperoleh nilai rata-rata " + rata +
                " dan berhak mendapatkan hadiah " + hadiah);
    }
}
