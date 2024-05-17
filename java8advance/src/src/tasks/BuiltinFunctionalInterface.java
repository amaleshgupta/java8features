package src.tasks;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltinFunctionalInterface {

	public static void main(String[] args) {
		
		Function<String, Boolean> fi=(s)->s.equals("amalesh");
		System.out.println("THIS IS COMPARISOIN OF TWO STRINGS :"  +fi.apply("gupta"));
		
		//suare the numbers
		Function<Integer, Integer> square=input->input*input;
		System.out.println("thw square value will be  :"+square.apply(10));
		
		//more functions
		Function<String, String> then=(a)->{
			System.out.println("first play cricket");
			return "";
			
		};
		
		Function<String, String> sf=b->{
			System.out.println("secondly play vollleyball");
			return "";
		};
		
		then.andThen(sf).apply("");
		System.out.println("===================");
		
		
		then.compose(sf).apply(null);
		System.out.println("+++++++++++++++++++++++++++");
		
		Function<String, Boolean> empty=input->input.equals("amalesh") || input.isBlank() || input.isEmpty();
		System.out.println(empty.apply("gupta"));;
		}
		
		
	}


