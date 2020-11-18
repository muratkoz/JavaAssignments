package assignment9;

import java.util.Scanner;

public class question14_carInsurance {
	/*
	 * Question-14
Write a program that will calculate car insurance premium.
Steps to write a program:
First things first, your program should ask the customer to provide a name, so display a message: "Enter your name".
Then ask the user about ownership of the US driver's license. Display message: "Do you have a US driver license?". If the user doesn't have a US driver's license - display warning message: "Invalid data!" and stop the program (use System.exit(0) after displaying warning message to stop the program).
Then ask the user to provide a zip code. If zip code equals to 20910 or 20740, add $60 to the premium (an amount to be paid for an insurance policy).
If zip code equals to 22102 or 22103, add $30 to the premium. Otherwise, add $50 to the premium.
Then ask the user about car ownership. Display message: "Is this vehicle Owned, Financed, or Leased?". If the car is owned, add $10 to the premium, otherwise, add $20 to the premium.
Then ask the user about car usage. Display message: "How is this vehicle primarily used?". If the car used for Business, add $50 to the premium. If the car is for pleasure add $10 to the premium. If the car is for Commute - add $20 to the premium.
Then ask the user how many days per week user drives to work. Display message: "Days Driven To Work And/Or School". Add $5 to the premium for every day driven to work.
Then, ask the user about how many miles customers drive to work or school. Display message: "Miles Driven To Work And/Or School". Increase premium per $1 for every 1 mile.
Then ask the customer about his age. Display message: "How old are you?".
� � �If age is less than 16, display the message: "Invalid data!", and stop the program.
� � �If age is between 16 and 18 (exclusive), multiply premium by 20.
� � �If age is between 18 (inclusive) and 21 (inclusive), multiply premium by 6.
� � �If age is between 21 (exclusive) and 25 (exclusive), multiply premium by 2.
Then, ask the customer about the driving experience. Make sure that experience is greater than 0 and the result of subtraction age from experience is greater or equals to 16. If no, display the message: "Invalid data!" and stop the program. Reduce premium on $5 for every year of experience.
Then, ask the customer about car accidents. Display message: "Have you had any accidents in the last 5 years?". If the answer equals "Yes" or "YES", ask customer about amount of accidents. Display message: "How many?", in order to get information about the amount of accidents. Add 20% to the premium price for every accident.
Then, ask the customer if he had continuous insurance for the past 12 months. Display message: "Have you had continuous insurance for the past 12 months?". If the customer provides a negative answer (No) - double the premium.
Then ask the user about the level of education. Display message: "What is the highest level of education you have completed?".
� � �If the level of education equals to "Ph.D." or "Bachelors" or "Masters" - reduce the premium by 5%.
� � �If the level of education equals "Doctors" reduce the premium by 10%.
� � �If the level of education equals "Less than High School" increase the premium by 5%.
After all, display the message "customer, here's your quote!". Instead of the customer, you need to insert customers' name. The display message: "Start Your Policy Today For: $premium". Instead of premium, your program should print the premium's variable value. Then display the message with reference number: "Reference number: referenceNumber". In order to build reference number variable (referenceNumber), concatenate first 2 letters of customer's name, age, last 2 letters of customer's name, zip code, and level of education without spaces. This value should be all upper case!
Sample Output:

Display message: Welcome to the CountyFarm car insurance!
Display message: Enter your name
input from user: David
Display message: Do you have a US driver license?
input from user: Yes
Display message: Enter your zip code
input from user: 20910
Display message: Is this vehicle Owned, Financed, or Leased?
input from user: Owned
Display message: How is this vehicle primarily used?
input from user: Pleasure
Display message: How old are you?
input from user: 25
Display message: How many years you've been driving?
input from user: 5
Display message: Have you had any accidents in the last 5 years?
input from user: No
Display message: Have you had continuous insurance for the past 12 months?
input from user: Yes
Display message: What is the highest level of education you have completed?
input from user: PhD
Display message: David, here's your quote!
Display message: Start Your Policy Today For: $52.25
Display message: Reference number: DA25ID20910PHD
Example #2

Display message: Welcome to the CountyFarm car insurance!
Display message: Enter your name
input from user: Robin Van Bobbin
Display message: Do you have a US driver license?
input from user: No
Display message: Invalid data!
Example #3

Display message: Welcome to the CountyFarm car insurance!
Display message: Enter your name
input from user: Max Payne
Display message: Do you have a US driver license?
input from user: Yes
Display message: Enter your zip code
input from user: 20740
Display message: Is this vehicle Owned, Financed, or Leased?
input from user: Owned
Display message: How is this vehicle primarily used?
input from user: Commute
Display message: Days Driven To Work And/Or School
input from user: 5
Display message: Miles Driven To Work And/Or School
input from user: 10
Display message: How old are you?
input from user: 15
Display message: Invalid data!
	 */

