package hexlet.code.games;

import java.util.Random;
public final class CalculatorGame implements Game {
    private int answer;

    @Override
    public String getQuestion() {
        Random random = new Random();

        String question = null;

        final int upperNumberBound = 20;

        final int upperOperatorBound = 3;

        int numberLeft = random.nextInt(upperNumberBound);
        int numberRight = random.nextInt(upperNumberBound);

        int operatorIndex = random.nextInt(upperOperatorBound);

        switch (operatorIndex) {
            case 0 -> {
                answer = numberLeft + numberRight;
                question =  Integer.toString(numberLeft) + " + " + Integer.toString(numberRight);
            }
            case 1 -> {
                answer = numberLeft - numberRight;
                question = Integer.toString(numberLeft) + " - " + Integer.toString(numberRight);
            }
            case 2 -> {
                answer = numberLeft * numberRight;
                question =  Integer.toString(numberLeft) + " * " + Integer.toString(numberRight);
            }
            default -> { }
        }

        return question;
    }

    @Override
    public String getAnswer() {
        return Integer.toString(answer);
    }

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }
}
