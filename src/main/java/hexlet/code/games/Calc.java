package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;
public class Calc {
    private static final String RULES = "What is the result of the expression?";

    public static void startGame() {
        Random random = new Random();

        final int upperNumberBound = 20;

        final int upperOperatorBound = 3;

        final int numberOfQuestions = Engine.COUNT_ROUNDS;

        String[][] questionsAndAnswers = new String[numberOfQuestions][2];

        for (int i = 0; i < numberOfQuestions; i++) {

            int numberLeft = random.nextInt(upperNumberBound);
            int numberRight = random.nextInt(upperNumberBound);

            int operatorIndex = random.nextInt(upperOperatorBound);

            questionsAndAnswers[i][0] = getExpression(operatorIndex, numberLeft, numberRight);
            questionsAndAnswers[i][1] = Integer.toString(calculateResult(operatorIndex, numberLeft, numberRight));
        }

        Engine.runGame(questionsAndAnswers, RULES);
    }

    private static int calculateResult(int operatorIndex, int numberLeft, int numberRight) {
        switch (operatorIndex) {
            case 0 -> {
                return numberLeft + numberRight;
            }
            case 1 -> {
                return numberLeft - numberRight;
            }
            case 2 -> {
                return numberLeft * numberRight;
            }
            default -> {
                throw new RuntimeException("Result for operation with index "
                        + operatorIndex + " is not defined.");
            }
        }
    }

    private static String getExpression(int operatorIndex, int numberLeft, int numberRight) {
        switch (operatorIndex) {
            case 0 -> {
                return Integer.toString(numberLeft) + " + " + Integer.toString(numberRight);
            }
            case 1 -> {
                return Integer.toString(numberLeft) + " - " + Integer.toString(numberRight);
            }
            case 2 -> {
                return Integer.toString(numberLeft) + " * " + Integer.toString(numberRight);
            }
            default -> {
                throw new RuntimeException("Result for operation with index "
                        + operatorIndex + " is not defined.");
            }
        }
    }
}
