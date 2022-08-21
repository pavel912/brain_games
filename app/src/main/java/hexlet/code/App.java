package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.EvenCheckGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.utils.Cli;
import hexlet.code.utils.Engine;
import hexlet.code.utils.StartMenu;

public class App {
    public static void main(String[] args) {
        String command = StartMenu.getCommand();

        Engine gameFlow = new Engine();

        switch (command) {
            case "1" -> Cli.greetUser();
            case "2" -> {
                EvenCheckGame evenGame = new EvenCheckGame();
                gameFlow.setGame(evenGame);
                gameFlow.runGame();
            }
            case "3" -> {
                CalculatorGame calcGame = new CalculatorGame();
                gameFlow.setGame(calcGame);
                gameFlow.runGame();
            }
            case "4" -> {
                GCDGame gcdGame = new GCDGame();
                gameFlow.setGame(gcdGame);
                gameFlow.runGame();
            }
            case "5" -> {
                ProgressionGame pGame = new ProgressionGame();
                gameFlow.setGame(pGame);
                gameFlow.runGame();
            }
            case "0" -> System.exit(0);
            default -> System.out.println("Command was not understood");
        }
    }
}
