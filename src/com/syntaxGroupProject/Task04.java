package com.syntaxGroupProject;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// Create an array on double values using scanner and
		// calculate the sum of all stored elements in that array.

		Scanner scan = new Scanner(System.in);
		System.out.println("Please ,enter  4 double values");

		double number1 = scan.nextDouble();
		double number2 = scan.nextDouble();
		double number3 = scan.nextDouble();
		double number4 = scan.nextDouble();

		double[] arrayNumbers = { number1, number2, number3, number4 };

		double sum = 0.0;

		for (double nu : arrayNumbers) {
			sum += nu;
		}
		System.out.println("The sum of double values is " + sum);
		
		
		
		//2nd way
//		
//		double [] numbers=new double[5];
//		Scanner scanner=new Scanner(System.in);
//		for(int i=0; i<numbers.length;i++) {
//			System.out.println("Please enter the number");
//			numbers[i]=scanner.nextDouble();
//		}
//		double sum2=0;
//		for(double number:numbers) {
//			sum2+=number;
//		}
//		
//		System.out.println(sum2);
//		
	}

}
