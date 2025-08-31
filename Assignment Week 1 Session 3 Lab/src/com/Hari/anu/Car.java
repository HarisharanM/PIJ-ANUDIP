package com.Hari.anu;

import java.util.Scanner;

public class Car {
	String make; //string for model year
	String model;
	short year;
	int price;
	
	//Scanner class is used to accept the data from the user through keyboard
	Scanner scan1 = new Scanner(System.in);
	
	// Default constructor with no attributes
	public Car() {
		super();
	}

	//Constructor with all of the attributes.
	public Car(String make, String model, short year, int price) {
		super();
		this.make = make; // "this" helps to not mix up the variables
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	
	public void acceptCarDetails()
	{
		System.out.println("Enter the Car details ");
		
		 // I'll ask the user for all the car's information
		
		System.out.println(" Enter the car make: ");
		make = scan1.nextLine();
		
		System.out.println("Enter the car model: ");
		model = scan1.nextLine();
		
		System.out.println("Enter the year: ");
		year = scan1.nextShort();
		scan1.nextLine();
		
		System.out.println("Enter the price: ");
		price = scan1.nextInt();
		scan1.nextLine();
	}
	
	// A new method to display the car's information
    public void displayCarInfo() {
        System.out.println("\nCar Details:");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Price: $" + this.price);
    }
    
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        // Creating a new Car object
        Car newCar = new Car();
        
        // Calling method to get car details from the terminal
        newCar.acceptCarDetails();
        
        // used to display car info
        newCar.displayCarInfo();

        newCar.scan1.close();
    }
}
