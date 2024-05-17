package stringsbufferandbuilder;

public class EqualsScenario7 {
	public static void main(String[] args) {
		String s1=new String("java");  // heap memory
		String s2=s1; // heap memory
		s1=new String("python");  // new object in heap memory
		s2=new String("python");  // new object in heap memory
		 String s3=new String (s1); // // new object in heap memory.not point the s1 object .
		 
		 if(s3==s2) {
			   System.out.println("==");
		}
		else
			   System.out.println("not==");
		if(s3.equals(s2))
			   System.out.println("equal");
		else
			   System.out.println("not equals");
		 
		 
		 
	}

}
