import java.util.ArrayList;
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

        double newBalance = 0;

        if (month == 1) {
            newBalance = startingPoint - monthly;
            System.out.println("Your budget requires you to keep your bank account at no lower than " + round(newBalance));
        } else if (month == 2) {
            newBalance = startingPoint - (monthly * 2);
            System.out.println("Your budget requires you to keep your bank account at no lower than " + round(newBalance));
        } else if (month == 3) {
            newBalance = startingPoint - (monthly * 3);
            System.out.println("Your budget requires you to keep your bank account at no lower than " + round(newBalance));
        } else if (month == 4) {
            System.out.println("Your budget requires you to keep your bank account positive");
        }

        double calculatedBudget = calculate(freeMonthly);
        if (calculatedBudget >= 0) {
             System.out.println("So far, you still have " + round(calculatedBudget) + " to spend for the month.");            
        }else if (calculatedBudget < 0) {
            double nextMonth = freeMonthly + calculatedBudget;
            System.out.println("Since you went over your budget for the month, next month you will have " + round(nextMonth) + " for free spending.");
        }

        in.close();
    }

    /*
    ADD CHARGES HERE AS THEY COME
    */
    public static double calculate(double freeMonthly) {
        double allCharges = 0;
        ArrayList<Double> charges = new ArrayList<>();
        double amazon = 109.82;
        double meijer = 8.68;
        
        charges.add(amazon);
        charges.add(meijer);

        for (int i = 0; i < charges.size(); i++) {
            allCharges += charges.get(i);
        }

        double remainingFreeSpend = freeMonthly - allCharges;

        return remainingFreeSpend;
    }

    public static String round(double money) {
        return "$" + String.format("%.2f", money);
    }
}