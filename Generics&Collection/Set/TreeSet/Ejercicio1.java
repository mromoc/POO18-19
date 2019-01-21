package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Ejercicio1 {

	
	public static void main(String[] args) { 
		// Crea un TreeSet
		TreeSet<String> tset = new TreeSet<String>();
		//add elementos a TreeSet 
		tset.add("Abhijeet"); 
		tset.add("Ram"); 
		tset.add("Kevin"); 
		tset.add("Singh"); 
		tset.add("Rick"); 
		// Duplicate removed 
		tset.add("Ram");
		// Displaying TreeSet elementos 
		System.out.println("TreeSet contiene: "); 
		for(String temp : tset){ 
			System.out.println(temp);
		}
		System.out.println("TreeSet contiene: "); 
		Iterator<String> itr=tset.iterator(); 
		while(itr.hasNext()){
			System.out.println(itr.next()); 
		}
	}
	
}
