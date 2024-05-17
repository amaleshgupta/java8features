package stringsbufferandbuilder;

public class EqualsScenario12 {
	public static void main(String[] args) {
		String s1="java";   //scp
		String s2=s1+s1;    // scp
     String		s3= "javajava"; // scp
     
     
     
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
