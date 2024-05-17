package src.lambdathree;

public class Nmaealiasrunner {
	//classsicway
	public void classicalway() {
		Inamealias in=new Namealiasimpl();
		System.out.println("firstname:"  +in.name("amalesh"));
	}
	//innerclass
	public void innerclass() {
		Inamealias in=new Inamealias() {
			
			@Override
			public String name(String print) {
				// TODO Auto-generated method stub
				return (print);
			}
		};
		System.out.println("innerclas output"  +in.name("gupta"));
	}
	//lambda expression
	public void lambdaexpression() {
		Inamealias ia=(print)-> {return "lastname:" +print;};
		System.out.println("lambda output:" +ia.name("tiger"));
	}

	public static void main(String[] args) {
		Nmaealiasrunner nr=new Nmaealiasrunner();
		nr.classicalway();
		nr.innerclass();
		nr.lambdaexpression();
		
	}

}
