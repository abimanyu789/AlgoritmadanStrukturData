public class Item04 {
    private String itemName;
    private int qty;
    private double harga;

    Item04(String itemName, int qty, double harga) {
        this.itemName = itemName;
        this.qty = qty;
        this.harga = harga;
    }
    double getTotalHarga() {
        return qty * harga;
    }
    public String toString() {
        return String.format("| %-15s | %-10d | %-10.2f |", itemName, qty, harga);
    }
    String getItemName() {
        return itemName;
    }
    int getqty() {
        return qty;
    }
    double getHarga() {
        return harga;
    }
    void updateItemName(String newName) {
        this.itemName = newName;
    }
    void updateItemQty(int newQty) {
        this.qty = newQty;
    }
    void updateItemHarga(double newPrice) {
        this.harga = newPrice;
    }
}
