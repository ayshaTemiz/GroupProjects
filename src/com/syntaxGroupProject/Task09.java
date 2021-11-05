package com.syntaxGroupProject;

import java.util.Arrays;

public class Task09 {

	public static void main(String[] args) {

		// Maximum and minimum number in the array?

		int[] numbers = { 55, -2000, 44, 1080, 30 };

		int small = 0;
		int large = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > large) {
				large = numbers[i];

			} else if (numbers[i] < small) {
				small = numbers[i];
			}
		}

		System.out.println("Maximum number is " + large);
		System.out.println("Minimum number is " + small);
//		

		// 2st way
//		Arrays.sort(numbers);
//		System.out.println("Smallest number = " + numbers[0]);
//		System.out.println("Biggest number = " + numbers[numbers.length - 1]);
//
//		System.out.println("------------------------------");

	}

}
