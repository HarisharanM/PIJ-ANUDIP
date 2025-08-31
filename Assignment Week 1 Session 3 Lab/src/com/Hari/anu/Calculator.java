package com.Hari.anu;

import java.util.Scanner;

public class Calculator {
	
	// A Scanner object is a field so all methods in this class can use it
		Scanner scan1 = new Scanner(System.in);
	
	// Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int z, int k, int i) {
        return z + k + i;
    }

    // Overloaded method to add two doubles
    public double add(double t, double r) {
        return t + r;
    }
    
public void acceptNumbersAndShowResults() {
    	
    	System.out.println("Welcome to the Interactive Calculator!");
    	
        // --- Adding two integers ---
        System.out.println("\n--- Adding two integers ---");
        System.out.print("Enter the first integer: ");
        int num1 = scan1.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scan1.nextInt();
        
        int sum1 = add(num1, num2); // Calls the first 'add' method
        System.out.println("The sum is: " + sum1);
        
        scan1.nextLine(); 
        
        // --- Adding three integers ---
        System.out.println("\n--- Adding three integers ---");
        System.out.print("Enter the first integer: ");
        int num3 = scan1.nextInt();
        System.out.print("Enter the second integer: ");
        int num4 = scan1.nextInt();
        System.out.print("Enter the third integer: ");
        int num5 = scan1.nextInt();
        
        int sum2 = add(num3, num4, num5); // Calls the second 'add' method
        System.out.println("The sum is: " + sum2);
        
        scan1.nextLine(); 
        
        // --- Adding two doubles ---
        System.out.println("\n--- Adding two decimals (doubles) ---");
        System.out.print("Enter the first decimal: ");
        double dbl1 = scan1.nextDouble();
        System.out.print("Enter the second decimal: ");
        double dbl2 = scan1.nextDouble();
        
        double sum3 = add(dbl1, dbl2); // Calls the third 'add' method
        System.out.println("The sum is: " + sum3);
        
        
        scan1.close();
    }
    
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		myCalc.acceptNumbersAndShowResults();
		
	}
}