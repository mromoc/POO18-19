package Ejercicio1;

/**
 * Ejemplo basico de la estructura de una clase Generica como lo es Arraylist,HashSet, etc. 
 * @author mromo
 *
 */
public class testClaseGenerica {

	public static void main (String[] args) {
		claseGenerica<String> c1 = new claseGenerica<String>();
		System.out.println(c1.getVar1());
		c1.setVar1("Hola");
		System.out.println(c1.getVar1());
		
		claseGenerica <Integer> c2 = new claseGenerica<Integer>(2555);
		System.out.println(c2.getVar1());
		
		
	}
	
}
