public class fallFinances {
    
    public static void main(String[] args) {

        double laundry = 46.67;
        double gamePass = 18.35;
        double nitro = 2.99;
        double primeStudent = 8.00;
        double youtubePremium = 7.99;
        double netflix = 16.54;
        double rentalInsurance = 17.34;
        double spotify = 10.99;
        double dashPass = 5.99;
        double electric = 100.00;
        double rent = 800.00;

        double monthlyExpenses = laundry + gamePass + nitro + primeStudent + youtubePremium + netflix + rentalInsurance + spotify + dashPass + electric + rent;
        System.out.println(monthlyExpenses);
        double loanMoney = 7200;

        double monthlyLoan = loanMoney / 4;
        double monthlyLeftOver = monthlyLoan - monthlyExpenses;
        System.out.println(monthlyLeftOver);
    }
}
