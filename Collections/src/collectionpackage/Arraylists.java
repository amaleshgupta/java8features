package collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylists {
public static void main(String[] args) {
	ArrayList<String> l=new ArrayList<String>();
	l.add("amalesh");
	l.add("gupta");
	l.add("vinoth");
	l.add("boobalan");
	System.out.println(l);
	
	// using iterator with while
	Iterator it = l.iterator(); 
	while(it.hasNext()){
		System.out.println(it.next());
	}
	//iterator using with foreach
	for(String name:l)
	{
		System.out.println(name);
		
	}	
System.out.println("using get method"+l.get(2));
    l.set(2,"kumar");
}
}
