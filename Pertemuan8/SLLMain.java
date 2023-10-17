public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        // singLL.addFirst(890);
        // singLL.print();
        // singLL.addLast(760);
        // singLL.print();
        // singLL.addFirst(700);
        // singLL.print();
        // singLL.insertAfter(700,999);
        // singLL.print();
        // singLL.insertAt(3, 833);
        // singLL.print();

        // //PRAKTIKUM 2
        // System.out.println("Data pada indeks ke-1 = "+singLL.getData(1));
        // System.out.println("Data 3 berada pada indeks ke-"+singLL.indexOf(760));
    
        // singLL.remove(999);
        // singLL.print();
        // singLL.removeAt(0);
        // singLL.print();
        // singLL.removeFirst();
        // singLL.print();
        // singLL.insertBefore(760, 555); //Tugas no1  
        // singLL.print();
        // singLL.removeLast();
        // singLL.print();

        // //Tugas no2
        // singLL.addFirst("a");
        // singLL.print();
        // singLL.addLast("e");
        // singLL.print();
        // singLL.insertAfter("a", "b");
        // singLL.print();
        // singLL.insertAt(2, "c");
        // singLL.print();
        // singLL.insertBefore("e", "d");
        // singLL.print();

        //Tugas no3
        singLL.addFirst("Multimedia");
        singLL.print();
        singLL.insertAfter("Multimedia", "Statistika");
        singLL.print();
        singLL.insertAfter("Statistika", "Algoritma");
        singLL.print();
        singLL.insertAfter("Algoritma", "Matematika");
        singLL.print();
        singLL.insertAfter("Matematika", "Basis Data");
        singLL.print();
        singLL.insertAfter("Basis Data", "Komputer");
        singLL.print();
        singLL.insertAfter("Komputer", "Android");
        singLL.print();
        singLL.addLast("Bahasa");
        singLL.print();
    }
}
