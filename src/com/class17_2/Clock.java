package com.class17_2;

public class Clock {
	public static void main(String[] args) {
		
		Clock time=new Clock();
		
		time.tellTime();
	}
		
	
	void tellTime() {
for (int h=0; h<24; h++) {
	
	for (int m=0; m<60; m++) {
		if (m<10) {
		System.out.println(h+":0"+m);	
		} else {
		System.out.println(h+":"+m);
	} 
		} 
	
	
	
		}
	}
}

