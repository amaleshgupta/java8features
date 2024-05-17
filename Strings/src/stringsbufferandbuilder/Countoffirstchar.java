package stringsbufferandbuilder;

public class Countoffirstchar {
	public static void main(String[] args) {
		String s="amaleshaaaaa";
		char first=s.charAt(0);
		int count=0;
		for(int i=0; i<=s.length()-1 ; i++) {
			if(first == s.charAt(i)) 
				count++;
			
			
		}
		System.out.println("total num of count: " +count );
	}

}
