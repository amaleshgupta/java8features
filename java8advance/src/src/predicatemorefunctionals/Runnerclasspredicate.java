package src.predicatemorefunctionals;

import java.util.function.Predicate;

public class Runnerclasspredicate {
	public static void main(String[] args) {
		
		//default predicate with and method
		Predicate<String> firstcase=input1->input1.equals("yes");
		Predicate<String> secondcase=input->input.equals("no");
		System.out.println(firstcase.and(secondcase).test("yes"));
		
		
		//default predicate with or method
		System.out.println(firstcase.or(secondcase).test("no"));
		
		//default predicate with negate method
		Predicate<Boolean> thirdcase=input2->input2;
		System.out.println(thirdcase.negate().test(true));
		
	}

}
