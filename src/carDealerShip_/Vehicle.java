package carDealerShip_;

//import java.util.ArrayList;

public class Vehicle {
	
	private int year;
	private String brand;
	private String model;
	private double miles;
	private double price;
	
	
	public Vehicle(int year, String brand, String model, double miles, double price) {
		super();
		this.year = year;
		this.brand = brand;
		this.model = model;
		this.miles = miles;
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getMiles() {
		return miles;
	}
	public void setMiles(double miles) {
		this.miles = miles;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean budget(int budget) {		
		return this.price<budget;
	}
	
	

}
