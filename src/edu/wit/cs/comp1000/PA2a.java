package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2a {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter five whole numbers: ");
        
        int[] numbers = new int[5];
        int sumPos = 0;
        int sumNonPos = 0;
        int countPos = 0;
        int countNonPos = 0;

        // Read 5 numbers
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            
            if (numbers[i] > 0) {
                sumPos += numbers[i];
                countPos++;
            } else {
                sumNonPos += numbers[i];
                countNonPos++;
            }
        }
        
        int totalSum = sumPos + sumNonPos;
        double avgPos = (countPos > 0) ? (double) sumPos / countPos : 0.00;
        double avgNonPos = (countNonPos > 0) ? (double) sumNonPos / countNonPos : 0.00;
        double avgTotal = (double) totalSum / 5;

        // Determine correct singular/plural for "number(s)"
        String posNumber = (countPos == 1) ? "number" : "numbers";
        String nonPosNumber = (countNonPos == 1) ? "number" : "numbers";

        // Output results
        System.out.printf("The sum of the %d positive %s: %d%n", countPos, posNumber, sumPos);
        System.out.printf("The sum of the %d non-positive %s: %d%n", countNonPos, nonPosNumber, sumNonPos);
        System.out.printf("The sum of the 5 numbers: %d%n", totalSum);
        System.out.printf("The average of the %d positive %s: %.2f%n", countPos, posNumber, avgPos);
        System.out.printf("The average of the %d non-positive %s: %.2f%n", countNonPos, nonPosNumber, avgNonPos);
        System.out.printf("The average of the 5 numbers: %.2f%n", avgTotal);
        
        sc.close();
    }
}
