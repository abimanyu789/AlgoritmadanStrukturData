package Praktikum.Pertemuan10;

public class Node {
    //int data;
    String data;
    Node next, prev;
    // public Node(Node prev, int data, Node next) {
    //     this.prev = prev;
    //     this.data = data;
    //     this.next = next;
    // }
    
    //Tgs1
    public Node(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
