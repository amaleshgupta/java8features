package src.consumerineterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Foreachfuction {

	public static void main(String[] args) {
		
		
		List<Integer> list =Arrays.asList(1,2,3,4,5);
		//using for each function from 1.8
		
		// for using for each function we must need consumer interface
		
		Consumer<Integer> output=(input)->System.out.println(input);
		//method 1 display the output
		list.forEach(output);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		//method 2 for outpput dislpay
		list.forEach((input)->System.out.println(input));
		

	}

}
