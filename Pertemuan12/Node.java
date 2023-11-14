package Praktikum.Pertemuan12;

public class Node<T> {  //4
    T data;             //4
    Node<T> next, prev; //4

    public Node(Node<T> prev, T data, Node<T> next) { //4
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
