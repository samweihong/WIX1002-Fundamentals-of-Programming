package lab08.Q5;

import java.util.Random;

public class Game {
    private Random random = new Random();

    private String name;
    private int dice;
    private int score;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getDice() {
        return dice;
    }

    public int getScore() {
        return score;
    }

    public void rollDice() {
        score += dice = random.nextInt(6) + 1;
    }
}
