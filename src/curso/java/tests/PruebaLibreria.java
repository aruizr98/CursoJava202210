package curso.java.tests;

import curso.java.ejercicios.libreria.Utilidades;

public class PruebaLibreria {
	public static void main(String[] args) {
		Utilidades utils = new Utilidades("Alex", 2);
		utils.funcion1("Hola");
		Utilidades.funcion2();
	}
}
