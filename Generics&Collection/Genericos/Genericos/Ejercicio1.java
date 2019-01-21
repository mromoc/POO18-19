package Genericos;

/**
 * En esta clase sobrecargaremos un metodo generico Para Imprimir.
 * @author mromo
 *
 */
public class Ejercicio1 {

	/**
	 * Metodo Generico que recive un Arreglo
	 * @param inputArray
	 */
	public static <E> void printArray(E[] inputArray) {
		for(E element : inputArray ) {
			System.out.print(" "+element );
		}
		System.out.println();
	}
	
	/**
	 * Otra forma de plantear el mismo Metodo anterior
	 * @param arregloentrada
	 */
	public static void otraformaprintArray(Object[] arregloentrada) {
		for(Object elemento : arregloentrada) {
			System.out.print(" "+elemento);
		}
		System.out.println();
	}
	
	public static void main (String[] args) {
		Integer[] integerArray = {2,4,6,2,8,9,4};
		Double[] doubleArray = {1.4,5.2,8.1,1.6,3.2,5.5,2.9};
		Character[] characterArray = {'M','a','r','c','e','l','o'};
		
		System.out.println("Arreglo de enteros contiene");
		printArray(integerArray);
		System.out.println("Arreglo de doubles contiene");
		printArray(doubleArray);
		System.out.println("Arreglo de caracteres contiene");
		otraformaprintArray(characterArray);
		
	}
	
}
