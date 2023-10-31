package Praktikum.Pertemuan10;

public class FilmDLL {
    Film head, tail;

    public boolean isEmpty() {
        return head == null;
    }
    public void tambahDataAwal(int id, String judul, double rating) {
        Film filmBaru = new Film(id, judul, rating);
        if (isEmpty()) {
            head = filmBaru;
            tail = filmBaru;
        } else {
            filmBaru.next = head;
            head.prev = filmBaru;
            head = filmBaru;
        }
    }
    public void tambahDataAkhir(int id, String judul, double rating) {
        Film filmBaru = new Film(id, judul, rating);
        if (isEmpty()) {
            head = filmBaru;
            tail = filmBaru;
        } else {
            filmBaru.prev = tail;
            tail.next = filmBaru;
            tail = filmBaru;
        }
    }
    public void tambahDataIndex(int id, String judul, double rating, int index) {
        Film filmBaru = new Film(id, judul, rating);
        Film current = head;
        int currIndex = 0;
        while (current != null && currIndex < index) {
            current = current.next;
            currIndex++;
        }
        if (current == null) {
            System.out.println("Index melebihi panjang daftar.");
            return ;
        }
        filmBaru.prev = current.prev;
        filmBaru.next = current;
        if (current.prev == null) {
            head = filmBaru;
        } else {
            current.prev.next = filmBaru;
        }
        current.prev = filmBaru;
        System.out.println("Data telah ditambahkan pada urutan ke-"+index+" dalam daftar.");
    }
    public void hapusDataPertama() {
        if (!isEmpty()) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
    }
    public void hapusDataTerakhir() {
        if (!isEmpty()) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        }
    }
    public void hapusDataIndex(int index) {
        if (!isEmpty()) {
            Film current = head;
            int currentIndex = 0;
            while (current != null && currentIndex < index) {
                current = current.next;
                currentIndex++;
            }
            if (current == null) {
                System.out.println("Index melebihi panjang daftar.");
                return;
            }
            if (current.prev == null) {
                head = current.next;
            } else {
                current.prev.next = current.next;
            }
            if (current.next == null) {
                tail = current.prev;
            } else {
                current.next.prev = current.prev;
            }
        }
    }
    public void cetak() {
        if (isEmpty()) {
            System.out.println("Daftar Film masih kosong.");
        } else{
            System.out.println("===============      DAFTAR FILM      ===============");
            System.out.println("-----------------------------------------------------");
            System.out.printf("| %-7s | %-25s | %-10s |\n", "ID FILM","JUDUL FILM","RATING FILM");
            System.out.println("-----------------------------------------------------");
            Film current = head;
            while (current != null) {
                System.out.printf("| %-7d | %-25s | %-10.2f |\n", current.id, current.judul, current.rating);
                current = current.next;
            }
            System.out.println("-----------------------------------------------------");
        }   
    }
    public Film searchById(int id) {
        Film current = head;
        int index = 0;
        while (current != null) {
            if (current.id == id) {
                System.out.println("Film dengan ID "+id+" ditemukan di indeks ke-"+index);
                return current;
            }
            current = current.next;
            index++;
        }
        System.out.println("Film dengan ID "+id+" tidak ditemukan dalam daftar.");
        return null;
    }
    public void sortRatingDescending() {
        if (isEmpty()) {
            System.out.println("Daftar Film kosong. Tidak ada yang diurutkan.");
            return;
        }
        boolean swapped;
        Film temp;
        do {
            swapped = false;
            Film current = head;
            while (current.next != null) {
                if (current.rating < current.next.rating) {
                    temp = current;
                    current = current.next;
                    current.prev = temp.prev;
                    temp.next = current.next;
                    current.next = temp;
                    temp.prev = current;
                    if (temp == head) {
                        head = current;
                    } else {
                        temp.prev.next = current;
                    }
                    if (current.next != null) {
                        current.next.prev = temp;
                    }
                    swapped = true;
                }
                current = current.next;
            }
        } while (!swapped);
        System.out.println("Daftar Film diurutkan berdasarkan Rating (Descending).");
    }
}
