package Praktikum.Pertemuan7.Stack;
public class Reverser {
    char[] data;
    int top;

    public Reverser(int size) {
        data = new char[size];
        top = -1;
    }
    public void push(char c) {
        data[++top] = c;
    }
    public void pushChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            push(str.charAt(i));
        }
    }
    public char pop() {
        return data[top--];
    }
    public String popChar() {
        StringBuilder reversed = new StringBuilder();
        while (!isEmpty()) {
            reversed.append(pop());
        }
        return reversed.toString();
    }
    public boolean isEmpty() {
        return top == -1;
    }
}
