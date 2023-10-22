package Praktikum.Pertemuan7.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack stk = new Stack(5);

        stk.Push(15);
        stk.Push(27);
        stk.Push(13);
        stk.Print();

        stk.Push(11);        
        stk.Push(34);
        stk.Pop();
        stk.Peek();
        // jwb modif no2
        stk.Push(18);
        stk.Push(40);
        stk.Print();
    }
}
