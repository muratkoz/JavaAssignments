package Lab2;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		minAndMaxNum();
		cookie();
		sumOfTheNumbers();
		maleFemale();
		bill();
		tax();
		
	}

	public static void minAndMaxNum() {
		/*
		 * Question-1 Write a program with a loop that lets the user enter a series of
		 * integer numbers. After all the numbers have been entered, the program should
		 * display the largest and smallest numbers entered.
		 */
		Scanner scan = new Scanner(System.in);
		int smallestNum=0;
		int biggestNum=0;
		System.out.println("Enter your first number:");
		int firstNumber = scan.nextInt();
		System.out.println("Enter your next number:");
		int secondNumber = scan.nextInt();
		if(firstNumber>secondNumber) {
			biggestNum=firstNumber;
			smallestNum=secondNumber;
		}else {
			smallestNum=firstNumber;
			biggestNum=secondNumber;
		}
		int anotherNumber;
		System.out.print("Do you want to enter another number: 0-No, 1-Yes");
		anotherNumber = scan.nextInt();
		if(anotherNumber==0) {
			System.out.println("Smallest number is: "+smallestNum+"\nBiggest number is: "+biggestNum);
		}
		 while (anotherNumber == 1) {
			 System.out.println("Enter your next number:");
				int nextNumber = scan.nextInt();
			 if(nextNumber<smallestNum) {
				 smallestNum=nextNumber;				 
			 }else if(nextNumber>biggestNum){
				 biggestNum=nextNumber;
			 }
			 System.out.print("Do you want to enter another number: 0-No, 1-Yes");
			 anotherNumber = scan.nextInt();
		 }
		 
		 System.out.println("Smallest number is: "+smallestNum+"\nBiggest number is: "+biggestNum);

	}

	/*
	 * Question-2 A bag of cookies holds 40 cookies. The calorie information on the
	 * bag claims that there are 10 serving in the bag and that a serving equals 300
	 * calories. Write a program that lets the user enter the number of cookies he
	 * or she actually ate and then reports the number of total calories consumed.
	 */

	// MY NOTE: if 10 serving=40 cookies, 1 serving=4 cookies. if 1 serving= 300
	// calories, 1 cookie=300/4=75 calorie
	public static void cookie() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of cookies you ate:");
		int cookies = scan.nextInt();
		System.out.println("you consumed" + (cookies * 75) + "calories");
	}

	/*
	 * Question-3 Write a program that asks the user for a positive nonzero integer
	 * value. The program should use a loop to get the sum of all the integers from
	 * 1 up to the number entered.
	 */
	public static void sumOfTheNumbers() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive nonzero number:");
		int num = scan.nextInt();
		int sum = 0;
		if (num <= 0) {
			System.out.println("Invalid number");
		}
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

	/*
	 * Question-4 Write a program that asks user for the number of males and the
	 * number of females registered in a class. The program should display the
	 * percentage of males and females in the class.
	 */

	public static void maleFemale() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of males:");
		double male = scan.nextInt();
		System.out.println("Enter number of females:");
		double female = scan.nextInt();
		double perMale = (male / (male + female)) * 100;
		double perFemale = (female / (male + female)) * 100;
		System.out.println("percentage of male: " + perMale + ", percentage of female: " + perFemale);

	}

	/*
	 * Question-5
	 * 
	 * Write a program that computes the tax and tip on a restaurant bill. The
	 * program should ask the user to enter the charge for the meal. The tax should
	 * be 6.75 percent of the meal charge. The tip should be 20 percent of the total
	 * after adding tax. Display the meal charge, tax amount, tip amount, and total
	 * bill on the screen.
	 */

	public static void bill() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the charge for the meal:");
		double charge = scan.nextDouble();
		double tax = charge * 0.0675;
		double tip = (charge + tax) * 0.2;
		System.out.println("Meal charge: " + charge + ", Tax amount: " + tax + ", Tip amount: " + tip + ", Total bill: "
				+ (charge + tax + tip));

	}

	/*
	 * Question-6
	 * 
	 * Write a program that will ask the user to enter the amount of a purchase. The
	 * program should then compute the state and county tax sales tax. Assume the
	 * state sales tax is 4 percent and the county sales tax is 2 percent. The
	 * program should display the amount of the purchase , the state sales tax, the
	 * county sales tax, the total sales tax, and the total of the sale (which is
	 * the sum of the amount of purchase plus the total sales tax)
	 */

	public static void tax() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of a purchase:");
		double purchase = scan.nextDouble();
		double stateSalesTax = purchase * 0.04;
		double countrySalesTax = purchase * 0.02;
		double totalTax = stateSalesTax + countrySalesTax;
		System.out.println("Amount of purchase: " + purchase + ", State sales tax: " + stateSalesTax
				+ ", Country sales tax: " + countrySalesTax + ", Total sales tax: " + totalTax + ", Total of the sale: "
				+ (purchase + totalTax));
	}

}
