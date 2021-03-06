package oop.exercises.ex35;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ann Binus
* Exercise 35 - Picking a Winner
Arrays don’t have to be hard-coded. You can take user input and store it in an array and then work with it.
Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user leaves the entry blank. Then randomly select a winner.

* Example Output
Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.

* Constraints
Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time. You may need to find another data structure, like an ArrayList.

* Challenges
When a winner is chosen, remove the winner from the list of contestants and allow more winners to be chosen.
Make a GUI program that shows the array of names being shuffled on the screen before a winner is chosen.
Create a separate contest registration application. Use this program to pull in all registered users and pick a winner.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise35 {

    private static ArrayList<String> list = new ArrayList<String>();
    private static int count;

    private static Scanner scan = new Scanner(System.in);

    public static void  arrayInitializer(){

        System.out.print("Enter a name: ");
        String name = scan.nextLine();

        count = -1;

        while(!name.equals("")){
            count++;
            list.add(count, name);

            System.out.print("Enter a name: ");
            name = scan.nextLine();
        }
    }
    public static int randomNumGenerator(){

        return (int)(Math.random()*count);
    }

    public static String getName(int num){
        return list.get(num);
    }

    public static void main(String[] args) {

        arrayInitializer();

        if(count==-1){
            System.out.print("There's no winner!");
        }
        else{
            System.out.print("The winner is... " + getName(randomNumGenerator()));
        }
    }
}