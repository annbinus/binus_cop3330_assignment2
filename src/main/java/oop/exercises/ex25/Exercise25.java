package oop.exercises.ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus
* Exercise 25 - Password Strength Indicator
Functions help you abstract away complex operations, but they also help you build reusable components.
Create a program that determines the complexity of a given password based on these rules:
A very weak password contains only numbers and is fewer than eight characters.
A weak password contains only letters and is fewer than eight characters.
A strong password contains letters and at least one number and is at least eight characters.
A very strong password contains letters, numbers, and special characters and is at least eight characters.
* Example Output
The password '12345' is a very weak password.
The password 'abcdef' is a weak password.
The password 'abc123xyz' is a strong password.
The password '1337h@xor!' is a very strong password.
* Constraints
Create a passwordValidator function that takes in the password as its argument and returns a value you can evaluate to determine the password strength. Do not have the function return a string—you may need to support multiple languages in the future.
Use a single output statement.
* Challenge
Create a GUI application or web application that displays graphical feedback as well as text feedback in real time. As someone enters a password, determine its strength and display the result
 */
import java.util.Scanner;

public class Exercise25 {

    private static final Scanner scan = new Scanner(System.in);

    private static String password;

    public static void readInput(){

        System.out.print("Enter your password: ");
        password = scan.nextLine();

    }

    public static String passwordTypes(int result){

        return switch (result) {
            case 1 -> "very weak";
            case 2 -> "weak";
            case 3 -> "strong";
            case 4 -> "very strong";
            default -> "weak";
        };

    }

    public static void printOutput(String type){
        System.out.println("The password '" + password + "' is a " + type + " password.");
    }
    public static void main(String[] args) {

        readInput();

        passwordChecker check = new passwordChecker();

        int result = check.passwordValidator(password);

        printOutput(passwordTypes(result));
    }
}
