package day14;

public class day14_Methods_Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringTimes("Hi",-78);
		love6(1849,1843);
		specialEleven(75);
		deerPlay(95,true);
		caughtSpeeding(86,true);
		cigarParty(70, true);
		
		
	}
	//Question 6
	public static void cigarParty(int cigar, boolean weekend) {
		System.out.println("\nQuestion 6");
		// TODO Auto-generated method stub
		if(weekend==true && cigar>=40) {
				System.out.println(true);
		}else if(weekend==false && cigar>=40 && cigar<=60) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}//Question 5
	public static void caughtSpeeding(int speed, boolean birthday) {
		// TODO Auto-generated method stub
		System.out.println("\nQuestion 5");
		if(birthday) {
			if(speed<=65){
				System.out.println(0);
			}else if(speed>65 && speed<=85) {
				System.out.println(1);
			}else if(speed>85) {
				System.out.println(2);
			}
		}else {
			if(speed<=60){
				System.out.println(0);
			}else if(speed>60 && speed<=80) {
				System.out.println(1);
			}else if(speed>80) {
				System.out.println(2);
			}
		}
		
		
	}//Question 4
	public static void deerPlay(int degree, boolean isSummer) {
		System.out.println("\nQuestion 4");
		// TODO Auto-generated method stub
		if(isSummer){
			if(degree>=60 && degree<=100) { 
			System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}else{
			if (degree>=60 && degree<=90) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
	}
	//Question 3
	public static void specialEleven(int eleven) {
		System.out.println("\nQuestion 3");
		// TODO Auto-generated method stub
		
	if(eleven%11==0 || eleven%11==1) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
		
	}
	//Question 2
	public static void love6(int love,int love2) {
		System.out.println("\nQuestion 2");
		// TODO Auto-generated method stub
		if(love==6 || love2==6) {
			System.out.println(true);
		}else if(love!=6 || love2!=6) {
			if(love+love2==6) {
				System.out.println(true);
			}else if(love-love2==6) {
				System.out.println(true);
			}else if(love2-love==6) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
		
		
	}
	//Question 1
	public static void stringTimes(String a, int i) {
		System.out.println("\nQuestion 1");
		// TODO Auto-generated method stub
		if(i>0) {
		for(int num=1;num<=i;num++) {
			System.out.print(a);
		}
		System.out.println();
		}else {
			System.out.println("Invalid number");
		}
	}
	
	

}
