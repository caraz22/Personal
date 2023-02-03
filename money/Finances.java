import java.util.ArrayList;
import java.util.Scanner;

public class Finances {
    
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);

        System.out.print("What month are you in? ");
        String month = in.nextLine();

        double rent = 450.00;
        double dashPass = 4.99;
        double creditMinimum = 35.00;
        double xboxLive = 16.19;
        double studentPrime = 8.00;
        double regularPrime = 16.00;
        double spotify = 4.99;
        double internet = 69.99;
        double groceries = 160.00;
        
        double total = rent + dashPass + creditMinimum + xboxLive + studentPrime + regularPrime + spotify + internet + groceries;
        
        ArrayList<String> paymentDates = new ArrayList<>();
        String rentPayment = date(month, "rent", 1, round(rent));
        String dashPassPayment = date(month, "DashPass", 2, round(dashPass));
        String creditPayment = date(month, "minimum credit payment", 1, round(creditMinimum));
        String xboxPayment = date(month, "Xbox Live", 5, round(xboxLive));
        String studentPrimePayment = date(month, "Amazon Prime for students", 9, round(studentPrime));
        String regularPrimePayment = date(month, "Amazon Prime", 12, round(regularPrime));
        String spotifyPayment = date(month, "Spotify premium", 19, round(spotify));
        String internetPayment = date(month, "Spectrum internet", 20, round(internet));
        paymentDates.add(rentPayment);
        paymentDates.add(dashPassPayment);
        paymentDates.add(creditPayment);
        paymentDates.add(xboxPayment);
        paymentDates.add(studentPrimePayment);
        paymentDates.add(regularPrimePayment);
        paymentDates.add(spotifyPayment);
        paymentDates.add(internetPayment);

        for (int i = 0; i < paymentDates.size(); i++) {
            System.out.println(paymentDates.get(i));
        }

        System.out.println("You will also pay for groceries a couple times, around $80 per trip");
        System.out.println();

        System.out.println("Your monthly payments come out to be " + round(total));
        System.out.println();

        double loan = 5060.00;
        double monthlyAmount = loan / 4;
        double freeSpend = monthlyAmount - total;


        System.out.println("You will be receiving " + round(loan) + " to last for about 4 months");
        System.out.println("This gives you roughly " + round(monthlyAmount) + " per month");
        System.out.println("With all necessary payments being accounted for, you'll have about " + round(freeSpend) + " to spend on whatever you want");

        in.close();
    }

    public static String round(double charge) {
        return "$" + String.format("%.2f", charge);
    }

    public static String date(String month, String charge, int day, String price) {
        String dayOfMonth = "You will have a charge for " + charge + " on " + month + " " + dayExtension(day) + " for " + price;
        return dayOfMonth;
    }

    public static String dayExtension(int day) {
        if (day == 1 || day == 21 || day == 31) {
            return day + "st";
        } else if (day == 2 || day == 22) {
            return day + "nd";
        } else if (day == 3 || day == 23) {
            return day + "rd";
        } else if (day == 4 || day == 5 || day == 6 || day == 7 || day == 8 || day == 9 || day == 10 || day == 11 || day == 12 || day == 13 || day == 14 || day == 15 || day == 16 || day == 17 || day == 18 || day == 19 || day == 20 || day == 24 || day == 25 || day == 26 || day == 27 || day == 28 || day == 29 || day == 30) {
            return day + "th";
        } else {
            return "invalid";
        }
    }
}
