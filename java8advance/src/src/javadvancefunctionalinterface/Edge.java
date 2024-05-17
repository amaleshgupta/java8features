package src.javadvancefunctionalinterface;

public class Edge implements Imanageable{

	//in this program default method will be over-riden .and output will from child edge class.
	@Override
	public void mediaplayer() {
		System.out.println("this is edge media player");
	}
	
	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("EDGE BROWSER");
	}
	public static void main(String[] args) {
		Imanageable Edge =new Edge();
		Edge.mediaplayer();
	}
	

}
