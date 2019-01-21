package Genericos;
/**
 * Esta clase nos permite entender una clase generica como lo es 
 * Treeset...
 * @author mromo
 *
 */
public class Ejercicio5<T> {
	private T objeto;

	public Ejercicio5(T objeto) {
		this.objeto = objeto;
	}
	
	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}

	public T getObjeto() {
		return this.objeto;
	}
	
	public void imprimir() {
		System.out.println(objeto.toString());
	}
	
	public void imprimirReves() {
		StringBuffer sb = new StringBuffer(objeto.toString());
		System.out.println(sb.reverse());
	}
	
	public static void main(String[] args) {
		Ejercicio5<String> imstr = new Ejercicio5<String>("Hola Mundo");
		imstr.imprimir();
		Ejercicio5<Integer> imint = new Ejercicio5<Integer>(19395);
		imint.imprimirReves();
	}
	
}
