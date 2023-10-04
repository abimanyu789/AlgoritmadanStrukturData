package Praktikum.Pertemuan3;

class Company {
    public String name;
    public int numMonths;
    public double[] monthlyProfits;
    public double totalProfit;

    public Company(String name, int numMonths) {
        this.name = name;
        this.numMonths = numMonths;
        this.monthlyProfits = new double[numMonths];
        this.totalProfit = 0;
    }

    public void setMonthlyProfit(int month, double profit) {
        if (month >= 0 && month < numMonths) {
            monthlyProfits[month] = profit;
            totalProfit += profit;
        } else {
            System.out.println("Bulan tidak valid.");
        }
    }
}
