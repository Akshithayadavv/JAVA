import java.util.Scanner;
import  java.util.Random;

public class Proj3_GuessTheNumber {
    public static void main(String[] args)
    {
        int ourGuess;
        int computerNumber;
        int guessCount=0;
        Random random= new Random();
        boolean guessNumber=false;

        computerNumber=random.nextInt(100)+1;

        Scanner Keyboard=new Scanner(System.in);
        while(!guessNumber)
        {System.out.println("Enter your integer guess ");
            ourGuess=Keyboard.nextInt();
            guessCount++;
            if(ourGuess>1 && ourGuess<100) {
                if (ourGuess == computerNumber) {
                    System.out.println("Congrats");
                    guessNumber=true;
                } else if (ourGuess > computerNumber) {
                    System.out.println("Your guess is higher");

                } else {
                    System.out.println("Your guess is lower");

                }
            }
            else
                System.out.println("Invalid number");

        }

    }
}
