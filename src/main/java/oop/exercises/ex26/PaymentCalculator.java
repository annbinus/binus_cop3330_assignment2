package oop.exercises.ex26;

public class PaymentCalculator {

    public static int calculateMonthsUntilPaidOff(double b, double i, double p){

        int n = 0;
        n = (int) Math.ceil(-(1.0/30.0) * Math.log(1 + b/p * (1 - Math.pow((1 + i), 30))) / Math.log(1+i));

        return n;
    }
}
