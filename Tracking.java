import java.util.Scanner;

public class Tracking {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double startingPoint = 5082.42;
        double monthly = startingPoint / 4;
        double freeMonthly = monthly - 765.16;

        System.out.println("The amount of money in your bank account after receiving the loan refund is " + round(startingPoint));
        System.out.println("Your monthly budget is " + round(monthly));
        System.out.println("Taking mandatory monthly expenses into account, you will have " + round(freeMonthly) + " to spend on whatever you want. ");
        System.out.println("Use this program to track your money spending activity");   
        
        System.out.println("Which month are you in?");
        System.out.print("(January 13 - February 13: 1, February 14 - March 13: 2, March 14 - April 13: 3, April 14 - May 13: 4. ");
        int month = in.nextInt();

        if (month == 1) {
            double newBalance = startingPoint - 
        }
    }


    public static String round(double money) {
        return "$" + String.format("%.2f", money);
    }
}