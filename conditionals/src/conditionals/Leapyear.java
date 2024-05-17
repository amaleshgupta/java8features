package conditionals;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year:");
		int num1=sc.nextInt();
		if(num1%4==0) {
			System.out.println("this is leap year:");
		}
		else {
			System.out.println("this is not leap year:");
		}
	}

}
