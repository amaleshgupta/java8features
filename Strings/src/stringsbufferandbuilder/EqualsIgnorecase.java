package stringsbufferandbuilder;

public class EqualsIgnorecase {

	public static void main(String[] args) {
		String s1=new String("iupta");
		String s2=new String("JAVA");
		int s3=s1.compareTo(s2);  // it will compare both words in the format of lexigography(dictionary r alphabet)
		                          //and give the result in -ve 0 ve
		System.out.println(s3);
		
		
		int s4=s1.compareToIgnoreCase(s2);
		System.out.println(s4);// TODO Auto-generated method stub

	}

}
