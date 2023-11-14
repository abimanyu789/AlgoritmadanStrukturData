package Praktikum.Pertemuan12;

public class LinkedList<T> {    //4
    Node<T> head;       //4
    int size;
    
    public LinkedList() {
        head = null;
        size = 0;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void addFirst(T data) {      //4
        if (isEmpty()) {
            head = new Node(null, data, null);
        } else {
            Node newNode = new Node(null, data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(T data) {       //T
        if (isEmpty()) {
            addFirst(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, data, null);
            current.next = newNode;
            size++;
        }
    }
    public void add(T data, int index) throws Exception {   //4
        if (isEmpty()) {
            addFirst(data);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, data, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, data, current);
                newNode.prev = current.prev;
                newNode.next = current;
                newNode.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    public int size() {
        return size;
    }
    public void clear() {
        head = null;
        size = 0;
    }
    public void print() {
        if (!isEmpty()) {
            Node<T> tmp = head;     //4
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    //Praktikum 2
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    //Praktikum 3
    public T getFirst() throws Exception {      //4
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        return head.data;
    }
    public T getLast() throws Exception {       //4
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node<T> tmp = head;     //4
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public T get(int index) throws Exception {      //4
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node<T> tmp = head;     //4
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }    
}
