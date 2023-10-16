package lab08.Q5;

public class Tester {
    public static void main(String[] args) {
        Game player1 = new Game("JoJo");
        Game player2 = new Game("DIO");

        while (true) {
            if (playerRollsDice(player1)) break;
            if (playerRollsDice(player2)) break;
        }
    }

    // Return true if the player wins the game.
    public static boolean playerRollsDice(Game player) {
        player.rollDice();
        System.out.println(player.getName() + " Dice: " + player.getDice());
        System.out.println(player.getName() + " Total: " + player.getScore());
        if (player.getScore() >= 100) {
            System.out.println(player.getName() + " wins!");
            return true;
        }
        System.out.println();
        return false;
    }
}
