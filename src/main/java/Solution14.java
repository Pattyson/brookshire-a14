/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */


import java.util.Scanner;

public class        Solution14 {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        double Order, Tax, Total;
        double g = 0.055;
        String stg1;

        System.out.println("What is the order amount?");
        Order = input.nextFloat();

        System.out.println("What is the state?");
        stg1 = input.next();

        if(stg1.equals("WI")) {
            System.out.println("Subtotal is $" + Order);

            Tax = Order * g;
            System.out.println("The tax is $" + Tax);

            Total = Tax + Order;
            System.out.println("The total is $" + Total);
        }
        else {

            System.out.println("Total is $" + Order);
        }

    }

}
