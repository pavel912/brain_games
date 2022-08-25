package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
public class GCD {
    public static String[][] getQuestionsAndAnswers() {
        Random random = new Random();

        final int upperNumberBound = 99;

        int numberLeft;
        int numberRight;

        final int numberOfQuestions = Engine.COUNT_ROUNDS;

        String[][] questionsAndAnswers = new String[numberOfQuestions][2];

        for (int i = 0; i < numberOfQuestions; i++) {

            numberLeft = 1 + random.nextInt(upperNumberBound);
            numberRight = 1 + random.nextInt(upperNumberBound);

            questionsAndAnswers[i][0] = Integer.toString(numberLeft) + " " + Integer.toString(numberRight);
            questionsAndAnswers[i][1] = getGCD(Math.max(numberLeft, numberRight), Math.min(numberLeft, numberRight));
        }

        return questionsAndAnswers;
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
    public static String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }
}
