package assignment9;

public class question9_swappingNames {
	/*
	 * Question-9
In this task, you need to swap the first name with the last name in the email. If the email doesn't contain underscore - do not anything.
Sample Output:
     input: mike_tyson@gmail.com
     output: tyson_mike@gmail.com
     input: barakobama@gmail.com
     output: barakobama@gmail.com
	 */

	public static void main(String[] args) {
		String email = "murat_koz@gmail.com";
		if(email.contains("_")) {
		String name = email.substring(0, email.indexOf('_'));
		String lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
		email=lastName+"_"+name+email.substring(email.indexOf('@'));
		}
		System.out.println(email);
	}

}
