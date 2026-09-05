import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    static String playRound(String player, String computer) {
        if (player.equals(computer))
            return "Draw";
        else if ((player.equals("Rock") && computer.equals("Scissors")) ||
                 (player.equals("Paper") && computer.equals("Rock")) ||
                 (player.equals("Scissors") && computer.equals("Paper")))
            return "Player Wins";
        else
            return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int wins = 0, losses = 0, draws = 0;

        String[] moves = {"Rock", "Paper", "Scissors"};

        for (int i = 1; i <= 5; i++) {
            System.out.print("Round " + i + " - Enter Rock/Paper/Scissors: ");
            String player = sc.next();

            String computer = moves[r.nextInt(3)];
            String result = playRound(player, computer);

            System.out.println("Player: " + player +
                    " | Computer: " + computer +
                    " | " + result);

            if (result.equals("Player Wins"))
                wins++;
            else if (result.equals("Computer Wins"))
                losses++;
            else
                draws++;
        }

        double winPercent = wins * 100.0 / 5;

        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win %: " + winPercent);

        sc.close();
    }
}
