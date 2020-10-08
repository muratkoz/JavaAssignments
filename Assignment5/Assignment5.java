package Assignment5;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("QUESTION 1");
		/*
		 * Write a for loop that displays the following set of numbers:
		 * 0,10,20,30,40,50,...1000
		 */

		for (int a = 0; a < 1000; a += 10) {
			System.out.print(a + ",");
		}
		System.out.println(1000);

		System.out.println("\n\nQUESTION 2");
		/*
		 * Write a program that displays all odd numbers between 3-130 in the same line
		 */

		for (int i = 3; i <= 130; i++) {

			if (i % 2 != 0) {
				System.out.print(i + " ");
			}

		}

		System.out.println("\n\nQUESTION 3");
		/*
		 * Write a program that displays the number of even numbers between 5 and 50
		 * (included)
		 */

		int c = 0;
		for (int k = 5; k <= 50; k++) {
			if (k % 2 == 0) {
				c++;
			}

		}
		System.out.println(c);

		System.out.println("\n\nQUESTION 4");
		/*
		 * Write a while loop that lets the user enter a number. The number should be
		 * multiplied by 10, and the result stored in the variable product. The loop
		 * should iterate as long as product contains a value less than 100.
		 */

		Scanner scan = new Scanner(System.in);

		int product = 0;

		while (product < 100) {
			System.out.println("Enter a number");
			int d = scan.nextInt();
			product = d * 10;
		}

		System.out.println("\n\nQUESTION 5");

		/*
		 * Print the table of 12 using for loop. Output should be in following format:
		 * 12 X 1 = 12 12 X 2 = 24 12 X 3 = 36 12 X 4 = 48 12 X 5 = 60 12 X 6 = 72 12 X
		 * 7 = 84 12 X 8 = 96 12 X 9 = 108 12 X 10 = 120
		 */

		for (int q = 1; q <= 10; q++) {
			System.out.println("12 x " + q + " = " + 12 * q);
		}

		System.out.println("\n\nQUESTION 6");
		/*
		 * Write a program to print Fibonacci series of n terms where n is declared by
		 * user : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
		 */
		System.out.println("How many fibonacci numbers will you print?");
		int n = scan.nextInt();
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + " " + num2);

		for (int w = 2; w < n; w++) {
			int num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}

		System.out.println("\n\nQUESTION 7");

		/*
		 * Write a Java program to print all the numbers between 1 and 100 (including 1
		 * and 100) which are divisible by 5.
		 */
		for (int u = 1; u >= 1 && u <= 100; u++) {
			if (u % 5 == 0) {
				System.out.print(u + " ");
			}

		}

		System.out.println("\n\nQUESTION 8");
		/*
		 * Write a program to calculate the sum of the numbers from 1 till upper bound.
		 * If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15. If upper bound is
		 * 11, sum should be 1 + 2 + ... + 11 = 66. If upper bound is 100, sum should be
		 * 1 + 2 + ... + 100 = 5050. You should use a while loop.
		 */
		int y = 1;
		int sum = 0;
		System.out.println("Enter a upper bound:");
		int upperBound = scan.nextInt();
		while (y <= upperBound) {
			sum = sum + y;
			y++;
		}
		System.out.println("Sum of numbers between 1 and " + upperBound + " = " + sum);

		System.out.println("\n\nQUESTION 9");
		/*
		 * Write a program for the following logic: Print all the odd numbers in
		 * comma-separated form from 1 till the end (you may change it): if end = 10,
		 * OUTPUT = 1, 3, 5, 7, 9 if end = 11, OUTPUT = 1, 3, 5, 7, 9, 11 You should use
		 * while loop and if-else statements. Note that, there should not be any comma
		 * after the last digit.
		 */
		System.out.println("What is the end?");
		int end = scan.nextInt();
		for (int r = 1; r < end; r++) {
			if (r % 2 != 0) {
				System.out.print(r + ",");
			}

		}
		System.out.println(end);

		System.out.println("\n\nQUESTION 10");
		/*
		 * Print following output using nested for loops: (Not finished!!!) 1 22 333
		 * 4444 55555 666666 7777777
		 */

		int row = 7;
		for (int t = 1; t <= row; t++) {
			for (int e = 1; e <= t; e++) {
				System.out.print(t);
			}
			System.out.println();
		}

		System.out.println("\n\nQUESTION 11"); // (NOT FINISHED)

		/*Print the following output using nested for loops. 

			4       3       2      1

     			3       2      1

         			2       1

              			1
*/
		for (int w = 4; w > 0; w--) {
			
			for (int tab = w; tab <4; tab++) {
				System.out.print("\t");
			}
			for (int z = w; z > 0; z--) {
				System.out.print(z + "\t\t");
			}
			System.out.println();
		}

		
		System.out.println("\n\nQUESTION 12");

		/*
		 * Print following output using nested for loops. 
		 * 1 2 3 4 5 6 7 8 9 10 
		 * 2 4 6 8 10 12 14 16 18 20 
		 * 3 6 9 12 15 18 21 24 27 30 
		 * 4 8 12 16 20 24 28 32 36 40 
		 * 5 10 15 20 25 30 35 40 45 50 
		 * 6 12 18 24 30 36 42 48 54 60 
		 * 7 14 21 28 35 42 49 56 63 70 
		 * 8 16 24 32 40 48 56 64 72 80 
		 * 9 18 27 36 45 54 63 72 81 90 
		 * 10 20 30 40 50 60 70 80 90 100
		 */

		
		 for (int er=1; er<=10; er++) { 
			 for(int mr=1; mr<=10; mr++) {
		 System.out.print(mr*er+" "); } System.out.println(); }
		 

		
		
		
		System.out.println("\n\nQUESTION 13"); // (NOT FINISHED)
		/*
		 * Print following chess board using nested for loops.
		W B W B W B W B
		B W B W B W B W
		W B W B W B W B
		B W B W B W B W
		W B W B W B W B
		B W B W B W B W
		W B W B W B W B
		B W B W B W B W

		NOTE:
		1. Total 8 rows and 8 columns.
		2. "W" and "B" are in alternate positions (row-wise or column-wise), 
		you will not find consecutive W or B.
		 */
		for(int roww=1; roww<=8; roww++) {
			for(int columnn=1; columnn<=8; columnn++) {
				if(roww%2!=0 && columnn%2!=0) {
					System.out.print("W ");
					if(roww%2!=0 && columnn%2==0) {
						System.out.print("B ");
					}
					}else if(roww%2==0 && columnn%2==0) {
						System.out.print("W ");
				}else {
					System.out.print("B ");
				}
			}System.out.println();
		}

		
		System.out.println("\n\nQUESTION 14");
		
		/* Write nested loop to draw this pattern
		##
		#  #
		#   #
		#    #
		#     #
		#      #
		#        #
		*/
		for (int ab = 0; ab < 7; ab++) {
			System.out.print("#");
			for (int bc = 0; bc < ab; bc++) {
				System.out.print(" ");
			}
			System.out.print("#");
			System.out.println();
		}
		
		
		
	}

}
