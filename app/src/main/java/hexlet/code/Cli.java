package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetUser() {
        System.out.println("Welcome to the Brain Games!");

        System.out.print("May I have your name? ");

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, " + scan.nextLine() + "!");
    }
}
