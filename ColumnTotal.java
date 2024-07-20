package datastoring;

import java.util.Scanner;

public class ColumnTotal {
	public static void main(String[] args) {
		//int row=0;
		//int col=0;
		int arr[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the array values");
		int row=0;
		while( row<3) {
			int col=0;
			while(col<3) {
				
				arr[row][col]=sc.nextInt();
				col++;
			}
			row++;
		}
		//row++;

	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.println("the array values"+ arr[i][j]);
		}
		
	}
		
	}

}
