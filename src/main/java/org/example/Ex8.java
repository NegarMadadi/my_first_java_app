package org.example;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rand = (int) ((Math.random() * 500 + 1) );


        System.out.print(" Guess which number generates computer between 1 and 500: ");
        int guessNumber = input.nextInt();
        System.out.println("Computer random number is " + rand);

        if (guessNumber == rand)
                    System.out.println("you are are a genius " + guessNumber + "is exactly the same number as random number.");

            else if (guessNumber > rand)
                System.out.println("“Your guess was too big.”");


            else if (guessNumber < rand)
                    System.out.println("“Your guess was too small.”");
        }
    }



