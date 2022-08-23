package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        String command = StartMenu.getCommand();

        switch (command) {
            case "1" -> Cli.greetUser();
            case "2" -> Engine.runGame(Even.getQuestionsAndAnswers(), Even.getRules());
            case "3" -> Engine.runGame(Calc.getQuestionsAndAnswers(), Calc.getRules());
            case "4" -> Engine.runGame(GCD.getQuestionsAndAnswers(), GCD.getRules());
            case "5" -> Engine.runGame(Progression.getQuestionsAndAnswers(), Progression.getRules());
            case "6" -> Engine.runGame(Prime.getQuestionsAndAnswers(), Prime.getRules());
            case "0" -> System.exit(0);
            default -> System.out.println("Command was not understood");
        }
    }
}
