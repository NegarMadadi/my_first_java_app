package org.example;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter the year you want to check if it is leap year or not: " );

         int year = input.nextInt();

        if( (year % 4 == 0) && (year % 100 != 0)){
            System.out.println( year +" is a leap year.");
        }
        else{
            System.out.println( year + " is not a leap year.");
        }




    }
}
