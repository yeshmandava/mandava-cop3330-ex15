package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        final String PassCode = "abc$123";

        System.out.print("What is the password: ");
        String Password = input.nextLine();

        if(!Password.equals(PassCode)) {
            System.out.print("I don't know you");
        }
          else{
            System.out.print("Welcome!");
        }
    }
}
