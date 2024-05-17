package src.bifunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Runner {

	public static void main(String[] args) {


		BiFunction<String, String, String> bif=(firstname , lastname)->firstname +" "+ lastname;
		System.out.println(bif.apply("amalesh", "gupta"));

		BiFunction<Integer,Integer, Integer> result=(a,b)->(a+b)/2;
		System.out.println(result.apply(10,20));



		List<String> list1=Arrays.asList("bat","super","wonder");
		List<String> list2=Arrays.asList("man","man","women");
		List<String> supers= new ArrayList<String>();
		BiFunction<List<String>,List<String>, List<String>> addinglist=
				(name1,name2)->{
					for(int i=0;i<list1.size();i++) {
						supers.add(list1.get(i)+list2.get(i));

					}
					return supers;
				};
        System.out.println(addinglist.apply(list1, list2));
	}

}
