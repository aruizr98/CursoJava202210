package curso.java.ejercicios.poo.interfaces;

import curso.java.ejercicios.poo.banda.Instrumento;

public class ClaseInterfaces extends Instrumento implements Interfaz1 {

	public ClaseInterfaces(String nombre, String tipo, double precio, String marca) {
		super(nombre, tipo, precio, marca);
		// TODO Auto-generated constructor stub
		System.out.println(NUM);
	}

	@Override
	public void metodo1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
