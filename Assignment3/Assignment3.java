package Assignment3;

public class Assignment3 {

	public static void main(String[] args) {
		
		/*QUESTION 1
		Write a program to convert gallons into Liters and display it.
        Sample output:
        15 gallon is 56.7812 liter*/
		System.out.println("QUESTION 1:");
		double liter, gallon;
		gallon=80;
		liter=gallon/0.264172;
		System.out.println(gallon + " gallon is " + liter + " liter\n");
		
		/*QUESTION 2
		Write a program - > Declare variables for your name and birth year, and the program will display:
		" Hello, Ozzy! Based on your input, your age is 15 :) "*/
		System.out.println("QUESTION 2:");
		String name="Murat";
		int age=25;
		System.out.println("\" Hallo, "+ name + "! Based on your input, your age is " + age + " :)\"\n");
		
		/*QUESTION 3
		Write a Java program that displays the area of a rectangle with a width of 4.5 and a height of 7.9 using the following formula:
		area = width * height*/
		System.out.println("QUESTION 3:");
		double width=4.5;
		double height=7.9;
		double area=width*height;
		System.out.println("The area of a rectangle= " + area +"\n");
		
		/*QUESTION 4
		Declare 2 variables (Num1, Num2)
		Swap values between Num1 and Num2
		Display new values of Num1 and Num2
		Sample output:
		n1=10
		n2=20
		----------
		n1=20
		n2=10*/
		System.out.println("QUESTION 4:");
		int Num1=51;
		int Num2=97;
		int Num3=Num1;
		Num1=Num2;
		Num2=Num3;
		System.out.println("N1= "+Num1+"\nN2= "+ Num2 + "\n");
		
		/*QUESTION 5
		Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

-Declare int variables inputSeconds, hours, minutes, seconds
-Initialize the inputSeconds

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result

       Sample Output:

       inputSecond is 3695

      1 hours, 1 minutes, and 35 seconds*/
		System.out.println("QUESTION 5:");
		int inputSeconds,hours, minutes,seconds;
		inputSeconds=3695;
		seconds=inputSeconds%60;
		minutes=inputSeconds/60;
		minutes=minutes%60;
		hours=inputSeconds/60;
		hours=hours%60;
		System.out.println("inputSecond is " + inputSeconds);
		System.out.println(hours + " hours, " + minutes + " minutes and " + seconds + " seconds\n");
		
		/*QUESTION 6
		Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person.

       Sample Output

      Number of milligrams in drink: 500
      It would take about 20 drinks for a lethal overdose*/
		System.out.println("QUESTION 6:");
		int NumOfMil= 500;
		int k=10_000/500;
		System.out.println("Number of milligrams in drink: " + NumOfMil);
		System.out.println("It would take about " + k + " drinks for a lethal overdose\n");
		
		/*QUESTION 7
		Write a program that determines the change to be dispensed from a vending machine. An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments (25, 30, 35, . . . , 90, 95, or 100), and the machine accepts only a single dollar bill to pay for the item.

      Sample output

      Price in cents : 95

      Your change is 0 quarters, 0 dimes, and 1 nickles*/
		System.out.println("QUESTION 7:");
		int price, change, quarter, dime, nickle;
		price= 95;
		change= 100-price;
		quarter= change/25;
		dime= (change-quarter*25)/10;;
		nickle= (change-(quarter*25 + dime*10))/5;
		System.out.println("Price in cents: " + price);
		System.out.println("Your change is " + quarter + " quarters, " + dime + " dimes " + nickle + " nickles");		
		
	
		}

}
