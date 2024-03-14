package main;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        // FIXME Declare variables for int, double, char, and string
        int userInt;
        double userDouble;
        char userChar;
        String userString;

        // FIXME Prompt entry and initialize variables
        System.out.println("Enter integer:");
        userInt    = scnr.nextInt();
        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();
        System.out.println("Enter character:");
        userChar   = scnr.next().charAt(0);
        System.out.println("Enter string");
        userString = scnr.next();


        // FIXME (1): Finish reading other items into variables, then output the four values on a single line separated by a space
        System.out.println(userInt + userDouble + userChar + userString);
        // FIXME (2): Output the four values in reverse
        System.out.println(userString + userChar + userDouble + userInt);
        // FIXME (3): Cast double to integer and print

        // convert into int
        int value = (int)userDouble;

        // print the int value
        System.out.println(userDouble + " cast to an integer is " + value);

    }
}