package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");

        System.out.print("Your choice: ");

        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();

        switch (command) {
            case "1" -> Cli.greetUser();
            case "2" -> Engine.runGame(
                    Even.getQuestionsAndAnswers(),
                    Even.getRules()
            );
            case "3" -> Engine.runGame(
                    Calc.getQuestionsAndAnswers(),
                    Calc.getRules()
            );
            case "4" -> Engine.runGame(
                    GCD.getQuestionsAndAnswers(),
                    GCD.getRules()
            );
            case "5" -> Engine.runGame(
                    Progression.getQuestionsAndAnswers(),
                    Progression.getRules()
            );
            case "6" -> Engine.runGame(
                    Prime.getQuestionsAndAnswers(),
                    Prime.getRules()
            );
            case "0" -> System.exit(0);
            default -> System.out.println("Command was not understood");
        }
    }
}
