public class NasabahMain {
    public static void main(String[] args) {
        NasabahLinkedList nasabahList = new NasabahLinkedList();
        nasabahList.printNasabah(); 
        // Menambahkan beberapa nasabah
        nasabahList.addNasabah("Radit Dika", "Jl. Sudirman No. 123", "1234567890");
        nasabahList.addNasabah("Renaldi Setiawan", "Jl. Pahlawan No. 456", "0987654321");

        nasabahList.printNasabah();
    }
}
