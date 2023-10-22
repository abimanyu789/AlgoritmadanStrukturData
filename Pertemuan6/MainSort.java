package Praktikum.Pertemuan6;

public class MainSort {
    public static void main(String[] args) {
        int a[] = {15,10,7,22,5};
        Sort urut = new Sort(a, a.length);
        System.out.println("Data sebelum urut");
        urut.tampilData();
        System.out.println("=========================================");
        System.out.println("Data sesudah urut Bubble sort (ASC)");
        urut.bubbleSort();
        urut.tampilData();
        System.out.println("Data sesudah urut Selection sort (ASC)");
        urut.selectionSort();
        urut.tampilData();
        //modif no4
        System.out.println("=========================================");
        System.out.println("Data sesudah urut Bubble sort (DESC)");
        urut.bubbleSortDesc();
        urut.tampilData();
        System.out.println("Data sesudah urut Selection sort (DESC)");
        urut.selectionSortDesc();
        urut.tampilData();
    }
}
