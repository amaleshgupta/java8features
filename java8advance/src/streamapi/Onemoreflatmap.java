package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Onemoreflatmap {

	public static void main(String[] args) {
		
		List<String> fsd8=Arrays.asList("amalesh","viinoth","devi","prasath");
		List<String> fsd7=Arrays.asList("bala","dinesh","lenet","tamil","boobalan");
		
		List<List<String>> totalmembers=Arrays.asList(fsd8,fsd7);
		
		System.out.println(totalmembers);
		
		System.out.println("+++++++++++++after flatmap+++++++++");
		
		List<String> output=totalmembers.stream()
		.flatMap(List::stream)
		.collect(Collectors.toList());
		System.out.println(output);
		
		output.forEach(System.out::println);
		
		

	}

}
