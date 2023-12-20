package oopsconcept.com;
import java.util.Random;
public class SnakeAndLadder {

        private static final int BOARD_SIZE = 100;
        private static final int NO_PLAY = 0;
        private static final int LADDER = 1;
        private static final int SNAKE = 2;

        public static void main(String[] args) {
            int playerPosition = 0;
            int diceCount = 0;

            while (playerPosition < BOARD_SIZE) {
                int diceRoll = rollDice();
                diceCount++;

                int option = getOption();
                switch (option) {
                    case NO_PLAY:
                        break;
                    case LADDER:
                        playerPosition += diceRoll;
                        break;
                    case SNAKE:
                        playerPosition -= diceRoll;
                        if (playerPosition < 0) {
                            playerPosition = 0;
                        }
                        break;
                }

                System.out.println("Player position after dice roll " + diceRoll + ": " + playerPosition);
            }

            System.out.println("Number of times dice rolled: " + diceCount);
        }

        private static int rollDice() {
            Random random = new Random();
            return random.nextInt(6) + 1;
        }

        private static int getOption() {
            Random random = new Random();
            return random.nextInt(3);
        }
    }

