package com.class12;

public class ForEachIn2D {
	public static void main(String[] args) {
		
		//create a grocery list: fruits, veggies, dairy
		//Retrieve all values using 2 diff loops

		String[][] groceryList = { { "Strawberries", "Apples", "Bananas", "Orange" },
				{ "Green beans", "Broccoli", "Peas", "Corn" }, { "Cheese", "Milk", "Yogurt", "Creamer" }, };

		for (String[] singleArray : groceryList) {

			if (singleArray.equals(groceryList[0])) {
				System.out.println("These are the fruits:");
			} else if (singleArray.equals(groceryList[1])) {
				System.out.println("These are veggies:");
			} else {
				System.out.println("These are the dairy products:");
			}
			for (String list : singleArray) {
				System.out.println(list + " ");
			}

			System.out.println();

		}
		
		
	}

}
