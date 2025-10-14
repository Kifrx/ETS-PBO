import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingCoffe {
    private Map<String, Integer> menuCoffe;
    private int totalPrice;

    public VendingCoffe() {
        menuCoffe = new HashMap<>();
        totalPrice = 0;

        menuCoffe.put("Espresso", 10000);
        menuCoffe.put("Americano", 12000);
        menuCoffe.put("Latte", 15000);
        menuCoffe.put("Cappuccino", 15000);
    }

    public void tampilkanMenu() {
        System.out.println("===== MENU KOPI =====");
        for (Map.Entry<String, Integer> entry : menuCoffe.entrySet()) {
            System.out.println("- " + entry.getKey() + " : Rp" + entry.getValue());
        }
    }

    public int pilihMenu(String namaKopi) {
        if (menuCoffe.containsKey(namaKopi)) {
            totalPrice = menuCoffe.get(namaKopi);
            return totalPrice;
        } else {
            System.out.println("Menu tidak tersedia!");
            return 0;
        }
    }

    public boolean lakukanPembayaran(int jumlahBayar) {
        if (jumlahBayar >= totalPrice) {
            int kembalian = jumlahBayar - totalPrice;
            System.out.println(" Pembayaran berhasil! Kembalian: Rp" + kembalian);
            return true;
        } else {
            System.out.println(" Uang tidak mencukupi");
            return false;
        }
    }

    public int getTotalPrice() {
        return totalPrice;
    }
}
