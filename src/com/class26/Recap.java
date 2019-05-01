package com.class26;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int [] array= {10, 10, 20, 20};
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(12); //comes from collection
		numbers.add(0, 13); //specific to all list objects
		numbers.add(1, 14); //
		
		System.out.println(numbers.size());
		
		numbers.set(1,  33);
		System.out.println(numbers.get(1));
		System.out.println(numbers.contains(33));
		
		System.out.println("-----Using for loop------");
		for (int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		for (int num:numbers) {
			System.out.println(num);
		}
		
		System.out.println("-----Using iterator-----");
		Iterator<Integer> it=numbers.iterator();
		while (it.hasNext()) {
			int number=it.next();
			System.out.println(number);
		}
		
		int c=0;
		
		while(numbers.size()>c) {
			int myNum=numbers.get(c);
			System.out.println(myNum);
			c++; 
		}
		
		//creat arrayList of int 1-10
		
		ArrayList<Integer> alist=new ArrayList<>();
		
		for (int i=1; i<=20; i++) {
			alist.add(i);
		}
//		
		System.out.println(alist);
//		
		Iterator<Integer> iterator=alist.iterator();
		while(iterator.hasNext()) {
			int number=iterator.next(); 
			if(number%2!=0) {
				iterator.remove();
			}
		}
		System.out.println(alist);
		
	}

}
