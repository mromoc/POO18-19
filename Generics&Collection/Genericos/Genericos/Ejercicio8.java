package Genericos;

public class Ejercicio8<T1 extends Number, T2 extends Number> { 
	private T1 numero1; 
	private T2 numero2;
	
	public Ejercicio8(T1 numero1, T2 numero2) { 
		this.numero1 = numero1; 
		this.numero2 = numero2;
	}
	
	public void sumar() { 
		System.out.println(numero1.doubleValue() + numero2.doubleValue()); 
	}
	
	public static void main (String [] args) {
		Ejercicio8<Integer,Integer> e = new Ejercicio8<Integer,Integer>(8,4);
		e.sumar();
	}
	
}
