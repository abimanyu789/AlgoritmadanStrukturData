package Praktikum.Pertemuan16.procedural;

public class Hashtable<K, V> {
    private Node<K, V>[] table;
    private int size;
    
    public Hashtable (int capacity) {
        // Initialize the table with empty nodes 
        table = new Node[capacity];
        size = 0;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public V put (K key, V value) {
        int hash = hash(key);
        int index = indexFor (hash, table.length);
        
        Node<K, V> node = table[index]; 
        while (node != null) { 
            if (node.key.equals(key)) { 
                // Update existing value 
                V oldValue = node.value;
                node.value = value; 
                return oldValue;
            }
            node = node.next;
        }
        // Add new entry 
        table[index] = new Node<>(key, value, table[index]);
        size++;
        return null;
    } 
    public V get (K key) {
        int hash = hash(key);
        int index = indexFor (hash, table.length);
        
        Node<K, V> node = table[index]; 
        while (node != null) { 
            if (node.key.equals(key)) {
                return node.value;
            } 
            node = node.next;
        }
        return null;
    }
    public V remove (K key) {
        int hash = hash (key);
        int index = indexFor (hash, table.length);
        
        Node<K, V> node = table[index];
        Node<K, V> prev = null;
        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) {
                    table[index] = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return node.value;
            }
            prev = node;
            node = node.next;
        }
        return null;
    }
    private int hash (K key) {
        // Hash function chosen based on your needs 
        int h = key.hashCode(); 
        return h ^ (h >>> 16);
    }
    private int indexFor (int hash, int length) {
        return hash % length;
    }
    private static class Node<K, V>{
        K key;
        V value;
        Node<K, V> next;
        
        public Node (K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
