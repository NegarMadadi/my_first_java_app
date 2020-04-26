package org.example;

import java.util.Scanner;

//Make an integer called score and assign a value to it. Create an if –
//else statement that should print out ”you passed” if the score is
//above or equals to 65. If score is below 65 it should print ”you did not
//pass”.

public class PracticeW1P5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print( " Enter your score: " );
        int score = input.nextInt();

        if (score >= 65)
            System.out.println( "You passed.");
        else
            System.out.println( "You did not pass." );
    }
}
