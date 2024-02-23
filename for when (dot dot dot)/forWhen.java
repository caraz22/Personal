import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class forWhen {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        String prompt = "If you are starting up this program, it must mean you aren't feeling well. Tell me, how are you feeling?";
        String[] letters = prompt.split("");

        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
            if (i == 35 || i == 82) {
                Thread.sleep(300);
            } else if (i == 73) {
                Thread.sleep(500);
            } else {
                Thread.sleep(40);                
            }
        }

        Thread.sleep(500);
        System.out.println();  

        String[] feelings = {"anxious", "lonely", "ugly"};
        for (int i = 0; i < feelings.length; i++) {
            System.out.println((i + 1) + ". " + feelings[i]);
            Thread.sleep(500);
        }

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println();

        if (num == 1) {
            txt("anxious");
        } else if (num == 2) {
            txt("lonely");
        } else if (num == 3) {
            txt("ugly");
        }

        in.close();
    }

    public static void txt(String feeling) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("for when (dot dot dot)/txt/" + feeling + ".txt"));
        System.out.println("For when you are feeling " + feeling + ":");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }
}