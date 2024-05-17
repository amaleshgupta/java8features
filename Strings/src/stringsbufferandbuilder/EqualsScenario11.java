package stringsbufferandbuilder;

public class EqualsScenario11 {
	public static void main(String[] args) {
		String s1="jav";  //scp
		String s2="java"; //scp
		s1= s1+"a"; //scp // "jav"+"a"; it will created the new object in scp. not pointed the--
		                  // ------s1="jav" memory
		                  // IF WE give s1="jav"+"a"  == operator gives the equal. 
		// s1 value yethuvaga venumna koda iruklam athu changealbe ex-s1= "python" nu koda
		// --iruklam .so not equal nu varum. s1= "jav" +"a" ippo jvm ku compile time la ye 
		// --theriyum java apdinu athe scp la java nu vera yethavathu irukanu check panni map pannidum.
		
		
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
