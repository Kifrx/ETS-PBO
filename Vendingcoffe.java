import java.util.ArrayList;

public class VendingCoffe {
    private ArrayList<String> namaMenu;
    private ArrayList<Integer> hargaMenu;
    private int totalPrice;

    public VendingCoffe() {
        namaMenu = new ArrayList<>();
        hargaMenu = new ArrayList<>();
        totalPrice = 0;

        // menu
        tambahMenu("Espresso", 10000);
        tambahMenu("Americano", 12000);
        tambahMenu("Latte", 15000);
        tambahMenu("Cappuccino", 15000);
    }

    private void tambahMenu(String nama, int harga) {
        namaMenu.add(nama);
        hargaMenu.add(harga);
    }

    public void tampilkanMenu() {
        System.out.println("=== MENU KOPI ===");
        for (int i = 0; i < namaMenu.size(); i++) {
            System.out.println((i + 1) + ". " + namaMenu.get(i) + " - Rp" + hargaMenu.get(i));
        }
    }

    public int pilihMenu(int nomor) {
        if (nomor >= 1 && nomor <= namaMenu.size()) {
            totalPrice = hargaMenu.get(nomor - 1);
            System.out.println("Anda memilih: " + namaMenu.get(nomor - 1));
            return totalPrice;
        } else {
            System.out.println("Nomor menu tidak valid.");
            return 0;
        }
    }

    public boolean lakukanPembayaran(int jumlahBayar) {
        if (jumlahBayar >= totalPrice) {
            int kembalian = jumlahBayar - totalPrice;
            System.out.println(" Pembayaran berhasil! Kembalian: Rp" + kembalian);
            return true;
        } else {
            System.out.println("Uang tidak cukup. Transaksi dibatalkan.");
            return false;
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getNamaMenu(int nomor) {
        if (nomor >= 1 && nomor <= namaMenu.size()) {
            return namaMenu.get(nomor - 1);
        }
        return "Tidak diketahui";
    }
}
