package src.javadvancefunctionalinterfacewithmultipleinheritance;

public class Yourchoicecourse implements Icourseable,Mcourseable {
	public void fullstack(){
		Icourseable.super.fullstack();
		
		Mcourseable.super.fullstack();
		
		System.out.println("became a backend developer");
	}
	public static void main(String[] args) {
		Icourseable ic= new Yourchoicecourse();
		ic.fullstack();
		
	}

	
}
