/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */

import java.util.Scanner;

public class CountingNumberCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the input string?");

        String inputString = scanner.nextLine();

        Integer amountOfCharacters = inputString.length();

        System.out.println(inputString + " has " + amountOfCharacters + " characters.");

    }

}
