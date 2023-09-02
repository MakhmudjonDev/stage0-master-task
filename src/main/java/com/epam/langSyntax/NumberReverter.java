package com.epam.langSyntax;

public class NumberReverter {

//    public static void main(String[] args) {
//
//        revert(12233423);
//    }

    // static keyword deleted
    public void revert(int number) {

        String revertString = "";
        String numberStr = String.valueOf(number);
        for (int i = numberStr.length()-1; i >= 0; i--) {
            revertString += numberStr.charAt(i);
        }

        number = Integer.parseInt(revertString);
        System.out.println(number);

    }

}
