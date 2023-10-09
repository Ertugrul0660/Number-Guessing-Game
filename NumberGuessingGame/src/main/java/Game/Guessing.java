package Game;

import java.util.Random;
import java.util.Scanner;

public class Guessing {

    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(100);
        /*System.out.println(randomNumber);*/

        System.out.println("A number is chosen between  1 and 100.");
        System.out.println("You have 5 tries to guess it...");

        Scanner input = new Scanner(System.in);
        int a = 0;

        do {
            System.out.println("Guess the number...");
            int guessNum = input.nextInt();
            if (guessNum==randomNumber){
                System.out.println("Congratulations, you guessed the number.");

            } else if (guessNum < randomNumber) {
                System.out.println("The number is greater than " + guessNum);

            }else {
                System.out.println("The number is less than " + guessNum);

            }

            a++;


        }while (a<5);

        System.out.println("The number was " + randomNumber);
    }
}
