package Todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


/**
 * Clase de test Para cada una de las colecciones: Set, List y Map.
 * @author mromo
 *
 */
public class AllCollection {
	public static void main(String[] args) {
		
		//~~~~~~~~~~~~~~~~~~~~
		//   Collection SET
		//~~~~~~~~~~~~~~~~~~~~
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		TreeSet<String> treeset = new TreeSet<String>();
		LinkedHashSet<Double> linkedset = new LinkedHashSet<Double>();
		
		hashset.add(2);
		hashset.add(16);
		hashset.add(99);
		hashset.add(99);
		hashset.add(99);
		hashset.add(99);
		hashset.add(99);
		hashset.add(99);
		hashset.add(1);
		hashset.add(1);
		
		hashset.remove(99);
		
		treeset.add("C");
		treeset.add("A");
		treeset.add("A");
		treeset.add("A");
		treeset.add("A");
		treeset.add("B");
		
		treeset.remove("A");
		
		linkedset.add(5.4);
		linkedset.add(5.4);
		linkedset.add(6.4);
		linkedset.add(1.4);
		
		linkedset.remove(5.4);
		
		
		/**
		 * Iterador Generico LinkedHashSet 
		 */
		System.out.println("Contenido de LinkedHashSet (Double) Orden de Insercion, no permite Duplicados");
		for(Iterator<Double>it = linkedset.iterator();it.hasNext();) {
			Double x = it.next();
			System.out.println(x);
		}
		/**
		 * Iterador Generico TreeSet
		 */
		System.out.println("Contenido de TreeSet (String) Orden por valor, no permite Duplicados");
		for(Iterator<String>it = treeset.iterator();it.hasNext();) {
			String x = it.next();
			System.out.println(x);
		}
		/**
		 * Iterador generico HashSet
		 */
		System.out.println("Contenido de HashSet (Integer) No tiene Orden(Mas Rapido), no permite Duplicados");
		for(Iterator<Integer>it = hashset.iterator();it.hasNext();) {
			int x = it.next();
			System.out.println(x);
		}
		
		//~~~~~~~~~~~~~~~~~~~~
		// Fin Collection SET
		//~~~~~~~~~~~~~~~~~~~~
		/**
		 * 
		 */
		//~~~~~~~~~~~~~~~~~~~~
		//  Collection LIST
		//~~~~~~~~~~~~~~~~~~~~
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		arraylist.add(54);
		arraylist.add(54);
		arraylist.addAll(hashset);
		
		arraylist.remove(3);//Borra el Dato en la posicion 3
		
		linkedlist.add("Nodo1");
		linkedlist.add("Nodo1");
		linkedlist.add("NodoparaBorrar");
		linkedlist.addAll(treeset);
		
		linkedlist.addFirst("AñadePrimero");
		linkedlist.addLast("AñadeUltimo");
		
		linkedlist.remove(3);
		
		linkedlist.add(2,"NodoBorrado");
		/**
		 * Iterador Generico ArrayList
		 */
		System.out.println("Contenido de ArrayList (Integer) Orden de Insercion, si permite Duplicados");
		for(Iterator<Integer>it = arraylist.iterator();it.hasNext();) {
			int x = it.next();
			System.out.println(x);
		}
		/**
		 * Iterador Generico LinkedList
		 */
		System.out.println("Contenido de linkedlist (String) Orden de Insercion, si permite Duplicados");
		for(Iterator<String>it = linkedlist.iterator();it.hasNext();) {
			String x = it.next();
			System.out.println(x);
		}
		//~~~~~~~~~~~~~~~~~~~~
		//Fin Collection LIST
		//~~~~~~~~~~~~~~~~~~~~
		/**
		 * 
		 */
		//~~~~~~~~~~~~~~~~~~~~
		//  Collection MAP
		//~~~~~~~~~~~~~~~~~~~~
		Map<Integer,String> hashmap = new HashMap<Integer,String>();
		Map<Integer,String> treemap = new TreeMap<Integer,String>();
		Map<Integer,String> linkedmap = new LinkedHashMap<Integer,String>(); 
		
		
		hashmap.put(1, "A");
		hashmap.put(43,"A");
		hashmap.put(1, "A");
		hashmap.put(1,"B");
		hashmap.put(2, "B");
		hashmap.put(13, "D");
		hashmap.put(6, "C");
		hashmap.put(7, "C");
		
		hashmap.remove(1);//Remueve el Objeto con key = 1
		
		treemap.put(1, "A");
		treemap.put(1, "G");
		treemap.put(7, "J");
		treemap.put(3, "K");
		treemap.put(2, "R");
		treemap.put(5, "X");
		
		treemap.remove(2);
		
		linkedmap.put(4, "J");
		linkedmap.putAll(treemap);
		
		linkedmap.remove(3);
		
		/**
		 * Iterador Generico HashMap
		 */
		System.out.println("Contenido de HashMap (Integer,String) No existe Orden, no permite duplicados, reemplaza en caso de usar una key ya utilizada");
		for(Map.Entry<Integer, String> entry:hashmap.entrySet()) {
			System.out.println("clave = "+entry.getKey()+" valor = "+entry.getValue());
		}
		/**
		 * Iterador Generico treemap
		 */
		System.out.println("Contenido de TreeMap (Integer,String) Orden Por valor, no permite duplicados, reemplaza en caso de usar una key ya utilizada");
		for(Map.Entry<Integer, String> entry:treemap.entrySet()) {
			System.out.println("clave = "+entry.getKey()+" valor = "+entry.getValue());
		}
		/**
		 * Iterador Generico LinkedHasMap
		 */
		System.out.println("Contenido de LinkedHashMap (Integer,String) Orden de Insercion, no permite duplicados, reemplaza en caso de usar una key ya utilizada");
		for(Map.Entry<Integer, String> entry:linkedmap.entrySet()) {
			System.out.println("clave = "+entry.getKey()+" valor = "+entry.getValue());
		}
		//~~~~~~~~~~~~~~~~~~~~~~
		//  Fin Collection MAP
		//~~~~~~~~~~~~~~~~~~~~~~
	}
}