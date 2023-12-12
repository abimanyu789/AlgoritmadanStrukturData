package Praktikum.Pertemuan16;

import java.util.PriorityQueue;
import java.util.Comparator;

public interface Heap {
    int getSize();
    boolean isEmpty();
    void insert (int element);
    int extractRoot ();   
}

public class MinHeap implements Heap {
    private final PriorityQueue<Integer> pq;
    
    public MinHeap() {
        this.pq = new PriorityQueue<>();
    }
    @Override
    public int getSize() {
        return pq.size();
    }
    @Override
    public boolean isEmpty() { 
        return pq.isEmpty();
    }
    @Override
    public void insert (int element) { 
        pq.add(element);
    }
    @Override
    public int extractRoot () { 
        return pq.remove();
    }
}

public class MaxHeap implements Heap {
    private final PriorityQueue<Integer> pq;

    public MaxHeap() {
    this.pq = new PriorityQueue<>(Comparator.reverseOrder());
    }
    @Override
    public int getSize() { 
        return pq.size();
    }
    @Override
    public boolean isEmpty() { 
        return pq.isEmpty();
    }
    @Override
    public void insert (int element) {
        pq.add(element);
    }
    @Override
    public int extractRoot () {
        return pq.remove();
    }
}

public class Main {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(); 
        MaxHeap maxHeap = new MaxHeap();
        
        minHeap.insert(10); 
        minHeap.insert (5); 
        minHeap.insert (20);
        
        System.out.println("Ukuran heap-min: " + minHeap.getSize()); 
        System.out.println("Elemen minimum: " + minHeap.extractRoot()); 
        System.out.println("Elemen tersisa: " + minHeap.pq);
        
        maxHeap.insert(10); 
        maxHeap.insert (5); 
        maxHeap.insert (20);
        
        System.out.println("Ukuran heap-max: " + maxHeap.getSize());
        System.out.println("Elemen max: " + maxHeap.extractRoot());
        System.out.println("Elemen tersisa: " + maxHeap.pq);
    }
}