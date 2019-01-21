package HashSet;

import java.util.HashSet;

public class Ejercicio1 {

	public static void main(String[] args) { 
		// Crea un HashSet 
		HashSet<String> hset = new HashSet<String>();
		//add elementos a HashSet 
		hset.add("Abhijeet"); 
		hset.add("Ram"); 
		hset.add("Kevin"); 
		hset.add("Singh"); 
		hset.add("Rick"); 
		// Duplicidad eliminada 
		hset.add("Ram");
		// Displaying HashSet 
		System.out.println("HashSet contiene: "); 
		for(String temp : hset){ 
			System.out.println(temp);
		}
	}
	
	
}
