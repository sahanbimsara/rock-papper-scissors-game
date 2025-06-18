import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Rock Papper Scissors game

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock","papper","scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain;

        //player choice

        System.out.print("Enter your move rock,papper,scissors : ");
        playerChoice = scanner.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") &&
                !playerChoice.equals("papper")&&
                !playerChoice.equals("scissorts")){
            System.out.println("Invalid choice");
        }

        //computer Choice

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice :"+computerChoice);

        if (playerChoice.equals(computerChoice)){
            System.out.println("It's a Tie");
        } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
            System.out.println("You Win");
        } else if (playerChoice.equals(computerChoice)) {

        } else {
            System.out.println("You lose!");
        }


        // 01. Daclare Variables
        // 02. Get Choice From User
        // 03. Get Random Choice For The Computer
        // 04. Check Win Conditions
        // 05. Ask To Play Again ?
        // 06. GoodBye message

    }
}