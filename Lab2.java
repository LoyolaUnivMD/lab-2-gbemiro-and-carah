// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        //Make sure user's name has no whitespace with .strip()
        System.out.print("What's your name? ");
        String customerName = input.nextLine();
        customerName = customerName.strip();

        //Initialize decimal format so that single character random numbers are output with a 0 in front
        DecimalFormat df = new DecimalFormat("00");

        System.out.println("Here are the tickets:");

        //Prints 10 lines of 5 random numbers each in a 2 character format
        for (int i = 10; i > 0; i--) {
            int ticket1 = rand.nextInt(0, 100);
            int ticket2 = rand.nextInt(0, 100);
            int ticket3 = rand.nextInt(0, 100);
            int ticket4 = rand.nextInt(0, 100);
            int ticket5 = rand.nextInt(0, 100);
                System.out.println(df.format(ticket1) + " " + df.format(ticket2) + " " + df.format(ticket3) + " " + df.format(ticket4) + " " + df.format(ticket5));
        }

        //Exit messages
        System.out.println("-----------------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("Estimated Jackpot:");
        System.out.println("$225,938,745");
        System.out.println("-----------------");

    }
}
