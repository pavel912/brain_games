package hexlet.code;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Random;

public class EvenCheckGame {
    public static void runGame() {
        final int numberOfQuestions = 3;

        Random random = new Random();

        final int upperRandomBound = 100;

        int questNumber;

        HashMap<Boolean, String> boolToString = new HashMap<>();
        boolToString.put(true, "yes");
        boolToString.put(false, "no");

        Scanner scan = new Scanner(System.in);

        int countCorrectAnswers = 0;

        String userName = Cli.greetUser();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        for (int i = 0; i < numberOfQuestions; i++) {
            questNumber = random.nextInt(upperRandomBound);

            System.out.println("Question: " + Integer.toString(questNumber));

            System.out.print("Your answer: ");

            String userAnswer = scan.nextLine();

            String correctAnswer = boolToString.get(questNumber % 2 == 0);

            if (!boolToString.containsValue(userAnswer)) {
                System.out.println("Incorrect answer! Correct answer was "
                        + correctAnswer);
                continue;
            }

            // if userAnswer is True and number is even also True then correct
            // if userAnswer is False and number is even also False then correct
            // else incorrect
            // which means ans is correct when userAnswer and check for evenness has the same bool value
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct answer!");
                countCorrectAnswers++;
            } else {
                System.out.println("Incorrect answer! Correct answer was "
                        + correctAnswer);
            }
        }

        System.out.println("Congratulations, " + userName
                + "! You have got " + Integer.toString(countCorrectAnswers)
                + " out of " + Integer.toString(numberOfQuestions) + " answers correct!");
    }
}
