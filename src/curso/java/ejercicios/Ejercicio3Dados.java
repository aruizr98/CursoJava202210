package curso.java.ejercicios;

import curso.java.funciones.Utils;
import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio3Dados {
	public static void ejercicio1() {
		int numeroVeces = Integer.parseInt(Utils.pedirValor("Introduce el número de veces que quieres tirar el dado"));
		int[] resultados = new int[numeroVeces];
		int max = 0;
		int min = numeroVeces;
		int suma = 0;
		boolean repetir = false;
		System.out.println("resultado:");
		for (int i = 0; i < numeroVeces; i++) {
			resultados[i] = Utils.tirarDado(6);
			System.out.println(resultados[i]);
			suma += resultados[i];
		}
		Arrays.sort(resultados);
		System.out.println("Max: " + resultados[resultados.length - 1]);
		System.out.println("Min: " + resultados[0]);
		System.out.println("Media: " + (suma / resultados.length));
	}

	public static void ejercicio2() {
		int numTiradas=5;
		int[] dado1 = new int[numTiradas];
		int[] dado2 = new int[numTiradas];
		int[] resultados = new int[numTiradas];
		int max = 0;
		int min = 6;
		int posicionMax = 0;

		for (int i = 0; i < dado1.length; i++) {
			dado1[i] = Utils.tirarDado(6);
			dado2[i] = Utils.tirarDado(6);
			
			resultados[i] = dado1[i] + dado2[i];
			System.out.println("Dado 1: " + dado1[i]);
			System.out.println("Dado 2: " + dado2[i] + "\n");
			max = Math.max(resultados[i], max);
			min = Math.min(resultados[i], min);
		}
		for (int i = 0; i < resultados.length; i++) {
			if (resultados[i] == max) {
				posicionMax = i + 1;
			}
		}
		System.out.println("El número más alto " + (max) + " está en la tirada " + posicionMax + ".\n"
				+ "Los valores han sido dado 1: " + dado1[posicionMax - 1] + " y dado 2: " + dado2[posicionMax - 1]);

	}
	public static void correccionEjercicio2() {
		int numDados=2;
		int numTiradas=5;
		int [][] tiradas=new int[numTiradas][numDados];
		
		for (int i = 0; i < tiradas.length; i++) {
			for (int j = 0; j < tiradas[i].length; j++) {
				tiradas[i][j]=Utils.tirarDado(6);
			}
		}
		
	}

	public static void main(String[] args) {
		int numero;
		do {
			Utils.pintarMenu("1. Ejercicio 1\n2. Ejercicio 2");
			numero = Integer.parseInt(Utils.pedirValor("Introduce un número para seleccionar."));
			switch (numero) {
			case 1:
				ejercicio1();
				break;
			case 2:
				ejercicio2();
				break;
			case 3:
				break;
			}
		} while (numero != 3);

	}
}
