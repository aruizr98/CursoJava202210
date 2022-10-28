package curso.java.colecciones;

import java.util.ArrayList;

public class ListasJava {
	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("hola");
		lista1.add("qué");
		lista1.add("tal");
		
		for (String string : lista1) {
			System.out.println(string);
		}
		System.out.println(lista1.size());
		System.out.println(lista1.isEmpty());
		System.out.println(lista1.contains("hola"));
		System.out.println(lista1.get(0));
		System.out.println(lista1.set(0, "hey"));
		for (String string : lista1) {
			System.out.println(string);
		}
	}
}
