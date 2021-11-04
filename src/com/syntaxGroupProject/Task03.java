package com.syntaxGroupProject;

public class Task03 {

	public static void main(String[] args) {
		// Create a 2D array of integers. Develop a program which will calculate the sum
		// of even and odd numbers for that array
		
		int[][] numbers = { { 4, 10, 13, 21 }, { 3, 11, 9, 16, 23 }, };
		int sumEven = 0;
		int sumOdd=0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++)
				if (numbers[i][j] % 2 == 0) {
					sumEven = sumEven + numbers[i][j];
				}else if  (numbers[i][j] % 2 == 1) {
					sumOdd = sumOdd + numbers[i][j];
				}
		}
		System.out.println("The sum of even numbers is " + sumEven);
		System.out.println("The sum of odd numbers is " + sumOdd);
		
//		int sum1 = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++)
//				if (numbers[i][j] % 2 == 1) {
//					sum1 = sum1 + numbers[i][j];
//				}
//		}
		
	}

}
