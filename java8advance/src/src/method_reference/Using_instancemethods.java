package src.method_reference;

public class Using_instancemethods {
	
	//instance method
	public void instance(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public  String  arbitarymethod(String name) {
		return name;
	}

	public static void main(String[] args) {
	
		//method reference using instance method
		/* instance method use panrathuku object reference  :: method avlothan*/
		
		Using_instancemethods us=new Using_instancemethods();
		add a2=us::instance;
		a2.sum(10, 20);
		
		
		
		
		
	}

}
