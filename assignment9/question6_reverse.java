package assignment9;

public class question6_reverse {
	/*
	 * Question-6
Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If the word is shorter, display message: "Too short!". If the word is longer, display the message: "Too long!". Otherwise, reverse this word and print out the result into the console.
Sample Output:
     input: cat
     output: Too short!

     input: singularity
     output: Too long!

     input: apple
     output: elppa
	 */

	public static void main(String[] args) {
		String word="apple";
		if(word.length()<5)
			System.out.println("too short");
		else if(word.length()>5)
System.out.println("too long");
		else {
			String reverse="";
			for(int i=word.length()-1;i>=0;i--) {
				reverse+=""+word.charAt(i);
			}
			System.out.println(reverse);
		}

	}

}
