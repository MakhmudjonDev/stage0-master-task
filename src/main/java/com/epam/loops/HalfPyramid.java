package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength <= 0) {
            System.out.println("Please enter a positive integer for cathetus length.");

        } else {
            for (int i = 1; i <= cathetusLength; i++) {
                // Print spaces before asterisks
                for (int j = cathetusLength - i; j > 0; j--) {
                    System.out.print(" ");
                }

                // Print asterisks in each row
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }

                // Move to the next line for the next row
                System.out.println();
            }

        }



    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
