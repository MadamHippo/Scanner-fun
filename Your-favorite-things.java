package com.perscholas.java_basics.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeAssignment11 {
    public static void main(String[] args) {

        /* Just realized...are you suppose to use Scanner with this or no...?

        Write some Java code that asks the user how many favorite things they have. Based on their answer,
        you should create a String array of the correct size. Then ask the user to enter the things and
        store them in the array you created. Finally, print out the contents of the array.

        Example

        How many favorite things do you have?
        7

        Enter your thing: phone
        Enter your thing: tv
        Enter your thing: xbox
        Enter your thing: wine
        Enter your thing: beer
        Enter your thing: sofa
        Enter your thing: book
        Your favorite  things are:
        phone tv xbox wine beer sofa book
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many favorite things do you have? ");
        int numFavThings = scanner.nextInt();
        // when you do scanner.nextInt...it doesn't read to the end of the input line...
        // because its only reading the integer, not the line of text. So it's only nextInt...
        // that means there's still the rest of the line in the scanner, so the next time you call the nextLine() from a String
        // ...
        // it returns the empty rest of the line
        scanner.nextLine();

        String[] favoriteArray = new String[numFavThings];

        for (int i=0; i<numFavThings; i++){
            System.out.println("Enter your favorite thing: ");
            favoriteArray[i] = scanner.nextLine();
        }
        System.out.println("Your favorite things are: " + Arrays.toString(favoriteArray));






    }
}
