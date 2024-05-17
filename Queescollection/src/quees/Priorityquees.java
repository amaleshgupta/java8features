package quees;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityquees {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		pq.add("hp");
		pq.add("lenovo");
		pq.add("dell");
		//System.out.println(pq.element());
		//System.out.println(pq.peek());
		Iterator it =pq.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
	}

}
