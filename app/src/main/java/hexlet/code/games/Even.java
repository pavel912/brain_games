package hexlet.code.games;

import java.util.Random;
public class Even {
    private static String[] answers;
    public static String[] getQuestions() {
        Random random = new Random();

        final int upperRandomBound = 100;

        final int numberOfQuestions = 3;

        String[] questions = new String[numberOfQuestions];
        answers = new String[numberOfQuestions];

        for (int i = 0; i < numberOfQuestions; i++) {
            int number = random.nextInt(upperRandomBound);

            questions[i] = Integer.toString(number);
            answers[i] = number % 2 == 0 ? "yes" : "no";
        }

        return questions;
    }

    public static String[] getAnswers() {
        return answers;
    }

    public static String getRules() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }
}
