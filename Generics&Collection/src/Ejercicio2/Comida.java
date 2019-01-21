package Ejercicio2;

/**
 * 
 * PDF: generico
 * Pagina: 27
 * Como se puede observar, la clase Comida define, entre otros, los atributos calorias y 
 * minutosPreparacion para representar las calorías que tiene una Comida y los minutos que 
 * tarda en prepararse respectivamente; igualmente, Comida define, entre otros, los métodos 
 * necesarios para consultar y modificar convenientemente dichos atributos.
 * Se pide completar el diseño presentado de la clase Comida de forma que sea posible utilizar 
 * un método genérico para ordenar ascendentemente las componentes de un array de Comida dado como 
 * sigue: una Comida es menor que otra si tiene menos calorías que la otra y, a igualdad de calorías, 
 * si el tiempo que se tarda en prepararla es menor.
 * @author mromo
 *
 */
public abstract class Comida implements Comparable<Comida>{

	private double calorias;
	private int minutosPreparacion;
	
	public double getCalorias() {
		return calorias;
	}
	
	public int getMinutosPreparacion() {
		return minutosPreparacion;
	}
	
	public void setCalorias(double c) {
		calorias = c;
	}
	
	public void setMinutosPreparacion(int m) {
		minutosPreparacion = m;
	}
	
	public int compareTo(Comida c) {
		if(calorias > c.calorias)
			return 1;
		if(calorias < c.calorias)
			return -1;
		return minutosPreparacion - c.minutosPreparacion;
	}
	
}
