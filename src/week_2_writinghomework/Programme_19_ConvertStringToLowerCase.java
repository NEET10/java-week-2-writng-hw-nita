package week_2_writinghomework;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class Programme_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String upperCase = scanner.nextLine();
        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(upperCase);
        //Closing the scanner
        scanner.close();


    }

    //Convert string to the lower case
    public void convertStringToLowerCase(String str) {
        String s1 = str.toLowerCase();
        System.out.println("The Lowercase of the string is = " + s1);
    }
}
