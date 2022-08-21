package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String userName;
    public static void greetUser() {
        System.out.println("Welcome to the Brain Games!");

        System.out.print("May I have your name? ");

        Scanner scan = new Scanner(System.in);

        userName = scan.nextLine();

        System.out.println("Hello, " + userName + "!");
    }

    public static String getUserName() {
        return userName;
    }
}
