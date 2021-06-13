package oop.exercises.ex31;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus
* Exercise 31 - Karvonen Heart Rate
When you loop, you can control how much you increment the counter; you don’t always have to increment by one.
When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself. The Karvonen heart rate formula is one method you can use to determine your rate. Create a program that prompts for your age and your resting heart rate. Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%. Generate a table with the results as shown in the example output. The formula is
TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
* Example Output
Resting Pulse: 65        Age: 22
Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm
* Constraints
Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
Display the results in a tabular format.
* Challenge
Implement this as a GUI program that allows the user to use a slider control for the intensity, and update the interface in real time as the slider moves.
 */
import java.util.Scanner;

public class Exercise31 {
    private static String pulse;
    private static String  age;

    private static Scanner scan = new Scanner(System.in);

    public static void readInput(){
        int flag = 0;

        while(flag==0) {
            System.out.print("What is your resting pulse? ");
            pulse = scan.nextLine();

            if (!(pulse.equals("") || pulse.equals("0") || pulse.matches("[^0-9]+"))) {
                flag = 1;
            } else {
                System.out.println("Sorry. That's not a valid input.");
            }
        }
        flag = 0;
        while (flag == 0) {
            System.out.print("Wha is your age? ");
            age = scan.nextLine();

            if (!(age.equals("") || age.equals("0") || age.matches("[^0-9]+"))) {
                flag = 1;
            } else {
                System.out.println("Sorry. That's not a valid input.");
            }

        }
    }

    public static void printOutput(){
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");

        for(int i = 55; i<=95; i+=5){
            double target = (((220 - Double.parseDouble(age)) - Double.parseDouble(pulse)) * i/100) + Double.parseDouble(pulse);
            System.out.println(i + "%          | " + Math.round(target) + " bpm");
        }

    }
    public static void main(String[] args) {
        readInput();
        printOutput();
    }
}