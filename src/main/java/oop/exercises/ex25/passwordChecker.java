package oop.exercises.ex25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordChecker {


    public static int passwordValidator(String password) {

        int numCount = 0, letterCount = 0, charCount = 0, strength = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                numCount++;
            }

            if ((password.charAt(i) >= 65 && password.charAt(i) <= 90) || (password.charAt(i) >= 97 && password.charAt(i) <= 122)) {
                letterCount++;
            }

            if ((password.charAt(i) >= 33 && password.charAt(i) <= 47) || (password.charAt(i) >= 58 && password.charAt(i) <= 64) || (password.charAt(i) >= 91 && password.charAt(i) <= 96)) {
                charCount++;
            }
        }

        if (numCount == password.length() && password.length() > 0) {
            strength = 1;
        }

        if (letterCount == password.length() && password.length() > 0) {
            strength = 2;
        }

        if (password.length() >= 8 && numCount > 0 && letterCount > 0) {
            strength = 3;
        }

        if (password.length() >= 8 && numCount > 0 && letterCount > 0 && charCount > 0) {
            strength = 4;
        }

        return strength;
    }
}