package oop.exercises.ex24;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus
* Exercise 24 - Anagram Checker
Using functions to abstract the logic away from the rest of your code makes it easier to read and easier to maintain.
Create a program that compares two strings and determines if the two strings are anagrams. The program should prompt for both input strings and display the output as shown in the example that follows.
* Example Output
Enter two strings and I'll tell you if they are anagrams:
Enter the first string: note
Enter the second string: tone
"note" and "tone" are anagrams.
* Constraints
Implement the program using a function called isAnagram, which takes in two words as its arguments and returns true or false. Invoke this function from your main program.
Check that both words are the same length.
* Challenge
Complete this program without using built-in language features. Use selection or repetition logic instead and develop your own algorithm.
 */
import java.util.Scanner;

public class Exercise24 {

    private  static final Scanner scan = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void readInput() {

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter word 1: ");
        word1 = scan.nextLine();

        System.out.print("Enter word 2: ");
        word2 = scan.nextLine();
    }

    public static void printResult(boolean result) {
        if (result) {
            System.out.println(word1 + " and " + word2 + " are anagrams");
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams");
        }
    }

    public static void main(String[] args) {

        readInput();

        isAnagramDetector detector = new isAnagramDetector();
        boolean result = detector.isAnagram(word1, word2);

        printResult(result);
    }
}
