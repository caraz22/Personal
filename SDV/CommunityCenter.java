package games.SDV;

import java.util.Scanner;

public class CommunityCenter {
    
    public static void main(String[] args) {

        System.out.println("Welcome to the Stardew Valley Community Center completion guide!\n");
        System.out.print("What part of the community center are you working on? If you are unsure, enter 'unsure'. ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (input.equals("unsure")) {

        }

        in.close();
    }

    public static void list(String input) {
        
    }
}
