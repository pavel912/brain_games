package hexlet.code;

import java.util.Scanner;
public class StartMenu {
    public static String getCommand() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");

        System.out.print("Your choice: ");

        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }
}
