package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void startGame() {
        Random random = new Random();

        final int upperNumberBound = 100;

        int number;

        final int numberOfQuestions = Engine.COUNT_ROUNDS;

        String[][] questionsAndAnswers = new String[numberOfQuestions][2];

        for (int i = 0; i < numberOfQuestions; i++) {

            number = 1 + random.nextInt(upperNumberBound);
            questionsAndAnswers[i][0] = Integer.toString(number);
            questionsAndAnswers[i][1] = isPrime(number) ? "yes" : "no";
        }

        Engine.runGame(questionsAndAnswers, getRules());
    }

    private static boolean isPrime(int number) {
        // not an optimal but quick solution
        if (number < 2) {
            return false;
        }
        for (int divisor = 2; divisor <= Math.ceil(Math.sqrt(number)); divisor++) {
            if (number % divisor == 0 && divisor < number) {
                return false;
            }
        }

        return true;
    }

    public static String getRules() {
        return RULES;
    }
}
