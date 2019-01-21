package Genericos;

/**
 * Clase generica que solo opera con numeros
 * @author mromo
 *
 * @param <T>
 */
public class Ejercicio7<T extends Number> {

	private T numero;
	
	public Ejercicio7(T numero) { 
		this.numero = numero;
	} 
	
	public void dividir() { 
		System.out.println(numero.doubleValue() / 2); 
	}
	
	public static void main (String[] args) {
		Ejercicio7<Integer> e = new Ejercicio7<Integer>(14);
		e.dividir();
	}
	
}
