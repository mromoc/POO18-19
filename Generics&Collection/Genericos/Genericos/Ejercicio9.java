package Genericos;

/**
 * Clase que utiliza un Metodo Generico para imprimir al reves.
 * @author mromo
 *
 */
public class Ejercicio9 {
	
	public static <T> void imprimir_reves(T objeto) {
		StringBuffer sb = new StringBuffer(objeto.toString());
		System.out.println(sb.reverse());
	}
	
	public static void main(String [] args) {
		String cadena = new String("Hola"); 
		Integer entero = new Integer(12); 
		Float flotante = new Float(13.6); 
		Object objeto = new Object();
		imprimir_reves(cadena); 
		imprimir_reves(entero); 
		imprimir_reves(flotante); 
		imprimir_reves(objeto);
	}
	
}
