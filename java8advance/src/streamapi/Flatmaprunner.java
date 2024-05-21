package streamapi;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collectors;

public class Flatmaprunner {
	
	static List<Flatmap> packages=null;

	public static void main(String[] args) {
		
		Flatmap ft1=new Flatmap("masala items", Arrays.asList("chicken masala","mutton masala"));
		Flatmap ft2=new Flatmap("masala items",Arrays.asList("curry masala","briyani masala"));
		
		packages=Arrays.asList(ft1,ft2);
		display();
		System.out.println("after using map");
		System.out.println("++++++++++++++++++++++");
		mapdisplay();
		System.out.println("after using flap map");
		System.out.println("+++++++++++++++++++++++");
		flatmapdisplay();
	
	

	}
	public static void mapdisplay() {
		//convert it in to the stream
		List<List<String>>	output=packages.stream()
			.map(Flatmap::getItems)
			.collect(Collectors.toList());
		output.forEach(System.out::println);
	}
	public static void  flatmapdisplay() {
		List<String> output2=packages.stream()
		.map(Flatmap::getItems)
		.flatMap(List::stream)
		.collect(Collectors.toList());
		System.out.println(output2);
		
		output2.forEach(System.out::println);
	}
	public static void display() {
		System.out.printf("| %-15s | %-15s |%n",
				"name", "items");

		for (Flatmap ft:packages) {
			System.out.printf("| %-15s | %-15s |%n",ft.getName(),ft.getItems());

		}
	}

}
