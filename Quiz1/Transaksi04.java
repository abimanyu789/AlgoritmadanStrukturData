import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Transaksi04 {
    private List<Item04> items;
    Transaksi04() {
        this.items = new ArrayList<>();
    }
    void tambahItem(String itemName, int qty, double price) {
        Item04 item = new Item04(itemName, qty, price);
        items.add(item);
    }
    void updateItemName(String itemName, String newName) {
        for (Item04 item : items) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.updateItemName(newName);
                return;
            }
        }
        System.out.println("Barang tidak ditemukan | Item not found.");
    }
    void updateItemQuantity(String itemName, int newQuantity) {
        for (Item04 item : items) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.updateItemQty(newQuantity);
                return;
            }
        }
        System.out.println("Barang tidak ditemukan | Item not found.");
    }
    void updateItemPrice(String itemName, double newPrice) {
        for (Item04 item : items) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                item.updateItemHarga(newPrice);
                return;
            }
        }
        System.out.println("Barang tidak ditemukan | Item not found.");
    }
    void hapusItem(String itemName) {
        Iterator<Item04> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item04 item = iterator.next();
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Barang tidak ditemukan | Item not found.");
    }
    void resetTransaksi() {
        items.clear();
        System.out.println("Transaksi telah direset. Daftar .");
    }
    void checkOrder() {
        System.out.println("\n=============== Detail Pesanan ===============");
        System.out.println("No   | Nama Item       | Jumlah Item | Harga/Item");
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%-5d", i + 1);
            System.out.println(items.get(i).toString());
        }
        System.out.println("-------------------------------------------------");
    }
    double hitungTotalHarga() {
        double total = 0;
        for (Item04 item : items) {
            total += item.getTotalHarga();
        }
        return total;
    }
    double hitungDiskon() {
        double totalHarga = hitungTotalHarga();
        double diskon = 0;
        if (totalHarga > 500000) {
            diskon = 0.10;
        } else if (totalHarga > 300000) {
            diskon = 0.08;
        } else if (totalHarga > 200000) {
            diskon = 0.05;
        }
        return totalHarga * diskon;
    }
    void tampilRingkasan() {
        System.out.println("\n========== Ringkasan Belanja ==========");
        System.out.println("Total Harga Belanja: Rp " + hitungTotalHarga());
        double jmlDiscount = hitungDiskon();
        if (jmlDiscount > 0) {
            System.out.println("Diskon: Rp " + jmlDiscount);
            System.out.println("Total Harga Setelah Diskon: Rp " + (hitungTotalHarga() - jmlDiscount));
        } else {
            System.out.println("Diskon: Rp 0");
        }
        System.out.println("------------------------------------------------");
    }
    void tampilBelanja() {
        System.out.println("\n=============== Shopping Cart ===============");
        for (Item04 item : items) {
            System.out.println(item.toString());
        }
        System.out.println("------------------------------------------------");
        System.out.println("Total Harga: " + hitungTotalHarga());
    }
}