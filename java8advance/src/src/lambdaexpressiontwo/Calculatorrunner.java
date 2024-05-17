package src.lambdaexpressiontwo;

public class Calculatorrunner {
	//classic way
	public  void classic() {
		Calculator c=new Calculatorimpls();
		System.out.println("this is classic output"+c.add(10, 200));
		}
	//inner class
	public void innerclass() {
		Calculator ci=new Calculator() {
			
			@Override
			public int add(int num1, int num2) {
				
				return num1+num2;
			}
		};
		System.out.println("ths is inner class outpput: "+ci.add(10, 200)); 
		
	}
	//lambda expression
	public void lambdaexpression() {
		Calculator cz=(v1,v2)-> {return v1+v2;};
		System.out.println("this is lambda expression output:"+cz.add(10, 200));
	}
	

	public static void main(String[] args) {
		Calculatorrunner cr =new Calculatorrunner();
		cr.classic();
		cr.innerclass();
		cr.lambdaexpression();
		
	}

}
