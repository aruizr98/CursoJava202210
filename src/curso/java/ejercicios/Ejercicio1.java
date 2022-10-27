package curso.java.ejercicios;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import curso.java.funciones.Utils;

public class Ejercicio1 {
	/**
	 * Pinta un cuadrado según el tamaño introducido como parámetro de entrada
	 * @param tamanyo
	 */
	public static void pintarCuadrado(int tamanyo) {
		char cuadrado[][]=new char[tamanyo][tamanyo];
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado[0].length; j++) {
				if(i==0 || i==cuadrado.length-1 || j==0 || j==cuadrado[0].length-1) {
					cuadrado[i][j]='*';
				}else {
					cuadrado[i][j]=' ';
				}
			}
		}
		for (int i = 0; i < cuadrado.length; i++) {
			for (int j = 0; j < cuadrado[0].length; j++) {
				System.out.print(cuadrado[i][j]+" ");
			}
			System.out.println();
		}
	}
	/**
	 * Muestra un cuadrado 4x4 o uno personalizado dependiendo de la opción elegida.
	 */
	public static void mostrarCuadrado() {
		int numero=0;
		Scanner lector=new Scanner(System.in);
		do {
			System.out.println("1. Cuadrado 4x4");
			System.out.println("2. Cuadrado personalizado.");
			System.out.println("3. Salir.");
			 numero=lector.nextInt();
			 
			 switch(numero) {
			 case 1:
				 pintarCuadrado(4);
				 break;
			 case 2:
				 System.out.println("Introduce el tamaño del cuadrado.");
				 int tamanyo=lector.nextInt();
				 pintarCuadrado(tamanyo);
				 break;
			 }
		}while(numero!=3);
	}
	/**
	 * Valida si después del último punto del email hay menos de 6 caracteres.
	 * @param email
	 * @return
	 */
	public static boolean validarExtension(String email) {
		boolean correcto=true;
		String emailPunto="";
		for (int i = 0; i < email.length(); i++) {
			if(email.charAt(i) == '.') {
				emailPunto=email.substring(i);
			}
		}
		if(emailPunto.length() >6){
			correcto=false;
			System.out.println("Error extensión.");
		}
		//if(correo.subString(correo.lastIndexOf(".")+1).length() >= 2 && <=6)
		return correcto;
	}
	/**
	 * Valida un email introducido como argumento de entrada.
	 */
	public static void validarEmail() {
		Scanner lector=new Scanner(System.in);
	
		boolean correcto=true;
		do {
			correcto=true;
			System.out.println("Introduce el email.");
			String email=lector.nextLine();
			if(email.contains(" ") || !comprobarArroba(email) | !comprobarPunto(email) || !validarExtension(email)) {
				correcto=false;
				if(email.contains(" ")) {
					System.out.println("El email no puede tener espacios en blanco.");
				}
			}else {
				System.out.println("¡Email correcto!");
			}
		}while(!correcto);
		
	}
	/**
	 * Comprueba que después de la @ haya al menos un punto.
	 */
	public static boolean comprobarPunto(String email) {
		boolean correcto=true;
		char punto='.';
		int contador=0;
		String emailAcortado="";
		for (int i = 0; i < email.length(); i++) {
			if(email.charAt(i)=='@') {
				emailAcortado=email.substring(i);
			}
		}
		for (int i = 0; i < emailAcortado.length(); i++) {
			if(emailAcortado.charAt(i)==punto) {
				contador++;
			}
		}
		if(contador >1) {
			correcto=false;
			System.out.println("Error punto.");
		}
		//(if(!correo.substring((correto.indexOf("@").contains("."))))
		return correcto;
	}
	/**
	 * Comprueba si la @ aparece más de una vez en el string pasado como argumento de entrada.
	 */
	public static boolean comprobarArroba(String email) {
		int contador=0;
		boolean respuesta=true;
		for (int i = 0; i < email.length(); i++) {
			char c='@';
			if(email.charAt(i)==c) {
				contador++;
			}
		}
		if(contador!=1) {
			respuesta=false;
			System.out.println("Error arroba.");
		}
		
		return respuesta;
	}
	/**
	 * Muestra tantos números de la secuencia de Fibonacci como se hayan introducido como parámetro de entrada.
	 * @param tamanyo
	 */
	public static void mostrarSecuenciaFibonacci(int tamanyo) {
		int e1=0;
		int e2=1;
		int aux;
		for (int i = 0; i < tamanyo; i++) {
			aux=e1+e2;
			System.out.print(e2+" ");
			e1=e2;
			e2=aux;
		}
		System.out.println();
	}
	public static void pruebaFibonacci(int numero) {
		for (int i = 0; i < numero; i++) {
			System.out.print(mostrarSecuenciaFibonacciRecursiva(i)+" "); 
		}
	}
	public static int mostrarSecuenciaFibonacciRecursiva(int numero) {
		if(numero==0 || numero==1) {
			return numero;
		}else {
			return mostrarSecuenciaFibonacciRecursiva(numero-1) + mostrarSecuenciaFibonacciRecursiva(numero-2);
		}
	}
	/**
	 * Pide al usuario un número de alumnos y luego el nombre de cada uno de ellos para finalmente mostrarlos por pantalla.
	 */
	public static void insertarNombre() {
		Scanner lector=new Scanner(System.in);
		int numero=Integer.parseInt(Utils.pedirValor("Introduce el número de alumnos"));
		String[] nombres=new String[numero];
		lector.nextLine();
		for (int i = 0; i < numero; i++) {
			System.out.println("Introduce el nombre del alumno "+(i+1));
			nombres[i]=lector.nextLine();
		}
		System.out.println("Lista de alumnos: ");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
	}
	public static void main(String[] args) {
		int numero=0;
		Scanner lector=new Scanner(System.in);
		do {
			try {
			/*System.out.println("Introduce un número para seleccionar.");
			System.out.println("1. Pintar cuadrado.");
			System.out.println("2. Validar email.");
			System.out.println("3. Serie Fibonacci.");
			System.out.println("4. Insertar nombres.");
			System.out.println("5. Salir.");*/
				Utils.pintarMenu();
			
			numero=Integer.parseInt(Utils.pedirValor("Introduce un número para seleccionar"));
			
			switch(numero) {
			case 1:
				mostrarCuadrado();
				break;
			case 2:
				lector.nextLine();
				validarEmail();
				break;
			case 3:
				System.out.println("Introduce el número de elementos de la secuencia.");
				int tamanyo=lector.nextInt();
				mostrarSecuenciaFibonacci(tamanyo);
				//pruebaFibonacci(tamanyo);
				break;
			case 4:
				insertarNombre();
				break;
			case 5:
				System.out.println("¡Hasta pronto!");
				break;
			default:
				System.out.println("Opción incorrecta.");
				break;
				
			}
			
			}catch(InputMismatchException e) {
				lector.nextLine();
				System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
			}catch(NumberFormatException e) {
				System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
			}
		}while(numero!=5);

	}
}
