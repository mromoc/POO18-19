import java.util.ArrayList;

/**
 * Clase Generica
 * @author mromo
 *
 * @param <T>
 */
public class Ejercicio10<T> {
	
	private ArrayList<T> lista;
	
	public Ejercicio10() {
		lista = new ArrayList<T>();
	}
	
	public void setElemento(T valor) { 
		lista.add(valor); 
	}
	
	public T getElemento(int i) { 
		return lista.get(i); 
	}

	public static void main(String[] args) {
		Ejercicio10<Double> listanumeros;
		listanumeros = new Ejercicio10<Double>();
		listanumeros.setElemento(5.3);
		double numero = listanumeros.getElemento(0);
		System.out.println(numero);
	}
	
}
