package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * What is the order amount? 10
 * What is the state? WI
 * The subtotal is $10.00.
 * The tax is $0.55.
 * The total is $10.55.
 *
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in= new Scanner(System.in);
        int order;
        double tax,total,subtotal;
        String state;
        DecimalFormat f=new DecimalFormat("0.00");


        System.out.println( "What is the order amount? " );
        order=in.nextInt();
        System.out.println( "What is the state? " );
        state=in.next();
        tax=0.55;
        if (state.equals("WI")){
            subtotal=Math.round(order*100.0)/100.0;
            total=tax+subtotal;
            System.out.println( "The tax is $"+tax+".\n" +
                    "The total is $"+total+"." );
            System.exit(0);
        }
        System.out.print("The total is $"+(f.format(order)));

    }
}
