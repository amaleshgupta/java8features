package stringsbufferandbuilder;

public class EqualsScenario8 {
	public static void main(String[] args) {
		String s1=new String("java");  //heap memory
		String s2=s1;     //heap memory
		
		
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
