package testing;

import java.util.Scanner;

public class os {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of columns: ");
        int x = in.nextInt();
        System.out.println();

        System.out.print("Enter number of rows: ");
        int y = in.nextInt();
        System.out.println();

        int numColumns = cursorNum(x, 79);
        int numRows = cursorNum(y, 24);

        System.out.println("Cursor column number: " + numColumns);
        System.out.println("Cursor row number: " + numRows);

        in.close();
    }

    static int cursorNum(int num, int maxNum) {
        int cursor = num;
        while (num > maxNum) {
            cursor = (num % maxNum) - 1;
            num = cursor;
        }

        return cursor;
    }
}
