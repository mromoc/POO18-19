package HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 * Al tratar con HashSet, podemos encontrar una situación en la que tenemos que ordenarlo de forma explícita. 
 * Para ello, necesitamos escribir una lógica para ordenarlos cuando sea necesario. En este artículo vamos 
 * a ver un ejemplo en el que estamos ordenando un HashSet usando dos métodos diferentes.
 * @author mromo
 *
 */
public class Ejercicio2 {

	public static void main(String args[]) {
		HashSet<String> fruits = new HashSet<String>();
		fruits.add("Orange"); 
		fruits.add("Apple"); 
		fruits.add("Banana"); 
		fruits.add("Guava");
		fruits.add("Pear");
		System.out.println("HashSet elements before sorting: "+fruits);
		// Method 1: Sorting HashSet using List interface 
		List<String> fruitList = new ArrayList<String>(fruits); 
		Collections.sort(fruitList);
		// Displaying list 
		System.out.println("HashSet elements after sorting: "+fruitList);
		// Method 2: Sorting using TreeSet 
		TreeSet<String> tset = new TreeSet<String>(fruits); 
		System.out.println("HashSet elements after using TreeSet: "+tset);}
}
