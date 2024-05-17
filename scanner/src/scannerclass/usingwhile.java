package scannerclass;

import java.util.Scanner;

public class usingwhile{
	int i=0;
	//int n;
	public static void main(String[] args) {
		
		
		
		System.out.println("enter the int num");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		usingwhile us =new usingwhile();
         while(us.i <= n){
        	 System.out.println("printing the stars *");
        	 n--;
			
		}
	
}

}
