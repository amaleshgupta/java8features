package src.supplier_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Runner {


	public static void main(String[] args) {

		List<Constructorclass> contp= new ArrayList<Constructorclass>();

		contp.add(new Constructorclass("amalesh", 495));
		contp.add(new Constructorclass("gupta", 485));
		contp.add(new Constructorclass("amaleshgupta", 500));
		
		Supplier<List<Constructorclass>> output=()-> contp;
		System.out.println(output.get());
		System.out.println("+++++++++++++++++++++++++++++");
		
		
//consumer interface output
		contp.forEach((input)->System.out.println(input));
		
//predicate output refer previous programs. predicate returns boolean value only.
		//keep it  mind.

	}

}
