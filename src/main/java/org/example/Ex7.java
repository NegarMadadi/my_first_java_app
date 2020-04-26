package org.example;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

        int hour = seconds / 3600 ;
        int minute = ( seconds % 3600 )/ 60;
        int remainedSecond = ( ( seconds % 3600 )/ 60 )% 60;

        System.out.println( hour + ":" + minute + ":" + remainedSecond); // why single quote is not accepted here ?
    }
}
