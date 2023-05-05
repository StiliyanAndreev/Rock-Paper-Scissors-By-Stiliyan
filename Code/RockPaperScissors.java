import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGitHub {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String[] options = {"rock", "paper", "scissors"};

        System.out.println("Welcome to Rock-Paper-Scissors!");

        while (true) {
            System.out.print("\nEnter your choice (rock, paper, or scissors): ");
            String userChoice = input.nextLine().toLowerCase();


            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            String computerChoice = options[rand.nextInt(options.length)];

            System.out.println("You chose " + userChoice + ".");
            System.out.println("The computer chose " + computerChoice + ".");

            //pobeditel
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a draw!");
            } else if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
                    userChoice.equals("paper") && computerChoice.equals("rock") ||
                    userChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("The computer wins!");
            }

            //pitame dali iskame da igraem otnovo
            System.out.print("\nDo you want to play again? (yes/no): ");
            String playAgain = input.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }
    }
}