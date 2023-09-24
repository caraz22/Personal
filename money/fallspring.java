public class fallspring {

    public static void main(String[] args) {
        double fallBalance = 9924.37;
        double nonResidency = 4709.00;
        double residency = fallBalance - nonResidency;
        double fallAid = 18493.00;
        double nonResidencyRefund = fallAid - fallBalance;
        double residencyRefund = fallAid - residency;

        double primeFamily = 16.00;
        double primeStudent = 8.00;
        double nitro = 4.99;
        double spotify = 5.99;
        double dashPass = 4.99;
        double gamepass = 16.19;
        double monthlySubscriptions = primeFamily + primeStudent + nitro + spotify + dashPass + gamepass;

        double rent = 840.00; //1060.00
        double internet = 50.00;
        double pet = 25.00;
        double laundry = 35.00;
        double utilities = 50.00;
        double rentersInsurance = 15.34;
        double monthlyApartment = rent + internet + pet + laundry + utilities + rentersInsurance;

        double monthly = monthlyApartment + monthlySubscriptions;

        double fallSemester = monthly * 5;

        double nonResidencyRemainder = nonResidencyRefund - fallSemester;
        double residencyRemainder = residencyRefund - fallSemester;

        System.out.println("Your student balance for the Fall is " + round(fallBalance));
        System.out.println("The cost of tuition for being a non-resident of Ohio is " + round(nonResidency));
        System.out.println("Your refund for being a non-resident will be " + round(nonResidencyRefund));
        System.out.println("Your refund with residency will be " + round(residencyRefund));
        System.out.println("Your monthly subscriptions costs you " + round(monthlySubscriptions));
        System.out.println("Your monthly apartment expenses costs you " + round(monthlyApartment));
        System.out.println("Overall, your monthly expenses will be " + round(monthly));
        System.out.println("Your total expenses for the fall semester will be " + round(fallSemester));
        System.out.println("Your remaining money for the fall semester as a non-resident will be " + round(nonResidencyRemainder));
        System.out.println("Your remaining money for the fall semester as an Ohio resident will be " + round(residencyRemainder)); // - (840 * 2)
        System.out.println("Reaminimg money if you switch apartments: " + round(residencyRemainder - (840 * 2) - 250));
    }   

    public static String round(double value) {
        return String.format("%.2f", value);
    }
}