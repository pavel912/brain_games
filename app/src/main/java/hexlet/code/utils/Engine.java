package hexlet.code.utils;

import hexlet.code.games.Game;

import java.util.Scanner;
public final class Engine {
    private Game game;

    public void setGame(Game value) {
        this.game = value;
    }

    public Game getGame() {
        return game;
    }

    public void runGame() {
        Cli.greetUser();

        String userName = Cli.getUserName();

        Scanner scan = new Scanner(System.in);

        final int numberOfQuestions = 3;

        for (int i = 0; i < numberOfQuestions; i++) {
            String rules = game.getRules();
            System.out.println(rules);

            String question = game.getQuestion();
            System.out.println("Question: " + question);
            String correctAnswer = game.getAnswer();

            System.out.print("Your answer: ");
            String userAnswer = scan.nextLine();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct answer!");
            } else {
                System.out.println("Incorrect answer! Correct answer was "
                        + "\"" + correctAnswer + "\"");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }

        System.out.println("Congratulations, " + userName
                + "! You have got all answers correct!");
    }

}
