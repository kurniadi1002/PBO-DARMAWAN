import java.util.Scanner;

public class Pembayaran_penjualan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("TOKO KELONTONG KERONCONGAN");
        System.out.println("--------------------------");
        System.out.println("A. Susu Dancow");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");
        System.out.println("B. Susu Bendera");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");
        System.out.println("C. Susu SGM");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");
        System.out.println();

        System.out.print("Masukan Kode Merk Susu [A=Dancow B=Bendera C=SGM] : ");
        char merk = input.next().charAt(0);

        System.out.print("Masukan Kode Ukuran Kaleng [1=Kecil 2=Sedang 3=Besar] : ");
        char ukuran = input.next().charAt(0);

        System.out.print("Jumlah Yang dibeli : ");
        int jumlah = input.nextInt();

        int hargaSatuan = 0;
        String merkOutput = "";
        String ukuranOutput = "";
        boolean valid = false;

        if (merk == 'A') {
            merkOutput = "Dancow";
            if (ukuran == '1') {
                hargaSatuan = 25000;
                ukuranOutput = "Kecil";
                valid = true;
            } else if (ukuran == '2') {
                hargaSatuan = 20000;
                ukuranOutput = "Sedang";
                valid = true;
            } else if (ukuran == '3') {
                hargaSatuan = 15000;
                ukuranOutput = "Besar";
                valid = true;
            }
        } else if (merk == 'B') {
            merkOutput = "Bendera";
            if (ukuran == '1') {
                hargaSatuan = 20000;
                ukuranOutput = "Kecil";
                valid = true;
            } else if (ukuran == '2') {
                hargaSatuan = 17500;
                ukuranOutput = "Sedang";
                valid = true;
            } else if (ukuran == '3') {
                hargaSatuan = 13500;
                ukuranOutput = "Besar";
                valid = true;
            }
        } else if (merk == 'C') {
            merkOutput = "SGM";
            if (ukuran == '1') {
                hargaSatuan = 22000;
                ukuranOutput = "Kecil";
                valid = true;
            } else if (ukuran == '2') {
                hargaSatuan = 18500;
                ukuranOutput = "Sedang";
                valid = true;
            } else if (ukuran == '3') {
                hargaSatuan = 15000;
                ukuranOutput = "Besar";
                valid = true;
            }
        }

        if (!valid) {
            System.out.println("Merk atau ukuran tidak valid.");
            return;
        }

        int totalBayar = hargaSatuan * jumlah;

        System.out.println();
        System.out.println("Merk Susu      : " + merkOutput);
        System.out.println("Ukuran Kaleng   : " + ukuranOutput);
        System.out.println("Harga Satuan Barang Rp. " + hargaSatuan);
        System.out.println("Jumlah Yang dibeli : " + jumlah);
        System.out.println();
        System.out.println("Harga Yang Harus dibayar Sebesar Rp. " + totalBayar);
    }
}
