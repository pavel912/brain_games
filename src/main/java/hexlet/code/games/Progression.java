package hexlet.code.games;

import java.util.Random;
public class Progression {
    public static String[][] getQuestionsAndAnswers(int numberOfQuestions) {
        Random random = new Random();

        final int seriesLength = 10;

        final int upperBoundStart = 100;
        final int upperBoundDiff = 19;

        String[][] questionsAndAnswers = new String[numberOfQuestions][2];

        for (int i = 0; i < numberOfQuestions; i++) {

            int numberStart = random.nextInt(upperBoundStart);
            int numberDiff = 1 + random.nextInt(upperBoundDiff);
            int skipIndex = random.nextInt(seriesLength);

            questionsAndAnswers[i][0] = buildSeries(numberStart, numberDiff, skipIndex, seriesLength);

            questionsAndAnswers[i][1] = Integer.toString(numberStart + numberDiff * skipIndex);
        }

        return questionsAndAnswers;
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
    public static String getRules() {
        return "What number is missing in the progression?";
    }
}
