package conditionals;

import java.util.Scanner;

public class Rankcard {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the tamil mark:");
		int mark1=sc.nextInt();
		System.out.print("enter the english mark:");
		int mark2=sc.nextInt();
		System.out.print("enter the maths  mark:");
		int mark3=sc.nextInt();
		System.out.print("enter the science mark:");
		int mark4=sc.nextInt();
		System.out.print("enter the social mark:");
		int mark5=sc.nextInt();
		int sum= mark1+mark2+mark3+mark4+mark5;
		int sum2=sum/5;
		if(sum2>=90) {
			System.out.println("u score the a grade");
			
		}
		else if(sum2>=70){
			System.out.println("u score b grade");
			
		}
		else if(sum2>=50){
			System.out.println("u score c grade");
			
		}
	
	else if(sum2==40){
		System.out.println("u not score any grade re-attempt");
	}
	}
}
