package oop.exercises.ex31;

import java.util.Scanner;

public class readValues {

    private static Scanner scan = new Scanner(System.in);

    public static String checkValue(String value) {
        if (!(value.equals("") || value.equals("0") || value.matches("[^0-9]+"))) {
            return "1";
        } else {
            return "Sorry. That's not a valid input.";
        }
    }


    public static double Pulse() {
        int flag = 0;

        String pulse = "";

        while (flag == 0) {
            System.out.print("What is your resting pulse? ");
            pulse = scan.nextLine();

            if (checkValue(pulse).equals("1")) {
                flag = 1;
            } else {
                System.out.println(checkValue(pulse));
            }
        }
        return Double.parseDouble(pulse);
    }

    public static double Age() {
        int flag = 0;
        String age = "";

        while (flag == 0) {
            System.out.print("What is your age? ");
            age = scan.nextLine();

            if (checkValue(age).equals("1")) {
                flag = 1;
            } else {
                System.out.println(checkValue(age));
            }
        }
        return Double.parseDouble(age);
    }
}
