package bipredicate;

import java.util.function.BiPredicate;

public class Runner {

	public static void main(String[] args) {

		BiPredicate<String, String> pred1=(input1,input2)->{
			return input1.length()>0;
		};
		System.out.println(pred1.test("", "gupta"));

		BiPredicate<String, String> pred2=(string1,string2)->string1.equals(string2);
		System.out.println(pred2.test("amalesh", "AMALESH"));

		BiPredicate<String, String> pred3=(value1,value2)->value1.equalsIgnoreCase(value2);
		System.out.println(pred3.test("amalesh", "AMALESH"));
	}

}
