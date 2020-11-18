package assignment9;

import java.util.Scanner;

public class question1_tipCalculator {
	/*
	 * Question-1 Create a method called tipCalculator which accepts parameters: 
	 * boolean isSplit, int numberPeople, double checkAmount, String serviceQuality
	 * Ask the user to enter each value.  User should select service quality that
	 * will correspond to tip percent. Poor = 5% Fair = 10% Good = 15% Great = 20%
	 * Excellent = 25% The program should display the following information based on
	 * the user input: Split or No split Number of people entered: &&&& Service
	 * Quality: Total to pay: Total tip: Total per person: Tip per person: Input:
	 * Split:Yes Number of people:4 Check amount:476.0 Service Quality:Excellent
	 * Output: Number of people entered: &&&& Total to pay: 595.0 Total tip: 119.0
	 * Total per person: 148.75 Tip per person: 29.75
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isSplit = true;
		System.out.print("Split:");
		String Split = sc.next();
		if (Split.equalsIgnoreCase("no")) {
			isSplit = false;
		}
		if (isSplit) {
			System.out.print("Number of People:");
			int numberPeople = sc.nextInt();
			System.out.print("Check amount:");
			double checkAmount = sc.nextDouble();
			System.out.print("Service Quality:");
			String serviceQuality = sc.next();

			tipCalculator(isSplit, numberPeople, checkAmount, serviceQuality);
		}
	}

	public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality) {
		if (isSplit) {
			System.out.print("Number of people entered: ");
			for (int i = 1; i <= numberPeople; i++) {
				System.out.print("&");
			}
			System.out.println();
			double totalTip = 0;
			switch (serviceQuality.toLowerCase()) {
			case "poor":
				totalTip = checkAmount * (5 / 100);
				break;
			case "fair":
				totalTip = checkAmount * (10 / 100);
				break;
			case "good":
				totalTip = checkAmount * (15 / 100);
				break;
			case "great":
				totalTip = checkAmount * (20 / 100);
				break;
			case "excellent":
				totalTip = checkAmount * (25 / 100);
				break;

			}
			System.out.println("Total to pay: " + checkAmount + totalTip);

			System.out.println("Total tip: " + totalTip);
			System.out.println("Total per person: " + checkAmount / numberPeople);
			System.out.println("Tip per person: " + totalTip / numberPeople);
		}

	}

}
