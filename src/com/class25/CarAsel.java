package com.class25;

public class CarAsel {
	
	String color;
	double carPrice;
	
	public CarAsel (String color, double carPrice) {
		this.color=color;
		this.carPrice=carPrice; 
	}
	
	public double calculateSalePrice() {
		return carPrice; 
	}

}

class Truck extends CarAsel {
	int weight;
	
	public Truck(int weight,  String color, double carPrice) {
		super(color, carPrice); 
		this.weight=weight; 
	}
	
	public double calculateSalePrice() {
		if (weight>2000) {
			carPrice-=carPrice*0.1;
		}
		return carPrice; 
	}

}

class Sedan extends CarAsel {
	
	int length;
	
	public Sedan (String color, double carPrice) {
		super (color, carPrice);
		this.length=length;
	}
	
	public double calculateSalePrice() {
		if (length>20) {
			carPrice-=carPrice*0.05;
		}
	}
}