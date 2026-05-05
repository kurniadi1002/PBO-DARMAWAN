import java.util.Scanner;

class Pesanan {
    String jenis;
    int harga;
    int banyak;
    int jumlah;

    Pesanan(String jenis, int harga, int banyak) {
        this.jenis = jenis;
        this.harga = harga;
        this.banyak = banyak;
        this.jumlah = harga * banyak;
    }
}

public class GerobakFriedChicken {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("GEROBAK FRIED CHICKEN");
        System.out.println("---------------------------");
        System.out.println("Kode   Jenis    Harga");
        System.out.println("---------------------------");
        System.out.println("D      Dada     Rp. 2500");
        System.out.println("P      Paha     Rp. 2000");
        System.out.println("S      Sayap    Rp. 1500");
        System.out.println("---------------------------");

        System.out.print("\nBanyak Jenis : ");
        int banyakJenis = input.nextInt();

        
        Pesanan[] daftarPesanan = new Pesanan[banyakJenis];
        int jumlahBayar = 0;

        for (int i = 0; i < banyakJenis; i++) {
            System.out.println("\nJenis Ke - " + (i + 1));
            System.out.print("Jenis Potong [D/P/S] : ");
            char kode = input.next().toUpperCase().charAt(0);
            System.out.print("Banyak Potong        : ");
            int banyakBeli = input.nextInt();

            String namaJenis = "";
            int hargaSatuan = 0;

            if (kode == 'D') {
                namaJenis = "Dada";
                hargaSatuan = 2500;
            } else if (kode == 'P') {
                namaJenis = "Paha";
                hargaSatuan = 2000;
            } else if (kode == 'S') {
                namaJenis = "Sayap";
                hargaSatuan = 1500;
            }

            daftarPesanan[i] = new Pesanan(namaJenis, hargaSatuan, banyakBeli);
            jumlahBayar += daftarPesanan[i].jumlah;
        }

        System.out.println("\n\nGEROBAK FRIED CHICKEN");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-4s %-15s %-15s %-12s %-12s\n", "No.", "Jenis Potong", "Harga Satuan", "Banyak Beli", "Jumlah Harga");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < banyakJenis; i++) {
            System.out.printf("%-4d %-15s %-15d %-12d Rp. %-10d\n", 
                (i + 1), daftarPesanan[i].jenis, daftarPesanan[i].harga, 
                daftarPesanan[i].banyak, daftarPesanan[i].jumlah);
        }

        double pajak = jumlahBayar * 0.1;
        double totalBayar = jumlahBayar + pajak;

        System.out.println("------------------------------------------------------------------");
        System.out.printf("%45s Rp. %d\n", "Jumlah Bayar", jumlahBayar);
        System.out.printf("%45s Rp. %.0f\n", "Pajak 10%", pajak);
        System.out.printf("%45s Rp. %.0f\n", "Total Bayar", totalBayar);
    }
}
