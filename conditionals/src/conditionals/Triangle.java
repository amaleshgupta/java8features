package conditionals;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the three triangles");
		int angle1=sc.nextInt();
		int angle2=sc.nextInt();
		int angle3=sc.nextInt();
		int sum= angle1+angle2+angle3;
		if(sum==180 && sum>0 && sum>0) {
			System.out.println("this is triangle");
			
		}
		else {
			System.out.println("this is not triangle");
		}
	}

}
