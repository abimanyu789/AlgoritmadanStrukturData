package Praktikum.Pertemuan11;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println(bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println();

        //TUGAS
        //  NO.2
        System.out.println("========================");
        int minValue = bt.findMinValue();
        int maxValue = bt.findMaxValue();
        System.out.println("Nilai Terkecil: " + minValue);
        System.out.println("Nilai Terbesar: " + maxValue);
        //  NO.3
        System.out.println("========================");
        System.out.print("Leaf Nodes : ");
        bt.printLeafNodes();
        System.out.println();
        //  NO.4
        int leafNodeCount = bt.countLeafNodes();
        System.out.println("Jumlah Leaf Nodes: " + leafNodeCount);
    }
}
