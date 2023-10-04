package Praktikum.Pertemuan1;
public class FungsiFibo04 {
    // menampilkan deret Fibonacci dengan perulangan
    public static void printFibonacciLoop(int n) {
        int prev = 0;
        int current = 1;
        System.out.print("Deret Fibonacci dengan perulangan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(prev + " ");
            int next = prev + current;
            prev = current;
            current = next;
        }
        System.out.println();
    }
    // menghitung deret Fibonacci rekursif
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    // menampilkan deret Fibonacci rekursif
    public static void printFibonacciRecursive(int n) {
        System.out.print("Deret Fibonacci dengan rekursif: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 9; //Jumlah angka dalam deret Fibonacci
        printFibonacciLoop(n);
        printFibonacciRecursive(n);
    }
}