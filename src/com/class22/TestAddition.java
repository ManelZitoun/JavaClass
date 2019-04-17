package com.class22;

public class TestAddition {
	
	public static void main(String[] args) {
		
		Addition obj=new Addition(); 
		obj.add(10.2, 12.2);
		obj.add(100);
		
		AreaClass area1=new AreaClass();
		area1.area(5); // square 
		area1.area(2, 6); //rec 
		
		ConstructorOverloading obj1=new ConstructorOverloading(456); 
		ConstructorOverloading obj2=new ConstructorOverloading("Hello"); 
		ConstructorOverloading obj3=new ConstructorOverloading("Wow", "Woot Woot"); 


		
	}

}
