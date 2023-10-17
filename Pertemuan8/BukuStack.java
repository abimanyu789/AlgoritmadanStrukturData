public class BukuStack {
    Buku top;
    BukuLinkedList bLL;

    public BukuStack() {
        bLL = new BukuLinkedList();
    }


    public boolean isEmpty() {
        return top == null;
    }
    public void push(String judul) {
        Buku buku = new Buku(judul, null);
        if (isEmpty()) {
            top = buku;
        } else {
            buku.next = top;
            top = buku;
        }
    }
    public void popAndAddToLinkedList() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            System.out.println("Buku yang di-pop dari stack: "+top.judul);
            System.out.println("----------------------");
            Buku poppedBuku = top;
            top = top.next;
            bLL.addBuku(poppedBuku.judul);
        }
    }
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            System.out.println("Buku teratas dalam stack:");
            System.out.println("Judul: " + top.judul);
            System.out.println("----------------------");
        }
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            System.out.println("Daftar Buku dalam Stack:");
            Buku current = top;
            while (current != null) {
                System.out.println(""+current.judul);
                current = current.next;
            }
            System.out.println("");
        }
    }
    public BukuLinkedList getBukuLinkedList() {
        return bLL;
    }

}
