package Praktikum.Pertemuan7.Stack;

public class BukuStack {
    int size, top;
    Buku data[];
    
    public BukuStack(int size){
        this.size = size;
        data = new Buku[size];
        top = -1;
    }
    public boolean IsEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull(){
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }
    public void Push(Buku bk){
        if (!IsFull()){
            top++;
            data[top] = bk;
        } else {
            System.out.println("Isi stack penuh!");
        }
    }
    public void Pop(){
        if (!IsEmpty()){
            Buku x = data[top];
            top--;
            System.out.println("Data yang keluar: "+x.judul+" "+
            x.namaPengarang+" "+x.thnTerbit+" "+x.jmlHlm+" "+x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    public void Peek(){
        System.out.println("Elemen teratas: "+data[top].judul+" "+data[top].namaPengarang+
        " "+data[top].thnTerbit+" "+data[top].jmlHlm+" "+data[top].harga);
    }
    public void Print(){
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--){
            System.out.println(data[i].judul+" "+data[i].namaPengarang+
        " "+data[i].thnTerbit+" "+data[i].jmlHlm+" "+data[i].harga);
        }
        System.out.println("");
    }
    public void Clear(){
        if (!IsEmpty()){
            for (int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
