package Praktikum.Pertemuan7.Stack;
import java.util.Scanner;
public class ReverseMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String word = scanner.nextLine();

        Reverser stack = new Reverser(word.length());
        stack.pushChar(word);
        String hasil = stack.popChar();
        System.out.println("Hasil: " + hasil);    
    }
}