	public static void main(String[] args) {
		 double premium = 0;
			int accidentsAmount = 0;
			int daysDrivenToWorkOrSchool = 0;
			int milesToWorkOrSchool = 0;
			String vehicleOwnership = "";
			String vehicleUsage = "";
			String continuousInsurance = "";
			String education = "";
			String name = "";
			String referenceNumber = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the CountyFarm car insurance!");
			System.out.println("Enter your name");
			name=scan.nextLine();
			System.out.println("Do you have a US driver license?");
			String driverLicense=scan.next();
			if(driverLicense.equalsIgnoreCase("no")) {
				System.out.println("Invalid data!");
				System.exit(0);
			}
			System.out.println("Enter your zip code");
			int zip=scan.nextInt();
			if(zip==20910 || zip==20740) {
				premium+=60;
			}else if(zip==22102 || zip==2103) {
				premium+=30;
			}else {
				premium+=50;
			}
			System.out.println("Is this vehicle Owned, Financed, or Leased?");
			vehicleOwnership=scan.next();
			if(vehicleOwnership.equalsIgnoreCase("owned")) {
				premium+=10;
			}else {
				premium+=20;
			}
			System.out.println("How is this vehicle primarily used?");
			vehicleUsage=scan.next();
			if(vehicleUsage.equalsIgnoreCase("Business")) {
				premium+=50;
			}else if(vehicleUsage.equalsIgnoreCase("Pleasure")) {
				premium+=10;
			}else if(vehicleUsage.equalsIgnoreCase("Commute")) {
				premium+=20;
				System.out.println("Days Driven To Work And/Or School");
				daysDrivenToWorkOrSchool=scan.nextInt();
				premium+=daysDrivenToWorkOrSchool*5;
				System.out.println("Miles Driven To Work And/Or School");
				milesToWorkOrSchool=scan.nextInt();
				premium+=milesToWorkOrSchool;
			}
			System.out.println("How old are you?");
			int age=scan.nextInt();
			if(age<16) {
				System.out.println("Invalid data!");
				System.exit(0);
			}else if(age>16 && age<18) {
				premium*=20;
			}else if(age>=18 && age<=21) {
				premium*=6;
			}else if(age>21 && age<=25) {
				premium*=2;
			}
			System.out.println("How many years you've been driving?");
			int driexp=scan.nextInt();
			if(driexp==0 || age-driexp<16) {
				System.out.println("Invalid data!");
			}else {
				premium-=driexp*5;
			}
			System.out.println("Have you had any accidents in the last 5 years?");
			String accident=scan.next();
			if(accident.equalsIgnoreCase("yes")) {
				System.out.println("How many?");
				accidentsAmount=scan.nextInt();
				premium+=accidentsAmount*(premium*0.2);
			}
			System.out.println("Have you had continuous insurance for the past 12 months?");
			continuousInsurance=scan.next();
			if(continuousInsurance.equalsIgnoreCase("no")) {
				premium*=2;
			}
			System.out.println("What is the highest level of education you have completed?");
			String levelOfEdu=scan.next();
			if(levelOfEdu.equals("PhD")||levelOfEdu.equals("Bachelors")||levelOfEdu.equals("Masters")) {
				premium-=premium*0.05;
			}else if(levelOfEdu.equals("Doctors")) {
				premium-=premium*0.1;
			}else if(levelOfEdu.equals("Less than High School")) {
				premium+=premium*0.05;
			}
			
			System.out.println(name+", here's your quote!");
			System.out.println("Start Your Policy Today For: $"+premium);
			referenceNumber=name.substring(0, 2).toUpperCase()+age+name.substring(name.length()-2).toUpperCase()+zip+levelOfEdu.replace(" ","").toUpperCase();
			System.out.println("Reference number: "+referenceNumber);
	    

	}

}
