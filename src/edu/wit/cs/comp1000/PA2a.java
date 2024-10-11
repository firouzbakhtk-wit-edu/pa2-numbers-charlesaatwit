package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter five whole numbers: ");
		
		int[] numbers = new int[5];
		int countPos = 0, countNonPos = 0;
		int sumPos = 0, sumNonPos = 0;
		int totalSum = 0;
		
		for (int counter = 0; counter < 5; counter++) {
			numbers[counter] = scanner.nextInt();
		    totalSum += numbers[counter];
		    if (numbers[counter] > 0) {
		    	sumPos += numbers[counter];
		    	countPos++;
		    }
		 }
		  
		double avgTotal = (double) totalSum /5;
		double avgPos = countPos > 0 ? (double) sumPos / countPos : 0.00;
		double avgNonPos = countNonPos > 0 ? (double) sumNonPos / countNonPos : 0.00;
		
		String numPosText = countPos == 1 ? "number" : "number";
		String numNonPosText = countNonPos == 1 ? "number" : "number";
		
		System.out.printf("The sum of the %d positive %s: %d%n", countPos, sumPos, numPosText);
		System.out.printf("The sum of the %d non-positive %s: %d%n", countNonPos, numPosText);
		System.out.printf("The sum of the 5 numbers: %d%n", totalSum);
		System.out.printf("The average of the %d positive %s: %.2f%n", countPos, numPosText);
		System.out.printf("The average of the %d non-positive %s: %.2f%n", countNonPos, numPosText);
		System.out.printf("The average of the 5 numbers: %.2f%n", avgTotal);
		
		
		scanner.close();
	}

	}

