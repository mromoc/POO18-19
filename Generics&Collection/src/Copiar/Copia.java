package Copiar;

/**
 * 
 * Forma para copiar un conjunto a otro conjunto. En este ejemplo, estamos copiando 
 * un HashSet a otro HashSet, sin embargo, puede usar cualquier otro conjunto como 
 * TreeSet, LinkedHashSet, etc. de la misma manera que se muestra a continuación.
 * 
 */
import java.util.HashSet;

public class Copia {

	
	public static void main(String[] args) { 
		// Create a HashSet 
		HashSet<String> hset = new HashSet<String>();
		//add elementos a HashSet
		hset.add("Element1"); 
		hset.add("Element2"); 
		hset.add("Element3"); 
		System.out.println("Set antes de addAll:"+ hset);
		// Crea otro HashSet 
		HashSet<String> hset2 = new HashSet<String>();
		hset2.add("Item1");
		hset2.add("Item2");
		// Copying un Set a otro 
		hset.addAll(hset2);
		System.out.println("Set después de addAll:"+ hset); }
	
}
