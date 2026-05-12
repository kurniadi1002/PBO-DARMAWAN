import java.util.Scanner;

public class Nilaimahasiswa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i;

        String nama;
        double tugas, uts, uas;
        double nilaiAkhir;

        double nilaiTugas;
        double nilaiUTS;
        double nilaiUAS;

        char grade;
        char ulang = 'Y';

        do {

            // Jumlah mahasiswa dibuat tetap 3
            int jumlahMahasiswa = 3;

            String[] namamahasiswa = new String[jumlahMahasiswa];
            double[] nilaiAkhirmahasiswa = new double[jumlahMahasiswa];
            char[] grademahasiswa = new char[jumlahMahasiswa];

            System.out.println("PROGRAM HITUNG NILAI AKHIR MAHASISWA");

            for (i = 0; i < jumlahMahasiswa; i++) {

                input.nextLine();

                System.out.println("\nMahasiswa ke-" + (i + 1));

                System.out.print("Masukkan nama mahasiswa : ");
                nama = input.nextLine();

                System.out.print("Masukkan nilai tugas : ");
                tugas = input.nextDouble();

                System.out.print("Masukkan nilai UTS : ");
                uts = input.nextDouble();

                System.out.print("Masukkan nilai UAS : ");
                uas = input.nextDouble();

                // Hitung nilai murni
                nilaiTugas = tugas * 30 / 100;
                nilaiUTS = uts * 30 / 100;
                nilaiUAS = uas * 40 / 100;

                // Hitung nilai akhir
                nilaiAkhir = nilaiTugas + nilaiUTS + nilaiUAS;

                // Menentukan grade
                if (nilaiAkhir >= 80) {
                    grade = 'A';
                } else if (nilaiAkhir >= 70) {
                    grade = 'B';
                } else if (nilaiAkhir >= 59) {
                    grade = 'C';
                } else if (nilaiAkhir >= 50) {
                    grade = 'D';
                } else {
                    grade = 'E';
                }

                // Simpan data
                namamahasiswa[i] = nama;
                nilaiAkhirmahasiswa[i] = nilaiAkhir;
                grademahasiswa[i] = grade;
            }

            // Output hasil
            System.out.println("\nDAFTAR NILAI");
            System.out.println("MATA KULIAH : PEMROGRAMAN PBO");
            System.out.println("===================================================");

            System.out.println("No\tNama\t\tNilai Akhir\tGrade");

            System.out.println("===================================================");

            for (i = 0; i < jumlahMahasiswa; i++) {

                System.out.println((i + 1) + "\t"
                        + namamahasiswa[i] + "\t\t"
                        + nilaiAkhirmahasiswa[i] + "\t\t"
                        + grademahasiswa[i]);
            }

            System.out.println("===================================================");

            // Ulang program
            System.out.print("\nIngin mengulang program? (Y/T) : ");
            ulang = input.next().charAt(0);

            System.out.println();

        } while (ulang == 'Y' || ulang == 'y');

        System.out.println("Program selesai.");
    }
}
