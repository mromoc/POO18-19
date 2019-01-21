package TreeMap;

import java.util.TreeMap;

/**
 * 
 * �C�mo eliminar todas las asignaciones de clave-valor de TreeMap y hacer que quede vac�a.?
 * Estamos utilizando el m�todo clear () de la clase TreeMap para realizar esta actualizaci�n.
 * @author mromo
 *
 */
public class Ejercicio1 {

	
	public static void main(String[] args) { // Create a TreeMap
		TreeMap<String, String> treemap = new TreeMap<String, String>();
		// Add key-value pairs to the TreeMap 
		treemap.put("Key1","Item1");
		treemap.put("Key2","Item2");
		treemap.put("Key3","Item3");
		treemap.put("Key4","Item4");
		treemap.put("Key5","Item5");
		// TreeMap elements before calling clear() 
		System.out.println("Before: TreeMap contains: "+treemap);
		// Make TreeMap empty
		/* public void clear(): It removes all of the mappings from * this map. The map will be empty after this call returns. */
		treemap.clear();
		//TreeMap elements after calling clear() 
		System.out.println("After: TreeMap contains: "+treemap);
		}
}
