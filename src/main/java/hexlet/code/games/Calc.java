package hexlet.code.games;

import java.util.Random;
public class Calc {
    private static String[] answers;
    public static String[] getQuestions() {
        Random random = new Random();

        final int upperNumberBound = 20;

        final int upperOperatorBound = 3;

        final int numberOfQuestions = 3;

        String[] questions = new String[numberOfQuestions];

        answers = new String[numberOfQuestions];

        for (int i = 0; i < numberOfQuestions; i++) {

            int numberLeft = random.nextInt(upperNumberBound);
            int numberRight = random.nextInt(upperNumberBound);

            int operatorIndex = random.nextInt(upperOperatorBound);

            switch (operatorIndex) {
                case 0 -> {
                    answers[i] = Integer.toString(numberLeft + numberRight);
                    questions[i] = Integer.toString(numberLeft) + " + " + Integer.toString(numberRight);
                }
                case 1 -> {
                    answers[i] = Integer.toString(numberLeft - numberRight);
                    questions[i] = Integer.toString(numberLeft) + " - " + Integer.toString(numberRight);
                }
                case 2 -> {
                    answers[i] = Integer.toString(numberLeft * numberRight);
                    questions[i] = Integer.toString(numberLeft) + " * " + Integer.toString(numberRight);
                }
                default -> {
                }
            }
        }

        return questions;
    }

    public static String[] getAnswers() {
        return answers;
    }

    public static String getRules() {
        return "What is the result of the expression?";
    }
}
