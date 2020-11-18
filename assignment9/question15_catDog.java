package assignment9;

public class question15_catDog {
	/*
	 * Question-15
Print true if the string "cat" and "dog" appear the same number of times in the given string word.
Sample Output:
     input: catdog
     output: true
     input: catcat
     output: false
     input: cat-cheetah-dog-cat
     output: false
	 */

	public static void main(String[] args) {
		String catDog="catcatdogdog";
		int dogCounter=0;
		int catCounter=0;
		for(int i=0; i<catDog.length()-2;i++) {
			if(catDog.substring(i, i+3).equalsIgnoreCase("dog")) {
				dogCounter++;
			}
			if(catDog.substring(i, i+3).equalsIgnoreCase("cat")) {
				catCounter++;
			}
		}
		System.out.println(catCounter==dogCounter);
	}

}
