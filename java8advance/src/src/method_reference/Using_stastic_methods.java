package src.method_reference;

public class Using_stastic_methods {
	
	//using  static methods
	public static void addition(int a,int b) {
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		
		
		//using static methods to interface methods intha class la irukra static methods 
		//ah reference ah eduthuko nu kudrathu than method reeference
		/*condition 1: class method/inferface method arguments um same ah irukanum 
		 * means rendu parameter iruntha ithulayum rendu parameter irukanum */
		
		add a1= Using_stastic_methods::addition;
		a1.sum(10, 20);
	}
	

}
