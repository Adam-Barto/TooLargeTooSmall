/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;

public class Main {

    static int AreYouRight(int val, int Number, int rounds) {
        if (val == Number){
            System.out.print("That's right!");
            System.out.print(" ");
            rounds = 0;
            return rounds;
        }else if (val > Number){
            System.out.print("Too Large!");
            System.out.print(" ");
            return rounds--;
        }else
            System.out.print("Too Small!");
            System.out.print(" ");
        return rounds--;
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
            int n = in.nextInt();
            rounds = AreYouRight(n, Number, rounds);
            if (rounds != 0) continue;
        }


        
    }
}
