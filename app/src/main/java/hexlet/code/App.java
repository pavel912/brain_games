package hexlet.code;

import hexlet.code.games.EvenCheckGame;
import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.utils.Cli;
import hexlet.code.utils.Engine;
import hexlet.code.utils.StartMenu;

public class App {
    public static void main(String[] args) {
        String command = StartMenu.getCommand();

        String[] questions;
        String[] correctAnswers;
        String rules;

        switch (command) {
            case "1" -> Cli.greetUser();
            case "2" -> {
                questions = EvenCheckGame.getQuestions();
                correctAnswers = EvenCheckGame.getAnswers();
                rules = EvenCheckGame.getRules();
                Engine.runGame(questions, correctAnswers, rules);
            }
            case "3" -> {
                questions = CalculatorGame.getQuestions();
                correctAnswers = CalculatorGame.getAnswers();
                rules = CalculatorGame.getRules();
                Engine.runGame(questions, correctAnswers, rules);
            }
            case "4" -> {
                questions = GCDGame.getQuestions();
                correctAnswers = GCDGame.getAnswers();
                rules = GCDGame.getRules();
                Engine.runGame(questions, correctAnswers, rules);
            }
            case "5" -> {
                questions = ProgressionGame.getQuestions();
                correctAnswers = ProgressionGame.getAnswers();
                rules = ProgressionGame.getRules();
                Engine.runGame(questions, correctAnswers, rules);
            }
            case "6" -> {
                questions = PrimeGame.getQuestions();
                correctAnswers = PrimeGame.getAnswers();
                rules = PrimeGame.getRules();
                Engine.runGame(questions, correctAnswers, rules);
            }
            case "0" -> System.exit(0);
            default -> System.out.println("Command was not understood");
        }
    }
}
