package curso.java.funciones;

import java.util.Scanner;

public class Utils {
	//C
	/**
	 * tira un dado del número de caras introducidas como argumento de entrada.
	 * @param numCaras
	 */
    public static int tirarDado(int numCaras) {
    	double random=Math.random();
    	int tirada=(int)(Math.ceil((numCaras*random)));
    	return tirada;
    }
	/**
	 * Función para solicitar un valor por consola.
	 * @param texto
	 * @return
	 */
	public static String pedirValor(String texto) {
		String valor;
		Scanner lector=new Scanner(System.in);
		System.out.println(texto);
		valor=lector.nextLine();
		//lector.close();
		return valor;
	}
	/**
	 * Funcióm para solicitar un valor por consola con un texto por defecto.
	 * @return
	 */
	public static String pedirValor() {
		String texto="Introduce una opción";
		return pedirValor(texto);
	}
	
	/**
	 * Muestra por consola el menú introducido como parámetro de entrada
	 * @param opciones
	 */
	public static void pintarMenu(String opciones) {
		System.out.println(opciones);
	}
	/**
	 * Muestra por consola un menú por defecto. 
	 */
	public static void pintarMenu() {
		String menu="1. Pintar cuadrado.\n2. Validar email\n3. Serie Fibonacci.\n4. Insertar nombres\n5. Salir.";
		pintarMenu(menu);
	}
}
