package oop.exercises.ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff_returns_70() {
        PaymentCalculator check = new PaymentCalculator();

        int expected = 70;
        int actual = check.calculateMonthsUntilPaidOff(5000, 12, 100);

        assertEquals(expected,actual);
    }

    @Test
    void calculateMonthsUntilPaidOff_returns_21() {
        PaymentCalculator check = new PaymentCalculator();

        int expected = 21;
        int actual = check.calculateMonthsUntilPaidOff(1000, 5, 50);

        assertEquals(expected,actual);
    }

    @Test
    void calculateMonthsUntilPaidOff_returns_15() {
        PaymentCalculator check = new PaymentCalculator();

        int expected = 15;
        int actual = check.calculateMonthsUntilPaidOff(10000, 5, 700);

        assertEquals(expected,actual);
    }
}