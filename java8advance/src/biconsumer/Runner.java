package biconsumer;

import java.util.function.BiConsumer;

public class Runner {
	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> output1=(num1,num2)->System.out.println(num1+num2);
		//output1.accept(1, 2);
		
		BiConsumer<Integer, Integer> output2=(num1,num2)->System.out.println(num1*num2);
		//output2.accept(1, 2);
		
		//biconsumer default function
		output2.andThen(output1).accept(1, 2);;
		
	}

}
