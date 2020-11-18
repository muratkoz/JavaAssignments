package assignment9;

public class question5_merge {
	/*
	 * Question-5
You have 2 words, both of them have 3 characters. If either of them does not have exactly 3 characters, print "cannot merge" Merge their characters one by one and print together like below:
Sample Output:
     aok
     lol
     alookl
     ear
     pie
    epaire
    java
    wow
    cannot merge
	 */

	public static void main(String[] args) {
		String word1="one";
		String word2="two";
		if(word1.length()!=3 || word2.length()!=3) {
System.out.println("cannot merge");
		}else {
		String merge="";
		for(int i=0; i<3; i++) {
			merge+=""+word1.charAt(i)+word2.charAt(i);
		}
		
		System.out.println(merge);
		}
		}

}
