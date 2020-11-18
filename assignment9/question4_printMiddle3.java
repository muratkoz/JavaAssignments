package assignment9;

public class question4_printMiddle3 {
	/*
	 * Question-4
You have a word, do the following:
If the word has odd number of characters and has 5 or more characters, print the middle three characters of the word. Otherwise, print "invalid".
Sample Output:
       fifteen ==> fte
       apple ==> ppl
       hey ==> invalid
       java ==> invalid
      whatsup ==> ats
      $ ==> invalid
	 */

	public static void main(String[] args) {
		String word="seven";
if(word.length()%2!=0 && word.length()>=5) {
	int middle=word.length()/2;
	System.out.println(word.substring(middle-1, middle+2));
}else {
	System.out.println("invalid");
}
	}

}
