package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        boolean keepContinue = true;
        while (keepContinue) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter two numbers and press Enter between them:");
            double number1 = input.nextDouble();
            double number2 = input.nextDouble();

            Scanner operator = new Scanner(System.in);
            System.out.println("Enter operation symbol:");
            String operation = operator.nextLine();


            switch (operation) {
                case "+":
                    System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                    break;
                case "-":
                    System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                    break;
                case "*":
                    System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                    break;
                case "/":
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                    break;
                default:
                    System.out.println("invalid input " + operation);
            }

            Scanner yesOrNo = new Scanner(System.in);
            System.out.println("Do you want to continue ? Enter yes/no: ");
            switch (yesOrNo.nextLine()) {
                case "yes":
                    break;
                case "no":
                    keepContinue = false;
                    break;
                default :
                    System.out.println( "Invalid input " + yesOrNo);
            }
        }
    }
}









