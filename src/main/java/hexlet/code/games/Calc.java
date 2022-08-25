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

            switch (operatorIndex) {
                case 0 -> {
                    questionsAndAnswers[i][0] = Integer.toString(numberLeft) + " + " + Integer.toString(numberRight);
                    questionsAndAnswers[i][1] = Integer.toString(numberLeft + numberRight);
                }
                case 1 -> {
                    questionsAndAnswers[i][0] = Integer.toString(numberLeft) + " - " + Integer.toString(numberRight);
                    questionsAndAnswers[i][1] = Integer.toString(numberLeft - numberRight);
                }
                case 2 -> {
                    questionsAndAnswers[i][0] = Integer.toString(numberLeft) + " * " + Integer.toString(numberRight);
                    questionsAndAnswers[i][1] = Integer.toString(numberLeft * numberRight);
                }
                default -> {
                    throw new RuntimeException("Result for operation with index "
                            + operatorIndex + " is not defined.");
                }
            }
        }

        Engine.runGame(questionsAndAnswers, getRules());
    }

    public static String getRules() {
        return RULES;
    }
}
