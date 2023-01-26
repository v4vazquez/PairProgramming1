package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);

		System.out.print("Please enter the amount of the bill: ");
		double billAmount = Double.parseDouble(userInput.nextLine()); //user inputs total amount of bill, then parses String to a double
		System.out.print("Please enter the amount tendered: ");
		double tenderedAmount = Double.parseDouble(userInput.nextLine());//user inputs amount tendered, then parses String to a double
		double change = tenderedAmount - billAmount; //declare double change to calculate change amount
		System.out.println("The change required is " + change);
	}
}
