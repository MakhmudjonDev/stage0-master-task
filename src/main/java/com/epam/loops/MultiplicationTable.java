package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {

        if (numberTableToPrint <= 0) {
            System.out.println("Please enter a positive integer.");

        } else{
            System.out.println("Multiplication table for " + numberTableToPrint + ":");
            for (int i = 1; i <= 10; i++) {
                int result = numberTableToPrint * i;
                System.out.println(numberTableToPrint + " x " + i + " = " + result);
            }
        }


    }

}
