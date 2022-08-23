package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static void runGame(String[][] questionsAndAnswers, String rules) {
        System.out.println("Welcome to the Brain Games!");

        System.out.print("May I have your name? ");

        Scanner scan = new Scanner(System.in);

        String userName = scan.nextLine();

        System.out.println("Hello, " + userName + "!");

        final int numberOfQuestions = 3;

        System.out.println(rules);

        for (int i = 0; i < numberOfQuestions; i++) {

            System.out.println("Question: " + questionsAndAnswers[i][0]);

            System.out.print("Your answer: ");
            String userAnswer = scan.nextLine();

            if (userAnswer.equals(questionsAndAnswers[i][1])) {
                System.out.println("Correct answer!");
            } else {
                System.out.println(userAnswer + " is incorrect. Correct answer was "
                        + "\"" + questionsAndAnswers[i][1] + "\"");
                System.out.println("Let's try again, " + userName + "!");
                System.exit(0);
            }
        }

        System.out.println("Congratulations, " + userName
                + "! You have got all answers correct!");
    }

}
