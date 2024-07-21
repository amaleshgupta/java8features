package datastoring;

import java.util.Iterator;

public class Nonstaticmethods {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		//method1(arr);
		Nonstaticmethods ns=new Nonstaticmethods();
		ns.method1(arr);
	}
	
	
	public  void method1(int arr[])
	
	{
		int i=0;
		for(i=0;i<arr.length;i++) {
			System.out.println("this is non static method"+ arr[i]);
		}
		
	}

}

