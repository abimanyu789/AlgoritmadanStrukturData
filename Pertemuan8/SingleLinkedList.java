public class SingleLinkedList {
    Node head, tail;
    
    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
        if (!isEmpty()){
            Node tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null){
                System.out.print(tmp.data+"\t ");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }   
    }
    public void addFirst(String input){ //dari int ke string
        Node ndInput = new Node(input, null);
        if (isEmpty()){ //Jika linked list kosong
            head = ndInput; //head dan tail = node input
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput; 
        }
    }
    public void addLast(String input){ //dari int ke string
        Node ndInput = new Node(input, null);
        if (isEmpty()){
            head = ndInput; //head dan tail = node input
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key,String input){ //dari int int ke string string
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) {
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp != null);
    }
    public void insertAt(int index, String input){ //dari int int ke int string
        if(index < 0){
            System.out.println("indeks salah");
        } else if(index == 0){
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    //PRAKTIKUM 2
    public int getData(int index){
        Node tmp = head;
        for (int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        } else {
            return index;
        }
    }
    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }
    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if(head == tail){
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove(int key){
        if (isEmpty()){
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            Node temp = head;
            while (temp != null){
                if ((temp.data == key) && (temp == head)){
                    this.removeFirst();
                    break;
                } else if (temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;    
            }
        }
    }
    public void removeAt(int index){
        if (index == 0){
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }    
    //Tugas no1
    public void insertBefore(String key, String input) { //dari int int ke string string
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak dapat melakukan penambahan sebelum keyword!");
            return;
        }
        if (head.data == key) { // Jika key = head
            addFirst(input);
            return;
        }
        Node current = head;
        Node previous = null;
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            System.out.println("Keyword tidak ditemukan, tidak dapat melakukan penambahan sebelum keyword!");
            return;
        }
        previous.next = ndInput;
        ndInput.next = current;
    }

    //Tugas no2 -> Mengubah tipe data parameter dari method addFirst,addLast,InsertAfter,InsertAt,InsertBefore dan dari int menjadi char atau String
}
