package stringsbufferandbuilder;

public class EqualsScenario10 {

	public static void main(String[] args) {
		String s1=new String("jav");
		String s2="java";
		s1=s1+"a";  // immutable
		
		
		if(s1==s2) {
			   System.out.println("==");
		}
		else
			   System.out.println("not==");
		if(s1.equals(s2))
			   System.out.println("equal");
		else
			   System.out.println("not equals");
		// TODO Auto-generated method stub

	}

}
