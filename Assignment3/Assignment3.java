package Assignment3;

public class Assignment3 {

	public static void main(String[] args) {
		
		//QUESTION 1
		System.out.println("QUESTION 1:");
		double liter, gallon;
		gallon=80;
		liter=gallon/0.264172;
		System.out.println(gallon + " gallon is " + liter + " liter\n");
		
		//QUESTION 2
		System.out.println("QUESTION 2:");
		String name="Murat";
		int age=25;
		System.out.println("\" Hallo, "+ name + "! Based on your input, your age is " + age + " :)\"\n");
		
		//QUESTION 3
		System.out.println("QUESTION 3:");
		double width=4.5;
		double height=7.9;
		double area=width*height;
		System.out.println("The area of a rectangle= " + area +"\n");
		
		//QUESTION 4
		System.out.println("QUESTION 4:");
		int Num1=51;
		int Num2=97;
		int Num3=Num1;
		Num1=Num2;
		Num2=Num3;
		System.out.println("N1= "+Num1+"\nN2= "+ Num2 + "\n");
		
		//QUESTION 5
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
		
		//QUESTION 6
		System.out.println("QUESTION 6:");
		int NumOfMil= 500;
		int k=10_000/500;
		System.out.println("Number of milligrams in drink: " + NumOfMil);
		System.out.println("It would take about " + k + " drinks for a lethal overdose\n");
		
		//QUESTION 7
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
