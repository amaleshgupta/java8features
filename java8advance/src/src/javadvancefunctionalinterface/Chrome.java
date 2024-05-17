package src.javadvancefunctionalinterface;

public class Chrome implements Imanageable{

	// in this child program default method could not override.it displays the parent class output.
	
	public static void main(String[] args) {
		Imanageable Chrome = new Chrome();
				Chrome.mediaplayer();
			
			
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("chrome browser");
	}

}
