package Praktikum.Pertemuan3;

import java.util.Scanner;
public class MainCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("\t\tPerhitungan Profits Perusahaan");
        System.out.println("======================================================");
        System.out.print("Masukkan jumlah perusahaan: ");
        int numCompanies = sc.nextInt();

        Company[] companies = new Company[numCompanies];

        // Masukkan data keuntungan perusahaan
        for (int i = 0; i < numCompanies; i++) {
            System.out.print("Masukkan nama perusahaan ke-" + (i + 1) + ": ");
            String companyName = sc.next();
            System.out.print("Masukkan jumlah BULAN keuntungan perusahaan ke-" + (i + 1) + ": ");
            int numMonths = sc.nextInt();
            companies[i] = new Company(companyName, numMonths);

            for (int j = 0; j < numMonths; j++) {
                System.out.print("Masukkan keuntungan bulan " + (j + 1) + " (juta): ");
                double profit = sc.nextDouble();
                companies[i].setMonthlyProfit(j, profit);
            }
            System.out.println("======================================================");
        }

        // Tampilkan total keuntungan perusahaan
        System.out.println("\n\t\tTotal Keuntungan Perusahaan");
        for (int i = 0; i < numCompanies; i++) {
            Company company = companies[i];
            System.out.println((i+1)+". Perusahaan " + company.name + ": " + company.totalProfit + " juta");
        }
        System.out.println("======================================================");
    }
}
