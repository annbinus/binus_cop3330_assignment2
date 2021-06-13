package oop.exercises.ex32;

import java.util.Scanner;

public class GameLevels {

    private static Scanner scan = new Scanner(System.in);

    public static String checkEntry(int random, int num){
        if(random == num){
            return "1";
        }
        else if(random > num){
            return "Too low. Guess again: ";
        }
        else{
            return "Too high. Guess again: ";
        }
    }

    public static void level(int min, int max){
        int randomNum = (int)(Math.random()*(max-min)) + min;

        int flag = 0;
        int count = 0;

        System.out.println("I have my number. What's your guess? ");

        while(flag==0){

            int num = scan.nextInt();

            if(checkEntry(randomNum, num).equals("1")){
                System.out.println("You got it in " + count + " guesses!");
                flag = 1;
            }
            else{
                System.out.print(checkEntry(randomNum, num));
            }
            count++;

        }
    }

}