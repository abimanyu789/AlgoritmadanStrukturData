package Praktikum.Pertemuan3;

public class Pangkat {
    public int nilai,pangkat;

    // Konstruktor untuk menginisialisasi atribut nilai dan pangkat
    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    // public int pangkatBF(int a, int n){
    //     int hasil=1;
    //     for(int i=0; i<n; i++){
    //         hasil *= a;
    //     }
    //     return hasil;
    // }
    // public int pangkatDC(int a, int n){
    //     if (n == 0){
    //         return 1;
    //     }
    //     else{
    //         if(n%2==1){ //bil. ganjil
    //             return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
    //         }
    //         else { //bil. genap
    //             return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
    //         }
    //     }
    // }

    // modifikasi methode no4
    public int pangkatBF(){
        int hasil=1;
        for(int i=0; i<pangkat; i++){
            hasil *= nilai;
        }
        return hasil;
    }
    public int pangkatDC(int a, int n){
        if (n == 0){
            return 1;
        }
        else{
            int hasil  = pangkatDC(a,n/2);
            if(n % 2 == 1){ //bil. ganjil
                return hasil  * hasil  * nilai;
            }
            else { //bil. genap
                return hasil  * hasil ;
            }
        }
    }

}
