package src.tasks;

public class Runnerclass {
	
	public static void main(String[] args) {
		
		
// using ivechile interface with  lambda expressions in 
		
	Ivechhileable iv=()-> System.out.println("this is lambda expression");	
	iv.car();

//using return statement with lambda expression
	Ihyundai ih=(name)-> {return name;};
	System.out.println("this is lambda with return statement:"  +ih.st("amalesh"));
	
//using return statement with two arguments with lambda expression
	
	Imaruthi im=(a,b)->{return a+b;};
	System.out.println("this is add of two number:"  +im.add(100, 200));
	
	}

}
