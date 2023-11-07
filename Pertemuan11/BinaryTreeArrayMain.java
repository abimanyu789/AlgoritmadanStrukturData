package Praktikum.Pertemuan11;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        // BinaryTreeArray bta = new BinaryTreeArray();
        // int[] data = { 6,4,8,3,5,7,9,0,0,0 };
        // int idxLast = 6;
        // bta.populateData(data, idxLast);
        // bta.traverseInOrder(0);

        //TUGAS
        BinaryTreeArray bta = new BinaryTreeArray(10);

        bta.add(6);
        bta.add(4);
        bta.add(8);
        bta.add(3);
        bta.add(5);
        bta.add(7);
        bta.add(9);

        bta.add(12);
        bta.add(18);
        System.out.print("Traverse In-Order: ");
        bta.traverseInOrder(0);
        System.out.println();
        
        System.out.print("Traverse Pre-Order: ");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.print("Traverse Post-Order: ");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
