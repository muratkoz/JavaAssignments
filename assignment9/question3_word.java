package assignment9;

public class question3_word {
	/*
	 * Question-3
You have a word, do the following:
1. When word has odd number of characters and:
     - 3 or more characters, print middle letter
              oak ==> a
              javav ==> v
     - Single character, print that character 3 times
             # ==> ###
             q ==> qqq
2. When word has even number of characters and:
     - 4 or more characters, print middle 2
            java ==> av
            apples ==> pl
            #$%^&* ==> %^
    - 2 characters, print those 2 characters twice
           @@ ==>@@@@
           $$ ==>$$$$
           hi ==> hihi
	 */

	public static void main(String[] args) {
		String word="A String";
		if(word.length()%2!=0) {
			if(word.length()>=3) {
				System.out.println(word.charAt(word.length()/2));
				}else {
					for(int i=1; i<=3; i++) {
						System.out.print(word);
					}
				}
		}else if(word.length()%2==0) {
			if(word.length()>=4) {
				System.out.println(""+word.charAt(word.length()/2-1)+word.charAt(word.length()/2));
			}else {
				System.out.print(word+word);
			}
		}

	}

}
