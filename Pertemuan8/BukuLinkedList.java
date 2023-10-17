public class BukuLinkedList {
    Buku head,tail;

    public boolean isEmpty() {
        return head == null;
    }
    public void addBuku(String judul) {
        Buku buku = new Buku(judul, null);
        if (isEmpty()) {
            head = buku;
            tail = buku;
        } else {
            tail.next = buku;
            tail = buku;
        }
    }
    public void addLast(String judul) {
        Buku newBuku = new Buku(judul, null);

        if (isEmpty()) {
            head = newBuku;
            tail = newBuku;
        } else {
            tail.next = newBuku;
            tail = newBuku;
        }
    }
    public void insertBefore(String targetJudul, String newJudul) {
        Buku newBuku = new Buku(newJudul, null);
        if (isEmpty()) {
            System.out.println("Linked list kosong. Tidak dapat melakukan operasi insertBefore.");
            return;
        }
        Buku current = head;
        Buku previous = null;

        while (current != null && !current.judul.equals(targetJudul)) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Buku dengan judul " + targetJudul + " tidak ditemukan.");
        } else {
            if (previous == null) {
                // Insert at the head
                newBuku.next = head;
                head = newBuku;
            } else {
                previous.next = newBuku;
                newBuku.next = current;
            }
        }
    }
    public void printBuku() {
        if (!isEmpty()) {
            Buku current = head;
            System.out.print("Daftar Linked List:");
            while (current != null) {
                System.out.print("\t "+current.judul);
                current = current.next;
            }
            System.out.println("\n====================");
        } else {
            System.out.println("Tidak ada buku dalam Linked List.");
        }
    }
}
