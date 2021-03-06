package oop.exercises.ex28;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus

* Exercise 28 - Adding Numbers
In previous programs, you asked the user for repeated input by writing the input statements multiple times. But it’s more efficient to use loops to deal with repeated input.
Write a program that prompts the user for five numbers and computes the total of the numbers.

* Example Output
Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.

*  Constraints
The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.

*Challenges
Modify the program to prompt for how many numbers to add, instead of hard-coding the value. Be sure you convert the input to a number before doing the comparison.
Modify the program so that it only adds numbers and silently rejects non-numeric values. Count these invalid entries as attempts anyway. In other words, if the number of numbers to add is 5, your program should still prompt only five times.
 */


import java.util.Scanner;

public class Exercise28 {

    private static Scanner scan = new Scanner(System.in);
    private static double [] input = new double[5];

    public static double add(double a, double b, double c, double d, double e){
        return (a+b+c+d+e);
    }

    public static void readInput(){

        for(int i = 0; i<5; i++){
            System.out.print("Enter a number: ");
            input[i] = scan.nextDouble();
        }

    }

    public static void main(String[] args) {

        readInput();
        System.out.println("The total is " + add(input[0], input[1], input[2], input[3], input[4]) + ".");
    }
}