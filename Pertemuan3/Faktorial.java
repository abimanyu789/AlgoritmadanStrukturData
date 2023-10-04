package Praktikum.Pertemuan3;

public class Faktorial {
    public int nilai;

    public int FaktorialBF(int n){ //menggunakan for
        int fakto = 1;
        for (int i=1;i<=n;i++){
            fakto *= i;
        }
        return fakto;
    }    

    // public int FaktorialBF(int n) { //menggunakan while
    //     int fakto = 1;
    //     int i = 1;
    //     while (i <= n) {
    //         fakto *= i;
    //         i++;
    //     }
    //     return fakto;
    // }
    
    // public int FaktorialBF(int n) { //menggunakan rekursif
    //     if (n == 0 || n == 1) {
    //         return 1;
    //     } else {
    //         return n * FaktorialBF(n - 1);
    //     }
    // }
    

    public int FaktorialDC(int n){
        if(n==1){
            return 1;
        }
        else{
            int fakto = n * FaktorialDC(n-1);
            return fakto;
        }
    }
}
