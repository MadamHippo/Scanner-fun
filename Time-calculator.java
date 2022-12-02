package com.perscholas.java_basics.BookPracticeProblems.DecisionStructures;

import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        // Time Calculator
        Scanner scanTime = new Scanner(System.in);
        System.out.println("Enter the number of seconds: ");
        // here's a number of seconds user will input...
        int seconds = scanTime.nextInt();

        // calculate seconds leftover with modulo (%)
        int second = seconds % 60;
        // calculate minute using second divided by 60
        int hour = seconds / 60;
        // calculate hour by getting the minute you just calculated and modulo(%) by 60 since there's 60 minutes in 1 hour.
        int minute = hour % 60;

        hour = hour / 60;

        System.out.println(hour + ":" + minute + ":" + second);
        // enhancements...print format string so it's more like a double digit time clock




    }
}
