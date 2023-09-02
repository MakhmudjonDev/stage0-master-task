package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        if (power < 0) {
            System.out.println("Exponent should be a non-negative integer.");

        } else {
            int result = 1;
            for (int i = 0; i < power; i++) {
                result *= numberToPrint;
            }

//            System.out.println(numberToPrint + " raised to the power of " + power + " is " + result);
            System.out.println(result);
        }


    }

    public static void main(String[] args) {

        new Power().printPower(10, 3);

    }

}
