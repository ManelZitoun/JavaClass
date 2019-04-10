package com.class18;

public class MinMax {
	
	//Write a program to find the maximum and minimum value of an array.

   int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

   int max = array[0];
   int min = array[0]; {

   for (int j = 0; j < array.length; j++) {

       if (array[j] >= max) {

           max = array[j];
       }
       if (array[j] <= min) {
           min = array[j];
       }
   }
   
}
}