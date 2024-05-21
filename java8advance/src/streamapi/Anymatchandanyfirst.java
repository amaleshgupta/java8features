package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Anymatchandanyfirst {
	
	
	
	public static void findfirst() {
		
		List<String> list1=Arrays.asList("amal","gupta","amaleshgupta");
		Optional<String> output1=list1.stream().findFirst();
		System.out.println(output1.get());
		
		//when we use parallel stream 99% gives first value only
		//for get() method we will discuss in comming chapters
		Optional<String> output4=list1.stream().findFirst();
		System.out.println(output4.get());
		System.out.println("___________________________-");
		
	}
	public static void findany() {
		List<String> list1=Arrays.asList("amal","gupta","amaleshgupta");
		Optional<String> output2=list1.stream().findAny();
		System.out.println(output2.get());
		
		//when we using parallel stream the output will comes any  value
		Optional<String> output3=list1.parallelStream().findAny();
		System.out.println(output3.get());
		
		
	}

	public static void main(String[] args) {
		
		findfirst();
		findany();

	}

}
