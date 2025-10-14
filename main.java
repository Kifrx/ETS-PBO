import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingCoffe mesin = new VendingCoffe();
        Bahan bahan = new Bahan();

        System.out.println("===== VENDING COFFEE MACHINE =====");
        mesin.tampilkanMenu();

        System.out.print("Pilih jenis kopi: ");
        String pilihan = sc.nextLine();

        int harga = mesin.pilihMenu(pilihan);
        if (harga == 0) return; 

        System.out.print("Tambahkan gula? (y/n): ");
        String tambahGula = sc.nextLine();
        int gula = tambahGula.equalsIgnoreCase("y") ? 10 : 0;

        System.out.print("Tambahkan susu? (y/n): ");
        String tambahSusu = sc.nextLine();
        int susu = tambahSusu.equalsIgnoreCase("y") ? 50 : 0;

        // Komposisi bahan dasar
        int kopi = 10;
        int air = 200;

        System.out.println("Total harga: Rp" + mesin.getTotalPrice());
        System.out.print("Masukkan uang pembayaran: Rp");
        int bayar = sc.nextInt();

        if (mesin.lakukanPembayaran(bayar)) {
            if (bahan.gunakanBahan(kopi, gula, susu, air)) {
                System.out.println(" Membuat kopi " + pilihan + "...");
                System.out.println("Kopi siap disajikan!");
            }
        }

        System.out.println();
        bahan.tampilkanStok();
    }
}
