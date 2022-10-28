package curso.java.colecciones;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static void main(String[] args) {
		Set<String> colores=new HashSet<String>();
		
		colores.add("Rojo");
		boolean agregado=colores.add("Rojo");//No acepta repetidos.
		
		for (String string : colores) {
			System.out.println(string);
		}
		
		System.out.println(agregado ? "Rojo 2 añadido.": "Rojo 2 no añadido");
	}
}