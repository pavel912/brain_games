package hexlet.code.utils;

import java.util.Scanner;
public class Engine {
    public static void runGame(String[] questions, String[] correctAnswers, String rules) {
        Cli.greetUser();

        String userName = Cli.getUserName();

        Scanner scan = new Scanner(System.in);

        final int numberOfQuestions = 3;

        System.out.println(rules);

        for (int i = 0; i < numberOfQuestions; i++) {

            System.out.println("Question: " + questions[i]);

            System.out.print("Your answer: ");
            String userAnswer = scan.nextLine();

            if (userAnswer.equals(correctAnswers[i])) {
                System.out.println("Correct answer!");
            } else {
                System.out.println(userAnswer + " is incorrect. Correct answer was "
                        + "\"" + correctAnswers[i] + "\"");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }

        System.out.println("Congratulations, " + userName
                + "! You have got all answers correct!");
    }

}
