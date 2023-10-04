import java.util.Scanner;
public class MainSupermarket04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================\n\tWelcome to Andi's Supermarket\n================================================");
        Transaksi04 Transaksi04 = new Transaksi04();
        Transaksi04 trnset_123 = new Transaksi04();
        int idHashCode = trnset_123.hashCode();
        System.out.println("Hash code dari ID transaksi: " + idHashCode);
        int choice = -1;
        
        while (choice != 0) {
            System.out.println("\n========== Supermarket App ==========");
            System.out.println("1. Tambah item");
            System.out.println("2. Update item");
            System.out.println("3. Hapus item");
            System.out.println("4. Lihat keranjang belanja");
            System.out.println("5. Cek pesanan");
            System.out.println("6. Hitung total belanja");
            System.out.println("0. Keluar");
            System.out.print("Masukkan Pilihan Anda: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang valid.");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama item: ");
                    String itemName = sc.nextLine();
                    System.out.print("Masukkan jumlah item: ");
                    int quantity = Integer.parseInt(sc.nextLine());
                    System.out.print("Masukkan harga per item: ");
                    double price = Double.parseDouble(sc.nextLine());
                    Transaksi04.tambahItem(itemName, quantity, price);
                    break;
                case 2:
                    System.out.print("Masukkan nama item yang ingin diupdate: ");
                    String oldItemName = sc.nextLine();
                    System.out.print("Masukkan nama baru item: ");
                    String newItemName = sc.nextLine();
                    Transaksi04.updateItemName(oldItemName, newItemName);
                    break;
                case 3:
                    System.out.print("Masukkan nama item yang ingin dihapus: ");
                    String itemToDelete = sc.nextLine();
                    Transaksi04.hapusItem(itemToDelete);
                    break;
                case 4:
                    Transaksi04.tampilBelanja();
                    break;
                case 5:
                    Transaksi04.checkOrder();
                    break;
                case 6:
                    Transaksi04.tampilRingkasan();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan Supermarket App.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }

        sc.close();
    }
}
