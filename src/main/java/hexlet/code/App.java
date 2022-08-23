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
            case "2" -> Engine.runGame(
                    Even.getQuestionsAndAnswers(
                            Engine.getNumberOfQuestions()
                    ),
                    Even.getRules()
            );
            case "3" -> Engine.runGame(
                    Calc.getQuestionsAndAnswers(
                            Engine.getNumberOfQuestions()
                    ),
                    Calc.getRules()
            );
            case "4" -> Engine.runGame(
                    GCD.getQuestionsAndAnswers(
                            Engine.getNumberOfQuestions()
                    ),
                    GCD.getRules()
            );
            case "5" -> Engine.runGame(
                    Progression.getQuestionsAndAnswers(
                            Engine.getNumberOfQuestions()
                    ),
                    Progression.getRules()
            );
            case "6" -> Engine.runGame(
                    Prime.getQuestionsAndAnswers(
                            Engine.getNumberOfQuestions()
                    ),
                    Prime.getRules()
            );
            case "0" -> System.exit(0);
            default -> System.out.println("Command was not understood");
        }
    }
}
