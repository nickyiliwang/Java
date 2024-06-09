
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String[] rps = { "r", "p", "s" };
            List<String> moveSet = Arrays.asList(rps);
            String compMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("Please enter your (r,p,s)");
                playerMove = scanner.nextLine();
                if (moveSet.contains(playerMove)) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move.");

            }

            System.out.println("Computer played:" + compMove);
            if (playerMove.equals(compMove)) {
                System.out.println("Its a tie !");
            } else if (playerMove.equals("r")) {
                if (compMove.equals("p")) {
                    System.out.println("You Lose");
                } else {
                    System.out.println("You Win !");
                }
            } else if (playerMove.equals("p")) {
                if (compMove.equals("s")) {
                    System.out.println("You Lose");
                } else {
                    System.out.println("You Win!");
                }
            } else {
                if (compMove.equals("r")) {
                    System.out.println("You Lose");
                } else {
                    System.out.println("You Win!");
                }
            }

            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")) {
                System.out.println("Goodbye!");
                break;
            }
        }

    }
}
