/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

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
            return --rounds;
    }


    public static void main(String[] args){
        System.out.println("Welcome to the Guessing Game.");
        System.out.println("Let me think of a number.");
        Scanner in = new Scanner(System.in);
        int min = 0;
        int max = 10;
        int rounds = 4;
        int Number = (int)Math.floor(Math.random() *(max - min +1) + min);
        while (rounds > 0) {
            System.out.print("Enter a Number: ");
            try {
                int n = in.nextInt();
                rounds = AreYouRight(n, Number, rounds);
            }catch (InputMismatchException error){
                System.out.println("That is not an Int Value!");
                System.out.println("That costs you a round.");
                rounds = --rounds;
                in.nextLine(); // Prevents infinite loops by clearing out the in input.
            }

            //if (rounds != 0) continue;
        }
        if (rounds == 0 ){
            System.out.println("You lose, the Number was "+ Number);
        }else
        {
            System.out.println("You Win!, the Number was "+ Number);
        }



        
    }
}
