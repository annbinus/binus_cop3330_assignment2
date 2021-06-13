package oop.exercises.ex37;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus

* Exercise 37 - Password Generator
Coming up with a password that meets specific requirements is something your computer can do. And it will give you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password. Prompt the user for the minimum length, the number of special characters, and the number of numbers. Then generate a password for the user using those inputs.

* Example Output
What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#

* Constraints
Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.

* Challenges
Randomly convert vowels to numbers, such as 3 for E and 4 for A.
Have the program present a few options rather than a single result.
Place the password on the user’s clipboard when generated.
 */

import java.util.Scanner;

public class Exercise37 {

    private static Scanner scan = new Scanner(System.in);

    private static int minLength;
    private static int sc;
    private static int numbers;

    public static void passwordRequirements(){
        Scanner input = new Scanner(System.in);

        // get inputs from users
        System.out.print("What's the minimum length? ");
        minLength = input.nextInt();

        System.out.print("How many special characters? ");
        sc = input.nextInt();

        System.out.print("How many numbers? ");
        numbers = input.nextInt();
    }

    public static void main(String[] args) {
       passwordRequirements();

       passwordGenerator create = new passwordGenerator();
       System.out.print(create.createPassword(minLength, sc, numbers));
    }
}
