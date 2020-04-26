package org.example;

import  java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print( " Type your name: " );
        String username = input.nextLine();

        System.out.println( "Hello " + username + '.');

    }
}
