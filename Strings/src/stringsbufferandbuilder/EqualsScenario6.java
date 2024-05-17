package stringsbufferandbuilder;

public class EqualsScenario6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("java"); //heap memory
		String s2=s1;                 // point the s1 heap memory
		s1=new String("python"); // created new object in heap memory
		s2=new String("python"); // created new object in heap memory
		
		
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
