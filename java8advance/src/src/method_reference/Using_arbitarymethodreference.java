package src.method_reference;

import java.util.function.Function;

public class Using_arbitarymethodreference {

	public static void main(String[] args) {
		
		//using arbitary method refernce
		/* length() method string class la iruku
		 * so antha method oda  class name::method name avli than
		 * hint-- method ku () paranthesis kuduka kodathu. 
		 * */
		Function<String, Integer> output1=String::length;
		System.out.println(output1.apply("amalesh"));
		
		// i have a doubt namba coru class la oru method vachi irukom 
		//antha method ah arbitary method la use panna mudiyuma.
		
		
		//instance method using for function interface
		Using_instancemethods us1=new Using_instancemethods();
		
		Function<String, String> output2=us1::arbitarymethod;
		System.out.println(output2.apply("amalesh gupta"));
		
		

	}

}
