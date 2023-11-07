package Praktikum.Pertemuan11;

public class BinaryTreeArray {
    int[] data;
    int idxLast;
    int capacity; //tgs modif

    // public BinaryTreeArray() {
    //     data = new int[10];
    // }
    // public void populateData(int[] data, int idxLast) {
    //     this.data = data;
    //     this.idxLast = idxLast;
    // }
    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
    //TUGAS 
    public BinaryTreeArray(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        idxLast = -1;
    }
    //  NO. 5.1
    public void add(int data) {
        if (idxLast < capacity - 1) {
            idxLast++;
            this.data[idxLast] = data;
        } else {
            System.out.println("Tree penuh, data " + data + " tidak dapat ditambahkan.");
        }
    }
    //  NO. 5.2
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
    public void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
