package HashMap;

import java.util.HashMap;

/**
 * 
 * �c�mo verificar si una clave particular est� presente en HashMap. 
 * Utilizaremos el m�todo containsKey () de la clase HashMap para realizar esta comprobaci�n. 
 * La definici�n y descripci�n del m�todo son las siguientes:
 * public boolean containsKey (clave Object):
 *  Devuelve true si este mapa contiene una asignaci�n para la clave especificada.
 *  Ejemplo: Los pasos que seguimos en el siguiente ejemplo son:
 *   1) Cree un HashMap y rellene con pares clave-valor. 
 *   2) Verifique cualquier existencia de clave llamando al m�todo containsKey (). 
 *   Este m�todo devuelve un valor booleano.
 * 
 * @author mromo
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		// Creating a HashMap of int keys and String values
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		// Adding Key and Value pairs to HashMap 
		hashmap.put(11,"Chaitanya");
		hashmap.put(22,"Pratap");
		hashmap.put(33,"Singh");
		hashmap.put(44,"Rajesh");
		hashmap.put(55,"Kate");
		// Checking Key Existence 
		boolean flag = hashmap.containsKey(22); 
		System.out.println("Key 22 exists in HashMap? : " + flag);
		boolean flag2 = hashmap.containsKey(55);
		System.out.println("Key 55 exists in HashMap? : " + flag2);
		boolean flag3 = hashmap.containsKey(99);
		System.out.println("Key 99 exists in HashMap? : " + flag3);
	}
	
	
}
