package Assignment8;

import java.util.*;

public class Assignment8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		plus(); // Question 1
		
		cube(); // Question 2
		
		hello(); // Question3
		world(); // Question3
		
		printHollowRect(); // Question 4

		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		sign(num); // Question 5

		next3(-149); // Question 6

		System.out.println(isPalindrome()); // Question 7

		fib(9); // Question 8

		System.out.println(max(11, 5)); // Question 9

		System.out.println(isEven(516512)); // Question 10

		c_profits(100, 60); // Question 11

		hamletQuote(true, false); // Question 12

		System.out.println(waterTax(151)); // Question 13

		System.out.println(truthTable(true, true, false)); // Question 14

		System.out.println(validateTask(false, 2, 2)); // Question 15

		System.out.println(simpleRoomBook(true, 2, 6, 2018)); // Question 16

		System.out.println(getThunderBlazz(true, false, 1, 2, 3)); // Question 17

	}

	// QUESTION 1: SUM OF TWO NUMBERS
	public static void plus() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number:");
		int num1 = scan.nextInt();
		System.out.println("enter second number:");
		int num2 = scan.nextInt();
		System.out.println("result: " + (num1 + num2));
	}

	// QUESTION 2: CUBED VALUE OF A NUMBER
	public static void cube() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number:");
		int num1 = scan.nextInt();
		System.out.println("Cubed value of " + num1 + " is: " + (num1 * num1));
	}

	// QUESTION 3: PRINTING "HELLO WORLD!" WITH TWO METHODS
	public static void hello() {
		System.out.println("Hello");
	}

	public static void world() {
		System.out.println("World!");
	}

	// QUESTION 4: PRINTING 5* RECTANGLE
	public static void printHollowRect() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5 || j == 1 || j == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	// QUESTION 5: NEGATIVE, POSITIVE OR ZERO
	public static void sign(int num) {

		if (num < 0) {
			System.out.println("negative");
		} else if (num > 0) {
			System.out.println("positive");
		} else {
			System.out.println("zero");
		}

	}

	// QUESTION 6: NEXT THREE NUMBERS
	public static void next3(int num) {

		for (int a = 1; a <= 3; a++) {
			System.out.print(num + 1 + " ");
			num += 1;
		}

	}

	// QUESTION 7: IS THE NUMBER PALINDROME OR NOT
	public static boolean isPalindrome() {
		int r, reverse = 0, temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = scan.nextInt();
		temp = a;
		while (a > 0) {
			r = a % 10;
			reverse = (reverse * 10) + r;
			a = a / 10;
		}
		if (temp == reverse)
			return true;
		else {
			return false;
		}

	}

	// QUESTION 8: N-TH FIBONACCI NUMBER
	public static int fib(int num) {
		double prev1 = 0;
		double prev2 = 1;
		int num3 = 0;
		if (num == 1) {
			return 0;
		} else if (num == 2) {
			return 1;
		}
		for (int w = 2; w < num; w++) {
			num3 = (int) (prev1 + prev2);
			prev1 = prev2;
			prev2 = num3;
		}
		return num3;

	}

	// QUESTION 9: if x is bigger then max return max, in any other case return x
	public static int max(int x, int max) {
		if (x > max) {
			return max;
		} else {
			return x;
		}

	}

	// QUESTION 10:IF EVEN, RETURN TRUE
	public static boolean isEven(int i) {

		if (i % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// QUESTION 11: DETERMINE IF THERE IS A PROFIT OR LOSS
	public static void c_profits(int buyPrice, int sellPrice) {

		if (buyPrice > sellPrice) {
			System.out.println("loss");
		} else if (sellPrice > buyPrice) {
			System.out.println("profit");
		} else {
			System.out.println("no loss");
		}

	}

	// QUESTION 12: RETURN TRUE ONE OF OR BOTH OF THE BOOLEAN PARAMETERS IS TRUE
	public static boolean hamletQuote(boolean b, boolean c) {
		if (b || c) {
			return true;
		}
		return false;
	}

	// QUESTION 13: CALCULATING WATER TAX
	public static double waterTax(double bill) {

		if (bill <= 50) {
			return bill * 0.60;
		} else if (bill > 50 && bill <= 100) {
			return bill * 0.90;
		} else if (bill > 100 && bill <= 150) {
			return bill * 0.90 + 50;
		} else {
			return bill * 0.90 + 100;
		}
	}

	// QUESTION 14: RETURN TRUE ONLY IF BOTH A AND B ARE TRUE OR C IS TRUE
	public static boolean truthTable(boolean a, boolean b, boolean c) {

		if ((a && b) || c) {
			return true;
		}
		return false;

	}

	/* QUESTION 15:
	 * We have a to do list app, every time a user adds a task - a few things needed to be checked.
	 * It should not be empty. boolean parameter needs to be true taskId should be only 1 greater than currentID. 
	 * for example if we have 7 tasks(currentId is 7) so the next task id is 8 , it can't be 10.
	 */
	public static boolean validateTask(boolean b, int i, int j) {
		if (b && i == j + 1) {
			return true;
		}
		return false;

	}

	/* QUESTION 16:
	 * To book a room first it needs to be available for rent and make sure its available at the date selected:
	 * the room is already booked between 7/1/2018 - 7/8/2018 and not available accepting bookings only for year of 2018
	 */
	public static boolean simpleRoomBook(boolean b, int i, int j, int k) {
		if (b && k == 2018) {
			if ((j > 8) || (j == 1 && i < 7) || (j == 8 && i > 7)) {
				return true;
			}
			return false;
		}
		return false;

	}

	/* QUESTION 17:
	 * There are a few ways to get this galacticly popular drink if it is available at the store you can buy it. 
	 * or you can get it as a gift.
	 * the third option is to mix its ingredients (its a secret formula):
	 * 1 from ingredient1,2 from ingredient2 and 3 from ingredient3.
	 * or the alternate recipe: 3 from ingredient1, 1 from ingredient2 and 2 from ingredient3.
	 * this ain't coca-cola...
	 * You need to have exact amount of ingredients for making the drink. not less or more
	 * getThunderBlazz(boolean avilable,boolean gift, int ingredient1 , int ingredient2, int ingredient3)
	 * available = available at store
	 * gift = got it as a gift
	 * both are booleans.
	 * then theres the three ingredients as ints
	 */
	public static boolean getThunderBlazz(boolean b, boolean c, int i, int j, int k) {
		if (b || c) {
			return true;
		} else if ((i == 1 && j == 2 && k == 3) || (i == 3 && j == 1 && k == 2)) {
			return true;
		} else {
			return false;
		}

	}

}
