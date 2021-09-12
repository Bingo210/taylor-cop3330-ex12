/*
 * UCF COP3330 Fall 2021 Assignment 12 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {

    public static double FindInterest(double P, double r, int t) {
        double A = P * (1 + (r * t));

        return A;
    }

    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter the principal: " );
        double P = input.nextDouble();
        System.out.println( "Enter the rate of interest: " );
        double user_r = input.nextDouble();
        System.out.println( "Enter the number of years: " );
        int t = input.nextInt();

        double r = user_r / 100;
        double A = FindInterest(P, r, t);

        System.out.println("After " + t + " years at " + user_r +"%, " +
                "the investment will be worth $" + A);
    }
}
