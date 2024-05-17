package stringsbufferandbuilder;

public class EqualsScenario9 {
	public static void main(String[] args) {
		String s1=new String("java"); // heap memory
		String s2="java";   //String constant pools
		s1=null; //it will disconnected the object which could be pointed in the heap memory
		         // it will throws the null pointer exception bcz need to check the equals means 
		         //s1---need to memory reference it could not pointed any memory i heap r scp.
		         // s1 will be compares to the s2.
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
