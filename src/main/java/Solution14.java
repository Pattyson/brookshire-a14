/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */


import java.util.Scanner;
import java.lang.Math;

public class Solution14 {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        float princ, rate, years, times;

        System.out.println("Enter the principal:");
        princ = input.nextFloat();

        System.out.println("Enter the rate of interest:");
        rate = input.nextFloat();

        System.out.println("Enter the number of years:");
        years = input.nextFloat();

        System.out.println("Enter the number of times the interest is compounded per year:");
        times = input.nextFloat();

        double answer, prt1, prt2, prt3;
        prt1 = 1 + ((rate/100) / times);
        prt2 = times * years;
        prt3 = Math.pow(prt1, prt2);
        answer = prt3 * princ;

        double roundOff = Math.round(answer*100.0)/100.0;

        System.out.println("$" + princ + " invested at " + rate + "% for " + years + " years compounded " + times + " times per year is $" + roundOff);
    }

}
