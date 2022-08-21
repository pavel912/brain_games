package hexlet.code.games;

import java.util.Random;
public final class ProgressionGame implements Game {
    private int answer;

    @Override
    public String getQuestion() {
        Random random = new Random();

        final int seriesLength = 10;

        final int upperBoundStart = 100;
        final int upperBoundDiff = 19;

        int numberStart = random.nextInt(upperBoundStart);
        int numberDiff = 1 + random.nextInt(upperBoundDiff);
        int skipIndex = random.nextInt(seriesLength);

        answer = numberStart + numberDiff * skipIndex;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < seriesLength; i++) {
            if (i == skipIndex) {
                builder.append(".. ");
            } else {
                builder.append(numberStart + numberDiff * i);
                builder.append(" ");
            }
        }

        return builder.toString();
    }

    @Override
    public String getAnswer() {
        return Integer.toString(answer);
    }

    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }
}
