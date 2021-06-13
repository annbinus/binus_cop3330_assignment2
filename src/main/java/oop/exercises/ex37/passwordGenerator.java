package oop.exercises.ex37;

import java.util.Scanner;

public class passwordGenerator {

    public static String createPassword(int minLength, int specialChar, int numbers){

        String password = "";
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] nums = {'0','1','2','3','4','5','6','7','8','9'};
        char[] specChar = {'!','@','#','$','%','?','&','*'};

        int length = (specialChar+numbers)*2;
        if(length<minLength) {
            length = minLength;
        }
            int numLetters = length-numbers-specialChar;
            int nofNum = numbers;
            int nofSpec = specialChar;

            for(int i=0; i<length; i++){
                int choose = (int) (Math.random()*3);
                switch(choose){
                    case 0:
                        if(numLetters != 0){
                            password += letters[(int)(Math.random()*24)];
                        }
                        else{
                            i++;
                        }
                        break;
                    case 1:
                        if(nofNum != 0){
                            password += nums[(int)(Math.random()*10)];

                        }
                        else{
                            i++;
                        }
                        break;
                    case 2:
                        if(nofSpec != 0){
                            password += specChar[(int)(Math.random()*8)];

                        }
                        else{
                            i++;
                        }
                        break;
                }

            }
            return password;
        }
    }
    