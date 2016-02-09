package com.xebia.training;

import java.util.Scanner;

public class Array_add {
	
	 
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	 
	        
	        int[][] array = new int[5][5];
	        int sum = 0;
	 
	     
	        System.out.println("Enter matrix:");
	        for (int num = 0; num < array.length; num++) {
	            
	            for (int num1 = 0; num1 < array[num].length; num1++) {
	                array[num][num1] = scan.nextInt();
	            }
	            System.out.println();
	        }
	 
	        
	        for (int num = 0; num < array.length; num++) {
	            for (int num1 = 0; num1 < array[num].length; num1++) {
	                if (num == num1) {
	                    sum += array[num][num1];
	                }
	            }
	        }
	 
	      
	        for (int num = 0, num1 = array[num].length - 1; num < array.length; num++, num1--) {
	            sum += array[num][num1];
	        }
	 
	        System.out.println("Sum of Diagonal Elements is " + sum);
	    }

}
