import java.util.Scanner;

public class switchApartments {
    
    public static void main(String[] args) {
        double refund = 13177.63;

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

        double monthlyExpenses = monthlyApartment + monthlySubscriptions;
        double beforeSwitch = monthlyExpenses * 4;
        double breakLease = (rent * 2) + 250;

        double remainder = refund - (beforeSwitch + breakLease);

        Scanner in = new Scanner(System.in);
        System.out.print("What is the rent for the new place you are looking at? "); 
        double newRent = in.nextDouble();
        double twoMonths = newRent * 2;
        double petDeposit = 450.00;
        double newRemainder = remainder - (twoMonths + petDeposit);

        System.out.println("Your total refund for the fall semester is " + round(refund));
        System.out.println("Your monthly subscriptions total is " + round(monthlySubscriptions));
        System.out.println("The total of the monthly expenses for the apartment is " + round(monthlyApartment));
        System.out.println("That brings your total monthly costs to " + round(monthlyExpenses));
        System.out.println("Over the four months you'd be staying for, it'll cost you " + round(beforeSwitch));
        System.out.println("Breaking the lease at the Highlands will cost you " + round(breakLease));
        System.out.println("Altogether, if you plan on breaking the lease and moving in December, your remining money afterwards will be " + round(remainder));
        System.out.println("On top of that, you would need most likely pay two months rent at the new apartment, plus any deposits that need to be made. That takes you to a new remainder of " + round(newRemainder));
        System.out.println("That leaves you with about " + round(newRemainder / 5) + " a month of free spending money.");
        in.close();
    }

    public static String round(double value) {
        return String.format("%.2f", value);
    }
}
