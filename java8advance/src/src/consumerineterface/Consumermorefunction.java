package src.consumerineterface;

import java.util.function.Consumer;

public class Consumermorefunction {
	public void data() {
	 
	Consumer<Integer> consint=(a)->{System.out.println(a);};
	consint.accept(10);
	 
	
	Consumer<String> consst=(input)->System.out.println(input);
	consst.accept("amalesh");
	
	consint.andThen(consint).accept(10);;
	
	
	}
	
	
	
	public static void main(String[] args) {
		Consumermorefunction cmf=new Consumermorefunction();
		cmf.data();
	}
}