public class fall {
    
    public static void main(String[] args) {
        double refund = 9645.63;

        double primeFamily = 16.00;
        double primeStudent = 8.00;
        double nitro = 4.99;
        double spotify = 5.99;
        double dashPass = 4.99;
        double gamepass = 16.19;
        double monthlySubscriptions = primeFamily + primeStudent + nitro + spotify + dashPass + gamepass;
        
        double rent = 840.00;
        double internet = 50.00;
        double pet = 25.00;
        double laundry = 35.00;
        double utilities = 50.00;
        double rentersInsurance = 15.34;
        double monthlyApartment = rent + internet + pet + laundry + utilities + rentersInsurance;

        double monthlyTotal = monthlyApartment + monthlySubscriptions;
        double totalExpenses = monthlyTotal * 5;
        double remaining = refund - totalExpenses;

        System.out.println("Remaining money after all monthly expenses for the next 5 months: " + round(remaining));
        System.out.println("Amount you can spend per month: " + round(remaining / 5));
    }

    public static String round(double value) {
        return "$" + String.format("%.2f", value);
    }
}
