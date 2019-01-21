package Ejercicio1;

public class Jaula <T extends AnimalTerrestre> extends Contenedor<T> implements Comparable<Jaula<T>>{

	public Jaula(double volumen) {
		super(volumen);
	}
	
	public int compareTo(Jaula<T> j) {
		if(volumen < j.volumen) {
			return -1;
		}if(volumen > j.volumen) {
			return 1;
		}
		return 0;
	}
		
}
