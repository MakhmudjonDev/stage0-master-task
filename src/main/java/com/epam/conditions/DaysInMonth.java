package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");

        } else{
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            // Array to store the number of days in each month
            int[] daysInMonth = {
                    31, // January
                    isLeapYear ? 29 : 28, // February (28 or 29 days)
                    31, // March
                    30, // April
                    31, // May
                    30, // June
                    31, // July
                    31, // August
                    30, // September
                    31, // October
                    30, // November
                    31  // December
            };

            int days = daysInMonth[month - 1]; // Subtract 1 because array is 0-based

            System.out.println(days);
        }


    }

}
