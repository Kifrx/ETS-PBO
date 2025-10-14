public class Bahan {
    private int stokKopi = 5000;   // satuan gram
    private int stokGula = 5000;   // satuan gram
    private int stokSusu = 10000;  // satuan ml
    private int stokAir = 10000;   // satuan ml

    public Bahan() {
        // stok awal
    }

    public boolean gunakanBahan(int kopi, int gula, int susu, int air) {
        if (stokKopi >= kopi && stokGula >= gula && stokSusu >= susu && stokAir >= air) {
            stokKopi -= kopi;
            stokGula -= gula;
            stokSusu -= susu;
            stokAir -= air;
            return true;
        } else {
            System.out.println(" Stok bahan tidak mencukupi!");
            return false;
        }
    }

    public void tampilkanStok() {
        System.out.println("======= STOK BAHAN =======");
        System.out.println("Kopi: " + stokKopi + " g");
        System.out.println("Gula: " + stokGula + " g");
        System.out.println("Susu: " + stokSusu + " ml");
        System.out.println("Air : " + stokAir + " ml");
    }
}
