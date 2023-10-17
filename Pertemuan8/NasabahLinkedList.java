public class NasabahLinkedList {
    Nasabah head, tail;

    public boolean isEmpty() {
        return head == null;
    }
    public void addNasabah(String nama, String alamat, String nomorRekening) {
        Nasabah nasabah = new Nasabah(nama, alamat, nomorRekening, null);
        if (isEmpty()) {
            head = nasabah;
            tail = nasabah;
        } else {
            tail.next = nasabah;
            tail = nasabah;
        }
    }
    public void printNasabah() {
        if (!isEmpty()) {
            Nasabah current = head;
            System.out.println("Daftar Nasabah:");
            while (current != null) {
                System.out.println("Nama: " + current.nama);
                System.out.println("Alamat: " + current.alamat);
                System.out.println("Nomor Rekening: " + current.nomorRekening);
                System.out.println("----------------------");
                current = current.next;
            }
        } else {
            System.out.println("Tidak ada nasabah.");
        }
    }
}
