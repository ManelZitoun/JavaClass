package com.class15;

public class Computer {
	
	boolean mouse, keyboard;
	int screen, ram;
	String os;
	
	public static void main(String[] args) {
		
		Computer comp1= new Computer();
		comp1.mouse=true;
		comp1.keyboard=true;
		comp1.screen=2;
		comp1.ram=8;
		comp1.os="Windows";
		
		comp1.watchMovies();
		comp1.doJavaCoding();
		comp1.playMusic();
		
		Computer comp2=new Computer();
		comp2.mouse=false;
		comp2.keyboard=false;
		comp2.screen=4;
		comp2.ram=6;
		comp2.os="Mac OS";
		
		comp2.watchMovies();
		comp2.doJavaCoding();
		comp2.playMusic();
		
	}
	
	void watchMovies() {
		System.out.println("We can watch movies on a "+os+" computer");
	} void doJavaCoding() {
		System.out.println("We can code on a "+os+" computer");
	} void playMusic() {
		System.out.println("We can play music on a "+os+" computer");
	}

}
