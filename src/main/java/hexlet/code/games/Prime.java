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
            questionsAndAnswers[i][1] = isPrime(number);
        }

        Engine.runGame(questionsAndAnswers, getRules());
    }

    private static String isPrime(int number) {
        // not an optimal but quick solution
        final int three = 3; // checkstyle doesn't like magic numbers
        if (number == 1) {
            return "no";
        } else if (number == 2 || number == three) {
            return "yes";
        }
        for (int divisor = 2; divisor <= Math.ceil(Math.sqrt(number)); divisor++) {
            if (number % divisor == 0) {
                return "no";
            }
        }

        return "yes";
    }
    public static String getRules() {
        return RULES;
    }
}
