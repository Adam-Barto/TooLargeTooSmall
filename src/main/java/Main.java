/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static int howManyGuesses = 0;
    final static int min = 0;
    final static int max = 10;
    private static int rounds = 4;
    private static int[] guess = new int[rounds];

    static int AreYouRight(int val, int Number, int rounds) {
            if (val == Number) {
                System.out.println("That's right!");
                rounds = -1;
                return rounds;
            } else if (val > Number) {
                System.out.println("Too Large! ");
            } else{
                System.out.println("Too Small! ");
            }
            howManyGuesses++;
            return --rounds;
    }
    static boolean DidYouGuessThat(int val){
        for (int i = 0; i < guess.length; i++) {
            if (val == guess[i]) {
                System.out.println("You already guessed " + val);
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        System.out.println("Welcome to the Guessing Game.");
        System.out.println("Let me think of a number.");
        Scanner in = new Scanner(System.in);

        int Number = (int)Math.floor(Math.random() *(max - min +1) + min);
        while (rounds > 0) {
            System.out.print("Enter a Number: ");
            try {
                int n = in.nextInt();
                if (DidYouGuessThat(n)){
                    guess[rounds-1] = n;
                    rounds = AreYouRight(n, Number, rounds);
                }
            }catch (InputMismatchException error){
                System.out.println("That is not an Int Value!");
                System.out.println("That costs you a round.");
                --rounds;
                in.nextLine(); // Prevents infinite loops by doing a next line.
            }
        }
        if (rounds == 0 ){
            System.out.println("You lose, the Number was "+ Number);
        }else
        {
            System.out.println("You Win!, the Number was "+ Number + "\n Guesses till success: " + (howManyGuesses+1));
        }



        
    }
}
