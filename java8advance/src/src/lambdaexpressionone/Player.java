package src.lambdaexpressionone;
//lambda using
public class Player {
	public void ubsinglambdaexpression() {
		Igameable cricket=()-> System.out.println("this is the lambda");
		cricket.play();
	}
	//anonymous inner class
	public void  football() {
		Igameable cricket=new Cricket() {
			public void play() {
				System.out.println("this is inner class");
			}
			
		};
		cricket.play();
	}
	//classical way
	public void tennis() {
		Igameable ig =new Cricket();
		ig.play();
	}

	public static void main(String[] args) {
		
		Player p=new Player();
		p.ubsinglambdaexpression();
		p.football();
		p.tennis();

	}
}