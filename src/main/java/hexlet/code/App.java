package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        String command = StartMenu.getCommand();

        String[] questions;
        String[] correctAnswers;
        String rules;

        switch (command) {
            case "1" -> Cli.greetUser();
            case "2" -> {
                questions = Even.getQuestions();
                correctAnswers = Even.getAnswers();
                rules = Even.getRules();
                Engine.runGame(questions, correctAnswers, rules);
            }
            case "3" -> {
                questions = Calc.getQuestions();
                correctAnswers = Calc.getAnswers();
                rules = Calc.getRules();
                Engine.runGame(questions, correctAnswers, rules);
            }
            case "4" -> {
                questions = GCD.getQuestions();
                correctAnswers = GCD.getAnswers();
                rules = GCD.getRules();
                Engine.runGame(questions, correctAnswers, rules);
            }
            case "5" -> {
                questions = Progression.getQuestions();
                correctAnswers = Progression.getAnswers();
                rules = Progression.getRules();
                Engine.runGame(questions, correctAnswers, rules);
            }
            case "6" -> {
                questions = Prime.getQuestions();
                correctAnswers = Prime.getAnswers();
                rules = Prime.getRules();
                Engine.runGame(questions, correctAnswers, rules);
            }
            case "0" -> System.exit(0);
            default -> System.out.println("Command was not understood");
        }
    }
}
