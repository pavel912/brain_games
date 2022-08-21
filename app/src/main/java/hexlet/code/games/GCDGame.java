package hexlet.code.games;

import java.util.Random;
public final class GCDGame implements Game {
    private int numberLeft;
    private int numberRight;

    @Override
    public String getQuestion() {
        Random random = new Random();

        final int upperNumberBound = 99;

        numberLeft = 1 + random.nextInt(upperNumberBound);
        numberRight = 1 + random.nextInt(upperNumberBound);

        return Integer.toString(numberLeft) + " " + Integer.toString(numberRight);
    }

    @Override
    public String getAnswer() {
        //Euclidean algorithm
        int remainder = 1;
        // "a" is always greater then "b"
        int a = Math.max(numberLeft, numberRight);
        int b = Math.min(numberLeft, numberRight);

        while (remainder > 0) {
            remainder = a % b;
            a = b;
            b = remainder;
        }
        // remainder is 0 when a % b == 0 and since "a" was rewritten as "b", the gcd is "a"
        return Integer.toString(a);
    }

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }
}
