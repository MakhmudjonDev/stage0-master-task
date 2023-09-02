package com.epam.langSyntax;

public class DigitsSumCalculator {

//    public static void main(String[] args) {
//        calculateSum(32194);
//    }

    public void calculateSum(int number) {

        int sum = 0;

        while(number%10!=0){
            sum += number % 10;
            number /= 10;
        }

        number = sum;
        System.out.println(sum);
    }



}
