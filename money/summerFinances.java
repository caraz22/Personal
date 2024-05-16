public class summerFinances {
    
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
        double electric = 80.00;
        double rent = 975.00;

        double monthlyExpenses = laundry + gamePass + nitro + primeStudent + youtubePremium + netflix + rentalInsurance + spotify + dashPass + electric + rent;
        double loanMoney = 9351.98;
        double extraMoney = loanMoney - (monthlyExpenses * 3);
        System.out.println("Monthly expenses: " + monthlyExpenses);
        System.out.println(extraMoney);
        
        double loanReduced = 6000.00;
        double monthlyLoan = loanReduced / 3;
        double monthlyLeftOver = monthlyLoan - monthlyExpenses;
        System.out.println(monthlyLeftOver);
    }
}
