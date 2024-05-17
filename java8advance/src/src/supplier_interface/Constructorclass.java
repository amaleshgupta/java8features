package src.supplier_interface;

public class Constructorclass {
	
	private String name;
	private int totalmark;
	
	
	public Constructorclass(String name, int totalmark) {
		
		this.name=name;
		this.totalmark=totalmark;
		}


	public String getName() {
		return name;
	}


	public int getTotalmark() {
		return totalmark;
	}
	
	public String toString() {
		return ("name :  "+getName() +   "  percentage :"  +getTotalmark());
	}

}
