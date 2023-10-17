public class BukuMain {
    public static void main(String[] args) {
        BukuStack bukuStack = new BukuStack();
        BukuLinkedList bukuLinkedList = bukuStack.getBukuLinkedList();
        String jdl[] = {"Multimedia","Statistika","Algoritma","Matematika","Basis Data","Komputer","Android","Bahasa"};
        //CARA 1
        //Memasukkan data pada array ke dalam Stack
        for (int i = jdl.length-1; i >= 0; i--){
            bukuStack.push(jdl[i]);  
        }
        bukuStack.printStack(); // Mencetak seluruh buku dalam stack
        
        //Mengeluarkan data dari Stack dan menambahkannya ke dalam Linked List
        for (int i = jdl.length-1; i >= 0; i--){
            bukuStack.popAndAddToLinkedList();
            bukuLinkedList.printBuku();    
        }
        bukuStack.printStack();
        bukuLinkedList.printBuku(); 

        //CARA 2
        //Memasukkan data pada array ke dalam Linked List
        // for (int i = 0; i <= jdl.length-1; i++){
        //     bukuLinkedList.addLast(jdl[i]);
        //     bukuLinkedList.printBuku();
        // }
        // bukuLinkedList.printBuku();
    }
}
