package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
public class Progression {
    private static final String RULES = "What number is missing in the progression?";
    public static void startGame() {
        Random random = new Random();

        final int seriesLength = 10;

        final int upperBoundStart = 100;
        final int upperBoundDiff = 19;

        final int numberOfQuestions = Engine.COUNT_ROUNDS;

        String[][] questionsAndAnswers = new String[numberOfQuestions][2];

        for (int i = 0; i < numberOfQuestions; i++) {

            int numberStart = random.nextInt(upperBoundStart);
            int numberDiff = 1 + random.nextInt(upperBoundDiff);
            int skipIndex = random.nextInt(seriesLength);

            int[] series = buildSeries(numberStart, numberDiff, seriesLength);

            questionsAndAnswers[i][0] = seriesToString(series, skipIndex);

            questionsAndAnswers[i][1] = Integer.toString(numberStart + numberDiff * skipIndex);
        }

        Engine.runGame(questionsAndAnswers, getRules());
    }

    private static int[] buildSeries(int numberStart, int numberDiff, int seriesLength) {
        int[] series = new int[seriesLength];

        for (int i = 0; i < seriesLength; i++) {
            series[i] = numberStart + numberDiff * i;
        }

        return series;
    }

    private static String seriesToString(int[] series, int skipIndex) {
        StringBuilder builder = new StringBuilder();

        for (int j = 0; j < series.length; j++) {
            if (j == skipIndex) {
                builder.append(".. ");
            } else {
                builder.append(series[j]);
                builder.append(" ");
            }
        }

        return builder.toString();
    }

    public static String getRules() {
        return RULES;
    }
}
