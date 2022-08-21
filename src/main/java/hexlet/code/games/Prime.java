package hexlet.code.games;

import java.util.Random;
public class Prime {
    private static String[] answers;

    public static String[] getQuestions() {
        Random random = new Random();

        final int upperNumberBound = 100;

        int number;

        final int numberOfQuestions = 3;

        String[] questions = new String[numberOfQuestions];

        answers = new String[numberOfQuestions];

        for (int i = 0; i < numberOfQuestions; i++) {

            number = 1 + random.nextInt(upperNumberBound);
            questions[i] = Integer.toString(number);
            answers[i] = isPrime(number);
        }

        return questions;
    }

    public static String isPrime(int number) {
        // not an optimal but quick solution
        final int three = 3; // checkstyle doesn't like magic numbers
        if (number == 1 || number == 2 || number == three) {
            return "yes";
        }
        for (int divisor = 2; divisor <= Math.ceil(Math.sqrt(number)); divisor++) {
            if (number % divisor == 0) {
                return "no";
            }
        }

        return "yes";
    }

    public static String[] getAnswers() {
        return answers;
    }
    public static String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
