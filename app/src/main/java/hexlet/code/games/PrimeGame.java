package hexlet.code.games;

import java.util.Random;
public final class PrimeGame implements Game {
    private int number;

    @Override
    public String getQuestion() {
        Random random = new Random();

        final int upperNumberBound = 100;

        number = 1 + random.nextInt(upperNumberBound);

        return Integer.toString(number);
    }

    @Override
    public String getAnswer() {
        // not an optimal but quick solution
        final int three = 3; // checkstyle doesn't like magic numbers
        if (number == 1 || number == 2 || number == three) {
            return "yes";
        }
        for (int divisor = 2; divisor <= Math.ceil(Math.sqrt(number)); divisor++) {
            if (number % divisor == 0) {
                return "no";
            }
        }

        return "yes";
    }

    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
