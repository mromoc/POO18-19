package HashMap;

import java.util.HashMap;

/**
 * 
 * En este ejemplo vamos a ver cómo obtener el tamaño de HashMap usando el método size () 
 * de la clase HashMap. La definición y descripción del método son las siguientes:
 * public int size (): devuelve el número de asignaciones de clave-valor en este mapa.
 * @author mromo
 *
 */
public class Ejercicio4 {
	
	
	public static void main(String[] args) {
		// Creating a HashMap of int keys and String values 
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		// Adding Key and Value pairs to HashMap 
		hashmap.put(11,"Value1"); 
		hashmap.put(22,"Value2"); 
		hashmap.put(33,"Value3"); 
		hashmap.put(44,"Value4"); 
		hashmap.put(55,"Value5");
		// int size() method returns the number of key value pairs 
		System.out.println("Size of HashMap : " + hashmap.size());}
}
