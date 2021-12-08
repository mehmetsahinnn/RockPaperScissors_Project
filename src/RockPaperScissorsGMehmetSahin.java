import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorsGMehmetSahin {
    public static void main(String[]args) {

        System.out.println("Welcome to the Rock-Paper-Scissors Game !");
        System.out.println("-----------------------------------------");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int computer_score = 0;
        int score = 0;
        int rock = 1;
        int scissors = 2;
        int paper = 3;

        while (score != 5 && computer_score != 5){
            System.out.println(
                    "Press 1 for Rock\n" +
                            "Press 2 for Scissors\n" +
                            "Press 3 for Paper");
            System.out.println("-----------------------------------------");
            int select = scan.nextInt();
            int randomNumber = 1 + rand.nextInt(3);

            System.out.println("*****************************************");
            System.out.println("Your answer is = " + select + " Computer's answer is = " + randomNumber);


            if (select == randomNumber) {
                System.out.println("Deuce");
                System.out.println("*****************************************");
                System.out.println("Your score is =\t" + score + " Computers score is = " + computer_score);
                System.out.println("*****************************************");
            } else if (select == 1 && randomNumber == scissors || select == 2 && randomNumber == paper
                    || select == 3 && randomNumber == rock) {
                System.out.println("You Won!");
                score++;
                System.out.println("*****************************************");
                System.out.println("Your score is =\t" + score + " Computers score is = " + computer_score);
                System.out.println("*****************************************");
            } else if (select == 2 && randomNumber == rock || select == 1 && randomNumber== paper
                    || select == 3 && randomNumber == scissors){
                System.out.println("You Lose!");
                computer_score++;
                System.out.println("*****************************************");
                System.out.println("Your score is =\t" + score + " Computers score is = " + computer_score);
                System.out.println("*****************************************");
            }
            else if (select != 1 && select != 2 && select != 3){
                System.out.println("Please enter valid number ! ");
            }
        }
    }
}