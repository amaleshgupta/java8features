package stringsbufferandbuilder;

public class equalsScenario5 {
	public static void main(String[] args) {
		String s1=new String("java");
		String s2=s1;  //heap memory
		s1="python";   //scp
		s2="python";   //scp in scp no new objectt will be created it wil point the s1 memory.
		if(s1==s2) {
			   System.out.println("==");
		}
		else
			   System.out.println("not==");
		if(s1.equals(s2))
			   System.out.println("equal");
		else
			   System.out.println("not equals");
		
		
		
		
		
		
	}

}
