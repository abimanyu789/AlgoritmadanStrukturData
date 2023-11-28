package Praktikum.Pertemuan14;
import java.util.ArrayList;
import java.util.Scanner;

public class HashTableMhs {
    private int size = 10;
    private Node[] dataMap;

    static class Node {
        Mahasiswa value;
        Node next;

        Node(Mahasiswa value) {
            this.value = value;
        }
    }
    public HashTableMhs() {
        this.dataMap = new Node[this.size];
    }
    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.dataMap.length;
        }
        return hash;
    }
    public void setMahasiswa(Mahasiswa mahasiswa) {
        String nim = mahasiswa.nim;
        int hash = hash(nim);
        Node newNode = new Node(mahasiswa);

        if (this.dataMap[hash] == null) {
            this.dataMap[hash] = newNode;
        } else {
            Node current = this.dataMap[hash];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public Mahasiswa getMahasiswa(String nim) {
        int hash = hash(nim);
        Node current = this.dataMap[hash];
        while (current != null) {
            if (current.value.nim.equals(nim)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }
    public Mahasiswa findMahasiswa(String nim) {
        int hash = hash(nim);
        Node current = this.dataMap[hash];
        while (current != null) {
            if (current.value.nim.equals(nim)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }    
    public void removeMahasiswa(String nim) {
        int hash = hash(nim);
        Node current = this.dataMap[hash];
        Node previous = null;
        while (current != null) {
            if (current.value.nim.equals(nim)) {
                if (previous == null) {
                    this.dataMap[hash] = current.next;
                } else {
                    previous.next = current.next;
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }    
    public ArrayList<String> getAllNIMs() {
        ArrayList<String> nimList = new ArrayList<>();
        for (Node node : this.dataMap) {
            Node current = node;
            while (current != null) {
                nimList.add(current.value.nim);
                current = current.next;
            }
        }
        return nimList;
    }
}
