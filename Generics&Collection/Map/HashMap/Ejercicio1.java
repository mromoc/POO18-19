package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Al tener una estructura en HashMap y necesitar iterarla a través de un for. 
 * ¿Cómo se puedo hacer esta iteración?.
 * @author mromo
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		Map<Integer,String> datos = new HashMap<>();
		datos.put(1, "uno");
		datos.put(2, "dos");
		datos.put(3, "tres");
		/**
		 * Forma 1 de iterar HashMap
		 */
		for(Map.Entry<Integer, String> entry:datos.entrySet()) {
			System.out.println("clave = "+entry.getKey()+" valor = "+entry.getValue());
		}
		/**
		 * Forma 2 de iterar HashMap
		 */
		for (Integer key : datos.keySet()) {
			System.out.println("Key = " + key); 
		} //iterando sobre los valores 
		for (String value : datos.values()) { 
			System.out.println("Value = " + value); 
		}
		/**
		 * Forma 3 de iterar HashMap
		 */
		Iterator<Map.Entry<Integer, String>> entries = datos.entrySet().iterator();
		while (entries.hasNext()) { 
			Map.Entry<Integer, String> entry = entries.next(); 
			System.out.println("Key = " + entry.getKey() + ", Value = " +entry.getValue()); 
		}
	}
	
}
