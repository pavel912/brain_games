package hexlet.code.utils;

import java.util.Scanner;
public class StartMenu {
    public static String getCommand() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");

        System.out.print("Your choice: ");

        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }
}
