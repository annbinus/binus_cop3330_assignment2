package oop.exercises.ex32;

import java.util.Scanner;

public class GameLevels {

    private static Scanner scan = new Scanner(System.in);

    public static void level1(){
        int randomNum = (int)(Math.random()*9) + 1;

        int flag = 0;
        int count = 0;
        System.out.println("I have my number. What's your guess? ");
        while(flag==0){
            int num = scan.nextInt();
            if(randomNum == num){
                System.out.println("You got it in " + count + " guesses!");
                flag = 1;
            }
            else if(randomNum > num){
                System.out.println("Too low. Guess again: ");
            }
            else{
                System.out.println("Too high. Guess again: ");
            }
            count++;

        }
    }
    public static void level2(){
        int randomNum =(int)(Math.random()*99) + 1;

        int flag = 0;
        int count = 1;
        System.out.println("I have my number. What's your guess? ");
        while(flag==0){
            int num = scan.nextInt();
            if(randomNum == num){
                System.out.println("You got it in " + count + " guesses!");
                flag = 1;
            }
            else if(randomNum > num){
                System.out.print("Too low. Guess again: ");
            }
            else{
                System.out.print("Too high. Guess again: ");
            }
            count++;

        }
    }
    public static void level3(){
        int randomNum = (int)(Math.random()*999) + 1;

        int flag = 0;
        int count = 0;
        System.out.println("I have my number. What's your guess? ");
        while(flag==0){
            int num = scan.nextInt();
            if(randomNum == num){
                System.out.println("You got it in " + count + " guesses!");
                flag = 1;
            }
            else if(randomNum > num){
                System.out.println("Too low. Guess again: ");
            }
            else{
                System.out.println("Too high. Guess again: ");
            }
            count++;

        }
    }
}