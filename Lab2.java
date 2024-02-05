// Programmers:  [Carah Katz and Gbemiro Omokayode]
// Course:  CS 212
// Due Date: 02/04/2024
// Lab Assignment: Lab 2 
// Problem Statement: The task is to write a Java program for the quick play function from the lottery vending machiene. 
// Data In: Prompt user to input their name and how much they want to pay. 
// Data Out: Output 10 random lottery tickets for the user. The total winnings of the user. 
// Credits: https://www.w3schools.com/java/java_arrays_loop.asp,
//          https://stackoverflow.com/questions/3672731/how-can-i-format-a-string-number-to-have-commas-and-round

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.lang.Math;

class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        //Inputs
        //Make sure user's name has no whitespace with .strip()
        System.out.print("What's your name? ");
        String customerName = input.nextLine();
        customerName = customerName.strip();

        System.out.print("How much do you want to bet? ");
        float bet = input.nextFloat();

        //Initialize decimal format so that single character random numbers are output with a 0 in front
        DecimalFormat df = new DecimalFormat("00");

        System.out.println("Here are the tickets:");

        //Initialization
        int[] winningNumbers = {3, 5, 16, 58, 59, 11};
        double prize = 0;

        //Prints 10 lines of 5 random numbers each in a 2 character format
        for (int i = 10; i > 0; i--) {
            int ticket1 = rand.nextInt(0, 100);
            int ticket2 = rand.nextInt(0, 100);
            int ticket3 = rand.nextInt(0, 100);
            int ticket4 = rand.nextInt(0, 100);
            int ticket5 = rand.nextInt(0, 100);
            System.out.println(df.format(ticket1) + " " + df.format(ticket2) + " " + df.format(ticket3) + " " + df.format(ticket4) + " " + df.format(ticket5));

            //Check if any of these numbers are in winningNumbers
            for (int num : winningNumbers){
                //if the number is contained in winningNumbers, prize = prize + bet^1.75
                if (ticket1 == num){
                    prize += Math.pow(bet, 1.75);
                }
                if (ticket2 == num){
                    prize += Math.pow(bet, 1.75);
                }
                if (ticket3 == num){
                    prize += Math.pow(bet, 1.75);
                }
                if (ticket4 == num){
                    prize += Math.pow(bet, 1.75);
                }
                if (ticket5 == num){
                    prize += Math.pow(bet, 1.75);
                }
                    prize += Math.pow(bet, 1.75);
            }
        }

        //Exit messages
        System.out.println("-----------------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("Estimated Jackpot:");
        double formattedPrize = Double.parseDouble(String.valueOf(prize));
        DecimalFormat mf = new DecimalFormat("#,###.00");
        System.out.println("$" + mf.format(formattedPrize));
        System.out.println("-----------------");

    }
}
