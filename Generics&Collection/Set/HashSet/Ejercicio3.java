package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Formas de iterar a través de HashSet: 
 * 1) Usando Iterator 
 * 2) Sin uso de Iterator
 * @author mromo
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) { 
		// Create a HashSet
		HashSet<String> hset = new HashSet<String>();
		//add elements to HashSet 
		hset.add("Chaitanya");
		hset.add("Rahul");
		hset.add("Tim"); 
		hset.add("Rick");
		hset.add("Harry");
		Iterator<String> it = hset.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next()); 
		} 
		Set<String> hset2 = new HashSet<String>();
		//add elements to HashSet 
		hset2.add("Chaitanya");
		hset2.add("Rahul"); 
		hset2.add("Tim"); 
		hset2.add("Rick"); 
		hset2.add("Harry");
		for (String temp : hset2) { 
			System.out.println(temp);
		}
	}
	
}
