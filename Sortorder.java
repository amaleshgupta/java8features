package datastoring;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Sortorder {

	public static void main(String[] args) {
		
		int[] arr=new int[] {1,2,3,4,5};
		int temp=0;
		
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
					
				}
				
			}
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println("this is desending order "+arr[i]);
			}
		}
				
				
		
		
	}


