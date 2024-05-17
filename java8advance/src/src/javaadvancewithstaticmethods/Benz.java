package src.javaadvancewithstaticmethods;

public class Benz implements Icar{
	//start method ovverride agala intha cklaSS BENZ ODDA START METHOD ITHU
	public static void start() {
		System.out.println("this is implemented child output");
	}
	
	
	
	public static void main(String[] args) {
		//object vachi call pannalum intha start static method call panna mudiuyathu
		Icar c= new Benz();
		//c.start();
		//interface class name + static method name call panna work agum
		Icar.start();
		Benz.start();
	}

}
