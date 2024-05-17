package stringsbufferandbuilder;

public class Equalsscnario3 {
	public static void main(String[] args) {
		
	
	String s1=new String("java");
	String s2=s1;
	s2="java"; //string constant pool
	
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
