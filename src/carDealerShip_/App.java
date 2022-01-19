package carDealerShip_;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static boolean flag = true;
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Vehicle> myCarList = new ArrayList<>();
	
	public static void main(String[]args) {
		System.out.println("**Welcome to my Car Dealership App**");
		System.out.println("What would you like to do?");
		while (flag) {
			System.out.println("Press 1: See our Galary ");
			System.out.println("Press 2: Add some cars");
			System.out.println("Press 3: To Exit the App");
			int selection = sc.nextInt();
			try {
				switch (selection) {
				case 1:
					goToGalary();
					break;
				case 2:
					addCar();
					break;
				case 3:
					exit();
					break;
				default:
					System.out.println("You entered the Invalid Data");
					exit();
					break;
				}
			} catch (Exception e) {
				System.out.println("You entered the Invalid Data");
				exit();
			}
			
		}
	}
	public static void goToGalary() {
		Vehicle car1 = new Vehicle(2010, "Toyota", "Corolla", 200000, 120000);
		Vehicle car2 = new Vehicle(2013, "Audi", "A5", 55000, 320000);
		Vehicle car3 = new Vehicle(2005, "BMW", "323", 240000, 24000);
		Vehicle car4 = new Vehicle(2010, "Mercedes", "A140", 310000, 13400);
		
		myCarList.add(car1);
		myCarList.add(car2);
		myCarList.add(car3);
		myCarList.add(car4);
		System.out.println("1: Buy a car?");
		System.out.println("2: See all of cars?");
		System.out.println("3: To Exit");
		int buyCar = sc.nextInt();
		if (buyCar == 1) {
			System.out.println("How much budget do you have?");
			int budget = sc.nextInt();
			System.out.println("Ok, We can offer you with this amount only this cars");
			for (Vehicle cars : myCarList) { // lists all data
				if (cars.budget(budget)) {
					System.out.println("...................");
					System.out.println(cars.getYear());
					System.out.println(cars.getBrand());
					System.out.println(cars.getModel());
					System.out.println(cars.getMiles());
					System.out.println(cars.getPrice());
					System.out.println("...................");
				}
			}
			myCarList.clear();
		} else if (buyCar == 2) {
			for (Vehicle cars1 : myCarList) { // lists all data
				System.out.println("...................");
				System.out.println(cars1.getYear());
				System.out.println(cars1.getBrand());
				System.out.println(cars1.getModel());
				System.out.println(cars1.getMiles());
				System.out.println(cars1.getPrice());
				System.out.println("...................");
			}
			myCarList.clear();
		} else {
			//exit();
		}
	}
	public static void addCar() {
		System.out.println("Please enter your cars Specifications");
		System.out.println("Please Enter the Year of the Car");
		int yearCar = sc.nextInt();
		System.out.println("Please Enter the Brand of the Car");
		sc.nextLine();
		String brandCar = sc.nextLine();
		System.out.println("Please Enter the Model of the Car");
		String modelCar = sc.nextLine();
		System.out.println("Please Enter the Miles of the Car");
		double milesCar = sc.nextDouble();
		System.out.println("Please Enter the Price of the Car");
		double priceCar = sc.nextDouble();
		Vehicle newCar = new Vehicle(yearCar, brandCar, modelCar, milesCar, priceCar);
		myCarList.add(newCar);
		
		System.out.println("Your car data succesfully created.");
		System.out.println("..........................");
		System.out.println(newCar.getYear());
		System.out.println(newCar.getBrand());
		System.out.println(newCar.getModel());
		System.out.println(newCar.getMiles());
		System.out.println(newCar.getPrice());
	}
	public static void exit() {
		System.out.println("Press 1 to Go back to App or 2 to Exit");
		int exit = sc.nextInt();
		if (exit == 1) {
			flag = true;
		} else if (exit == 2) {
			try {
				System.out.println("Program is Terminating");
				System.out.println("...........");
				Thread.sleep(3000);
				System.out.println("See you again");
			} catch (Exception e) {				
				System.out.println(e.getStackTrace());
			}
			flag = false;
		} else {
			System.out.println("You have entered Invalid Data. Terminating...");			
			flag = false;
		}
	}
}
