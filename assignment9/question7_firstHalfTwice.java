package assignment9;

public class question7_firstHalfTwice {
	/*
	 * Question-7
Write a program that will print out the first half of the word twice.
Sample Output:
     input: java
     output: jaja
	 */

	public static void main(String[] args) {
		String word = "java";
		System.out.print(word.substring(0, word.length() / 2).concat(word.substring(0, word.length() / 2)));

	}

}
