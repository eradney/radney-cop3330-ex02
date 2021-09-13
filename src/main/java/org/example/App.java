/**
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        String str;

        System.out.println("What is the input string? ");
        str = scnr.next();
        System.out.println(str + " has " + str.length() + " characters.");
    }
}
