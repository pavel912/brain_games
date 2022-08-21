package hexlet.code.games;

import java.util.Random;
public final class EvenCheckGame implements Game {

    private int questNumber;

    public int getQuestNumber() {
        return questNumber;
    }

    @Override
    public String getQuestion() {
        Random random = new Random();

        final int upperRandomBound = 100;
        questNumber = random.nextInt(upperRandomBound);

        return Integer.toString(questNumber);
    }

    @Override
    public String getAnswer() {
        return questNumber % 2 == 0 ? "yes" : "no";
    }

    @Override
    public String getRules() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }
}
