package Praktikum.Pertemuan7.Stack;

public class StrukBelanjaMain {
    public static void main(String[] args) {
        StruckStack strukBelanjaStack = new StruckStack(8);
        
        
        strukBelanjaStack.Push(new StrukBelanja("TRX001", "2023-10-01", 5, 150.0));
        strukBelanjaStack.Push(new StrukBelanja("TRX002", "2023-10-08", 3, 75.0));
        strukBelanjaStack.Push(new StrukBelanja("TRX003", "2023-10-15", 7, 210.0));
        strukBelanjaStack.Push(new StrukBelanja("TRX004", "2023-10-22", 2, 60.0));
        strukBelanjaStack.Push(new StrukBelanja("TRX005", "2023-10-29", 6, 180.0));
        strukBelanjaStack.Push(new StrukBelanja("TRX006", "2023-11-05", 4, 120.0));
        strukBelanjaStack.Push(new StrukBelanja("TRX007", "2023-11-12", 5, 150.0));
        strukBelanjaStack.Push(new StrukBelanja("TRX008", "2023-11-19", 3, 75.0));

        System.out.println("Isi Stack Struk Belanja:");
        strukBelanjaStack.Print();
        
        // Mengambil 5 struk belanja untuk ditukarkan dengan voucher
        System.out.println("Struk Belanja yang akan ditukarkan dengan voucher:");
        for (int i = 0; i < 5; i++) {
            StrukBelanja struk = strukBelanjaStack.Pop();
            if (struk != null) {
                System.out.println(struk);
            }
        }
        System.out.println("");
        System.out.println("Isi Stack Setelah Pengambilan Struk Belanja:");
        strukBelanjaStack.Print();
    }
}
