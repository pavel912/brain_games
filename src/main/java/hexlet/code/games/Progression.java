package hexlet.code.games;

import java.util.Random;
public class Progression {
    private static String[] answers;
    public static String[] getQuestions() {
        Random random = new Random();

        final int seriesLength = 10;

        final int upperBoundStart = 100;
        final int upperBoundDiff = 19;

        final int numberOfQuestions = 3;

        String[] questions = new String[numberOfQuestions];

        answers = new String[numberOfQuestions];

        for (int i = 0; i < numberOfQuestions; i++) {

            int numberStart = random.nextInt(upperBoundStart);
            int numberDiff = 1 + random.nextInt(upperBoundDiff);
            int skipIndex = random.nextInt(seriesLength);

            answers[i] = Integer.toString(numberStart + numberDiff * skipIndex);

            questions[i] = buildSeries(numberStart, numberDiff, skipIndex, seriesLength);
        }

        return questions;
    }

    public static String buildSeries(int numberStart, int numberDiff, int skipIndex, int seriesLength) {
        StringBuilder builder = new StringBuilder();

        for (int j = 0; j < seriesLength; j++) {
            if (j == skipIndex) {
                builder.append(".. ");
            } else {
                builder.append(numberStart + numberDiff * j);
                builder.append(" ");
            }
        }

        return builder.toString();
    }

    public static String[] getAnswers() {
        return answers;
    }

    public static String getRules() {
        return "What number is missing in the progression?";
    }
}
