package LinkedList;

import java.util.LinkedList;


/**
 * Programa para agregar un nuevo elemento a LinkedList usando el método add (E e) de la clase LinkedList
 * @author mromo
 *
 */
public class Ejercicio1 {

	
	public static void main(String[] args) { 
		// create a LinkedList
		LinkedList<String> list = new LinkedList<String>();
		// Adding elements to the LinkedList 
		list.add("Harry"); 
		list.add("Ajeet"); 
		list.add("Tom");
		list.add("Steve");
		// Displaying LinkedList elements 
		System.out.println("LinkedList elements: "+list);
		// Adding another element 
		list.add("Kate");
		// Displaying LinkedList elements after add(E e) 
		System.out.println("LinkedList elements: "+list);
	}
	
}
