package conditionals;

import java.util.Scanner;

public class OddrEven {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUM TO CHECH WHTHER odd r even");
		int num1=sc.nextInt();
		if(num1%2==0) {
		System.out.println("this is even number");
		
		}
		else {
			System.out.println("this is o dd number");
		}
	}
	
}
