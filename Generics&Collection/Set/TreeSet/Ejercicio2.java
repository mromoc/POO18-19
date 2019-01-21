package TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	
	public static void main(String[] args) {
		Set<Book> set = new TreeSet<Book>();
		Book b1 = new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2 = new Book(233,"Operating System","Galvin","Wiley",6);
		Book b3 = new Book(01,"Data Networking","Forouzan","Mc Graw Hill",4);
		Book b4 = new Book(512,"Un Sujeto","English for Dummies","McKlopedia",1);
		set.add(b1);
		set.add(b2);
		
		Set<Book> set2 = new TreeSet<Book>();
		set2.add(b3);
		set2.add(b4);
		
		System.out.println("Antes de Unir");
		System.out.println("TreeSet1");
		for(Book b:set){
			System.out.println(b.id+" "+b.name+" "+b.autor+" "+b.publisher+" "+b.quantity); 
		}
		System.out.println();
		System.out.println("TreeSet2");
		for(Book b:set2){
			System.out.println(b.id+" "+b.name+" "+b.autor+" "+b.publisher+" "+b.quantity); 
		}
		
		/**
		 * Utilizado para añadir toda una Colleccion
		 */
		set.addAll(set2);
		
		System.out.println();
		System.out.println("Despues de Unir Las 2 en set");
		for(Book b:set){
			System.out.println(b.id+" "+b.name+" "+b.autor+" "+b.publisher+" "+b.quantity); 
		}
		
		/**
		 * Lo utilizaremos para saber si contiene un objeto
		 */
		System.out.println();
		System.out.println("Comando para saber si la collection tiene un elemento");
		if(set.contains(b3)) {
			System.out.println("Si contiene el Elemento");
		}else
			System.out.println("No contiene el elemento");
		
		System.out.println();
		System.out.println("Comando utilizado para remover un elemento");
		set.remove(b1);
		
		System.out.println("Despues de remover");
		for(Book b:set){
			System.out.println(b.id+" "+b.name+" "+b.autor+" "+b.publisher+" "+b.quantity); 
		}
	}
	
}

class Book implements Comparable<Book>{
	
	int id,quantity;
	String name, autor,publisher;
	
	public Book(int id, String name, String autor, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.autor = autor;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	public int compareTo(Book b) {
		if(id > b.id)
			return 1;
		else if(id < b.id)
			return -1;
		else
			return 0;
	}
	
}