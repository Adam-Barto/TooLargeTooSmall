/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static int AreYouRight(String n, int Number, int rounds) {
        try {
            int val = Integer.valueOf(n);
            if (val == Number) {
                System.out.println("That's right! ");
                rounds = 0;
                return rounds;
            } else if (val > Number) {
                System.out.println("Too Large! ");
            } else{
                System.out.println("Too Small! ");
            }
            return --rounds;
        }catch(NumberFormatException error){
            System.out.println("This is not an Int value! ");
            return --rounds;
        }
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
            //int n = in.nextInt();
            String n = in.next();
            rounds = AreYouRight(n, Number, rounds);
            //if (rounds != 0) continue;
        }


        
    }
}
