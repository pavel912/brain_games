package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
public class Even {
    private static final String RULES = "Answer 'yes' if number even otherwise answer 'no'.";

    public static String[][] getQuestionsAndAnswers() {
        Random random = new Random();

        final int upperRandomBound = 100;

        final int numberOfQuestions = Engine.COUNT_ROUNDS;

        String[][] questionsAndAnswers = new String[numberOfQuestions][2];

        for (int i = 0; i < numberOfQuestions; i++) {
            int number = random.nextInt(upperRandomBound);

            questionsAndAnswers[i][0] = Integer.toString(number);
            questionsAndAnswers[i][1] = number % 2 == 0 ? "yes" : "no";
        }

        return questionsAndAnswers;
    }

    public static String getRules() {
        return RULES;
    }
}
