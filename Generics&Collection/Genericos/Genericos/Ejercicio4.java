package Genericos;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


/**
 * Clase que implementa una forma de imprimir una estructura Collection
 * @author mromo
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		List<String> lenguajes = new ArrayList<String>();
		lenguajes.add("ingles");
		lenguajes.add("castellano");
		lenguajes.add("chino");
		lenguajes.add("Ruso");
		lenguajes.add("Aleman");
		
		for(Iterator<String>it = lenguajes.iterator();it.hasNext();) {
			String x = it.next(); // No existe "cast" explícito. 
			System.out.println(x);
		}
		/**
		 * Otro ejemplo con un HasMap
		 */
		System.out.println();
		System.out.println("Ahora con HashMap\n");
		
		Map<String,Object> global = new HashMap<String,Object>();
		global.put("Doctor", "(+52)-4000-5000"); 
		global.put("Casa", "(888)-4500-3400"); 
		global.put("Hermano", "(575)-2042-3233");
		// Definir Iterator para extraer/imprimir valores
		for( Iterator<String> it = global.keySet().iterator(); it.hasNext();) { 
			String s = it.next(); 
			Object s1 = global.get(s); 
			System.out.println(s + " : " + s1);
		}
		
	}
	
}
