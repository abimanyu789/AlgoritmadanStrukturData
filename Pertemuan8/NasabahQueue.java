public class NasabahQueue {
    Nasabah front, rear;

    public boolean isEmpty() {
        return front == null;
    }
    public void enqueue(String nama, String alamat, String nomorRekening) {
        Nasabah nasabah = new Nasabah(nama, alamat, nomorRekening, null);
        if (isEmpty()) {
            front = nasabah;
            rear = nasabah;
        } else {
            rear.next = nasabah;
            rear = nasabah;
        }
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Nasabah yang di-dequeue:");
            System.out.println("Nama: " + front.nama);
            System.out.println("Alamat: " + front.alamat);
            System.out.println("Nomor Rekening: " + front.nomorRekening);
            System.out.println("----------------------");
            front = front.next;
            if (front == null) {
                rear = null;
            }
        }
    }
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            Nasabah current = front;
            System.out.println("Daftar Nasabah dalam Antrian:");
            while (current != null) {
                System.out.println("Nama: " + current.nama);
                System.out.println("Alamat: " + current.alamat);
                System.out.println("Nomor Rekening: " + current.nomorRekening);
                System.out.println("----------------------");
                current = current.next;
            }
        }
    }
}
