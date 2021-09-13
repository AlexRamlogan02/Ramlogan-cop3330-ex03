package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App 
{
    public static void main( String[] args )
    {
        //Objective: Add quotations from an input string
        Scanner scan = new Scanner(System.in);
        String quote, author, output;
        System.out.print("What is your quote? : ");
        quote = scan.nextLine(); //this scans until it reads a new line!
        System.out.print("Who said it? : ");
        author = scan.nextLine();
        output = author + " says \"" +quote +"\""; // \" allows the quotes to be visible
        System.out.println(output);
    }
}
