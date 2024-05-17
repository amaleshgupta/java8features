package conditionals;

import java.util.Scanner;

public class Divisiblernot {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entervthe number: to chech whether it is divisible by 5 and 7 r not");
	int num1=sc.nextInt();	
	if(num1%5 == 0 && num1%7 == 0) {
		System.out.printf("this number is divisible by 5 and 7", num1);
	}
	else {
		System.out.println("this is not divisible by 5 and 7");
	}
	}
}
