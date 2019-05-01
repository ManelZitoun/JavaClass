package com.class26;

public class Main {
		 public static void main(String[] args) {
			 Parent obj1=new Parent(); 
		   Parent obj = new Child();
		   obj.m1();

		 }
		}
		class Parent{

		 static void m1(){
		   System.out.println("Parent m1()");

		 }
		}
		class Child extends Parent{
		 static void m1(){
		   System.out.println("Child m1");
		 }
		}

