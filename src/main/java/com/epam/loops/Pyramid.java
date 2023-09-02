package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        if (cathetusLength <= 0) {
            System.out.println("Please enter a positive integer for cathetus length.");

        }else {

            for (int i = 1; i <= cathetusLength; i++) {
                // Print spaces before the numbers
                for (int j = 1; j <= cathetusLength - i; j++) {
                    System.out.print(" ");
                }

                // Print decreasing numbers
                for (int k = i; k >= 1; k--) {
                    System.out.print(k);
                }

                // Print increasing numbers (excluding 1)
                for (int k = 2; k <= i; k++) {
                    System.out.print(k);
                }

                // Move to the next line for the next row
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
