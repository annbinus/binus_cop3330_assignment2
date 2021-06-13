package oop.exercises.ex24;

import java.util.Arrays;

public class isAnagramDetector {

    public static boolean isAnagram(String word1, String word2){

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        boolean result = false;

        if(word1.length() == word2.length()){
            char [] a1 = word1.toCharArray();
            char [] a2 = word2.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(a2);

            result = Arrays.equals(a1, a2);
        }
        return result;
    }
}