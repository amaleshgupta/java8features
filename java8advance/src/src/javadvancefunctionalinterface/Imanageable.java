package src.javadvancefunctionalinterface;


@FunctionalInterface


public interface Imanageable {
	void browse();
	default void mediaplayer() {
		System.out.println("this is mediaplayer update");
	}
	
	

}
