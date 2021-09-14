/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int n3 = sc.nextInt();
        int temp = n1;
        if(n2>temp)
            temp=n2;
        if(n3>temp)
            temp=n3;
        System.out.printf("The largest number is %d",temp);
    }
}
