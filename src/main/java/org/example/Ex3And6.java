package org.example;

import java.util.Scanner;

public class Ex3And6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers and press Enter key in between: ");

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int sum = number1 + number2;
        System.out.println( number1 + " + " + number2 + " = " + sum + ".");

        int multiplication = number1 * number2;
        System.out.println( number1 + " * " + number2 + " = " + multiplication + ".");

        int subtraction = number1 - number2;
        System.out.println( number1 + " - " + number2 + " = " + subtraction + ".");

        int division = number1 / number2;
        System.out.println( number1 + " / " + number2 + " = " + division + ".");

    }
}
