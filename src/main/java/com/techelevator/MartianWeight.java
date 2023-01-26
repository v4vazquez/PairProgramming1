package com.techelevator;

import java.util.Scanner;

/*
In case you've ever pondered how much you weigh on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

$ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth is 37 lbs. on Mars.
 235 lbs. on Earth is 88 lbs. on Mars.
 185 lbs. on Earth is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		System.out.println("Enter a series of Earth Weights(space separated) for example 98 235 185");
		Scanner userInput = new Scanner(System.in);

		String earthWeightsInputs = userInput.nextLine();//user inputs Earth Weights
		String [] earthWeightsList = earthWeightsInputs.split(" "); //covers for multiple inputs separated by space, puts inputs into String[] earthWeightsList

		for (int i = 0; i < earthWeightsList.length; i++) { //loop through array
			double earthWeightsValue = Double.parseDouble(earthWeightsList[i]); //parse each String[] element to a double prior to calculations
			double wm = earthWeightsValue*0.378; //declared mars Weight variable
			System.out.println(earthWeightsValue + "lbs. on Earth is "+ wm + "lbs. on Mars.");
		}
	}
}
