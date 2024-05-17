package interviewquestions;

public class Zigzag {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		printzigzag(arr);
		
	}
	public static void printzigzag(int[] arr) {
		boolean  flag = true;
		int n= arr.length;
		for(int i=0; i<n; i++) {
			if(flag)
			{
				System.out.println(arr[i]+ " ");
				
			}else
			{
				System.out.println(arr[n-i-1]+ "");
			}
			
			flag=!flag;
		}
		
		
		
		
	}

	
	
	
	
}
