package com.syntaxGroupProject;

public class Task05 {

	public static void main(String[] args) {
		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.
		// (use 2 different loops).

		String[] countries = { "Japan", "France", "Italy", "United States of America" };

		String capital = null;

		for (String coun : countries) {

			switch (coun) {

			case "Japan":
				capital = "Tokyo";
				break;
			case "France":
				capital = "Paris";
				break;
			case "Italy":
				capital = "Rome";
				break;
			case "United States of America":
				capital = "Washington D.C";
				break;
			default:

			}
			System.out.println(coun + "--->> " + capital);
		}
		;
		System.out.println("---------------------------------------------------------------");

		for (int i = 0; i < countries.length; i++) {

			switch (countries[i]) {

			case "Japan":
				capital = "Tokyo";
				break;
			case "France":
				capital = "Paris";
				break;
			case "Italy":
				capital = "Rome";
				break;
			case "United States of America":
				capital = "Washington D.C";
				break;
			default:

			}
			System.out.println(countries[i] + " = " + capital);
		}
		
		
		
		
		
		
		//2nd way hocanin cozumu

//		String[] countries = { "Macedonia", "Serbia", "Bulgaria", "Turkey" };
//
//		for (String country : countries) {
//			if (country.equals("Macedonia")) {
//				System.out.println("Skopje");
//			} else if (country.equals("Serbia")) {
//				System.out.println("Belgrade");
//			} else if (country.equals("Bulgaria")) {
//				System.out.println("Sofia");
//			} else {
//				System.out.println("Ankara");
//			}
//		}
//		System.out.println("**********");
//		for (int i = 0; i < countries.length; i++) {
//
//			switch (countries[i]) {
//			case "Macedonia":
//				System.out.println("Skopje");
//				break;
//			case "Serbia":
//				System.out.println("Belgrade");
//				break;
//			case "Bulgaria":
//				System.out.println("Sofia");
//				break;
//			case "Turkey":
//				System.out.println("Ankara");
//				break;
//			}
//		}

	}

}
