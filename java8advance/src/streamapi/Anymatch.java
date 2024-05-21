package streamapi;

import java.util.Arrays;
import java.util.List;

public class Anymatch {

	public static void main(String[] args) {
		
		List<String> list1=Arrays.asList("amalesh","gupta","amalesh");
		
		//using any match function it will returns the true if any string matches
		//in the list else return false
		//this is short circuit terminal method that means
		//it the match value is the 1st position means,after the balance values it will ignored.did not moves further
		
		boolean result=list1.stream()
		.anyMatch((string)->string.equalsIgnoreCase("amalesh"));
		
		System.out.println(result);
		

	}

}
