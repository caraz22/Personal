public class Tracking {

    public static void main(String[] args) {

        double startingPoint = 5082.42;
        double freeMonthly = startingPoint / 4;
        System.out.println("The amount of money in your bank account after receiving the loan refund is " + round(startingPoint));
        System.out.println("Use this program to track your money spending activity");
        System.out.println("Your monthly budget is " + round(freeMonthly));
        
    }

    public static String round(double money) {
        return "$" + String.format("%.2f", money);
    }
}