package assignment9;

public class question12_withoutX {
	/*
	 * Question-12
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars, otherwise print the string unchanged.
Sample output:
     input: xHiX
     output: Hi
     input: apple
     output: apple
     input: xUxL
     output: UxL
     input: JavaX
     output: Java
	 */

	public static void main(String[] args) {
		String sample="xXHelloXxx";
		if(sample.substring(0,1).equalsIgnoreCase("x")) {
			sample=sample.substring(1);
		}
		if(sample.substring(sample.length()-1).equalsIgnoreCase("x")) {
			sample=sample.substring(0,sample.length()-1);
		}
		System.out.println(sample);

	}

}
