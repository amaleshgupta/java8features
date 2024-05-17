package sample;

public class sampletwo extends sampleone {
	void c() {
		System.out.println("this is method c");
	}
	void e() {
		System.out.println("this is the method e");
	}
	
	public static void main(String[] args) {
		sampletwo s=new sampletwo();
		s.c();
		s.e();
		s.b();
	}

}
