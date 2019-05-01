package com.class25;

public class CarTest {
	
	public static void main(String[] args) {
		
		// price, length
Sedan obj = new Sedan(2500, 30);
System.out.println(obj.calculateSalePrice());

		// price, weight
Truck obj1 = new Truck(10000, 3000);
System.out.println(obj1.calculateSalePrice());
}

}
