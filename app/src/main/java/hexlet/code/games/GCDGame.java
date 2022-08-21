package hexlet.code.games;

import java.util.Random;
public class GCDGame {
    private static String[] answers;
    public static String[] getQuestions() {
        Random random = new Random();

        final int upperNumberBound = 99;

        int numberLeft;
        int numberRight;

        final int numberOfQuestions = 3;

        String[] questions = new String[numberOfQuestions];

        answers = new String[numberOfQuestions];

        for (int i = 0; i < numberOfQuestions; i++) {

            numberLeft = 1 + random.nextInt(upperNumberBound);
            numberRight = 1 + random.nextInt(upperNumberBound);

            questions[i] = Integer.toString(numberLeft) + " " + Integer.toString(numberRight);
            answers[i] = getGCD(Math.max(numberLeft, numberRight), Math.min(numberLeft, numberRight));
        }

        return questions;
    }
    public static String getGCD(int a, int b) {
        //Euclidean algorithm
        int remainder = 1;
        // "a" is always greater then "b"

        while (remainder > 0) {
            remainder = a % b;
            a = b;
            b = remainder;
        }
        // remainder is 0 when a % b == 0 and since "a" was rewritten as "b", the gcd is "a"
        return Integer.toString(a);
    }

    public static String[] getAnswers() {
        return answers;
    }
    public static String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }
}
