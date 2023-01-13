import java.util.ArrayList;
import java.util.Scanner;

public class Finances {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("What month are you in? ");
        String month = in.nextLine();

        double rent = 450.00;
        double dashPass = 4.99;
        double creditPayment = 35.00;
        double xboxLive = 16.19;
        double studentPrime = 8.00;
        double regularPrime = 16.00;
        double spotify = 4.99;
        double internet = 69.99;
        
        ArrayList<String> paymentDates = new ArrayList<>();
        System.out.println(date(month, "rent", 1, ("$" + round(rent))));

        in.close();
    }

    public static String round(double charge) {
        return String.format("%.2f", charge);
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
