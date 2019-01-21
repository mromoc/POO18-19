package Ejercicio1;

/**
 * PDF: generico 
 * Pagina: 25
 * Dise�ar una clase gen�rica, Contenedor, que permita guardar un animal dentro y que: 
 * � Al construir un contenedor haya que indicar el volumen que tiene 
 * � Se pueda consultar el animal que contiene 
 * � Se pueda meter un animal, lanzando la excepci�n ExcepcionContenedorLleno si no est� vac�o.
 * @author mromo
 *
 */
public class Contenedor<T extends Animal> {
	
	protected double volumen;
	protected T animal;
	
	public Contenedor(double volumen) {
		this.volumen = volumen;
		animal = null;
	}
	
	public T getAnimal() {
		return animal;
	}
	
	public void meter(T animal) throws Exception{
		if(this.animal != null) throw new Exception(" Contenedor ocupado por "+this.animal);{
			this.animal=animal;
		}
	}
	
	
}
