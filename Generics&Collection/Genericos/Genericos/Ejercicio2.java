package Genericos;

/**
 * Esta clase tendra un metodo generico que nos devolvera
 * el maximo o el mayor de 3 objetos
 * @author mromo
 *
 */
public class Ejercicio2 {

	/**
	 * Crea un metodo generico para comparar 3 objetos y retornar aquel que es mayor
	 * Notese como implementa la interfaz comparable en el mismo metodo.
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return max
	 */
	public static <T extends Comparable<T>>T maximum(T x ,T y, T z){
		T max = x;
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0) 
			max = z;
		return max;
	}	
	
	public static void main(String[] args) {
		System.out.println("El maximo de "+3+" "+4+" y "+5+" es: "+maximum(3,4,5));
		System.out.println("El maximo de "+"texto1"+" "+"texto2maslargo"+" y "+"texto3muchomaslargo"+" es: "+maximum("texto1","texto2maslargo","texto3muchomaslargo"));
		
	}
	
}
