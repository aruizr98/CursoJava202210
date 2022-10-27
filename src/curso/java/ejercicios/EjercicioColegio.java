package curso.java.ejercicios;

import java.util.Scanner;

import curso.java.funciones.Utils;

public class EjercicioColegio {
	private static final String BUSCAR = "buscar";
	private static final String BORRAR = "borrar";

	public static void insertarAlumnoPorAula(String[][] aulas) {
		boolean encontrado = false;
		boolean aulaCorrecta = false;
		int numeroAula;
		do {
			do {
				numeroAula = Integer.parseInt(Utils.pedirValor("¿En qué aula quieres introducir al alumno?"));
				aulaCorrecta = true;
				if (validarAula(numeroAula, aulas)) {
					aulaCorrecta = true;
				} else {
					aulaCorrecta = false;
					System.out.println("El aula introducida no es correcta.");
				}
			} while (!aulaCorrecta);
			for (int i = 0; i < aulas[numeroAula - 1].length; i++) {
				if (aulas[numeroAula - 1][i] == null) {
					aulas[numeroAula - 1][i] = Utils.pedirValor(
							"Introduce el nombre del alumno que quieres introducir en el aula " + numeroAula);
					System.out.println("Alumno introducido en el aula " + numeroAula + " correctamente.");
					encontrado = true;
					i = aulas.length;
				}
			}
			if (!encontrado) {
				System.out.println("El aula " + numeroAula + " está llena.");
			}
		} while (!encontrado);
	}

	public static boolean validarAula(int numeroAula, String[][] aulas) {
		return numeroAula <= aulas.length && numeroAula > 0;
	}

	public static void gestionarAlumno(String[][] aulas, String accion) {
		boolean encontrado = false;
		String nombreAlumno = Utils
				.pedirValor(accion.equals(BUSCAR) ? "Introduce el nombre del alumno que quieres buscar."
						: "Introduce el nombre del alumno que quieres borrar.");
		for (int i = 0; i < aulas.length; i++) {
			for (int j = 0; j < aulas[i].length; j++) {
				if (aulas[i][j] != null && aulas[i][j].equals(nombreAlumno)) {
					if (accion.equals(BUSCAR)) {
						System.out.println("El alumno " + nombreAlumno + " se encuentra en el aula " + (i + 1));
					} else if (accion.equals(BORRAR)) {
						aulas[i][j] = null;
						System.out.println("El alumno " + nombreAlumno + " ha sido borrado del sistema correctamente.");
					}

					encontrado = true;
					j = aulas[i].length;
					i = aulas.length - 1;
				}
			}
		}
		if (!encontrado) {
			System.out.println("El alumno " + nombreAlumno + " no está en el colegio.");
		}
	}
//	public static void buscarAlumno(String[][] aulas) {
//		boolean encontrado = false;
//		String nombreAlumno = Utils.pedirValor("Introduce el nombre del alumno.");
//		for (int i = 0; i < aulas.length; i++) {
//			for (int j = 0; j < aulas[i].length; j++) {
//				if (aulas[i][j] != null && aulas[i][j].equals(nombreAlumno)) {
//					System.out.println("El alumno " + nombreAlumno + " se encuentra en el aula " + (i + 1));
//					encontrado = true;
//					j = aulas[i].length;
//					i = aulas.length - 1;
//				}
//			}
//		}
//		if (!encontrado) {
//			System.out.println("El alumno " + nombreAlumno + " no está en el colegio.");
//		}
//	}
//
//	public static void borrarAlumno(String[][] aulas) {
//		boolean encontrado = false;
//		String nombreAlumno = Utils.pedirValor("Introduce el nombre del alumno que quieres borrar.");
//		for (int i = 0; i < aulas.length; i++) {
//			for (int j = 0; j < aulas[i].length; j++) {
//				if (aulas[i][j] != null && aulas[i][j].equals(nombreAlumno)) {
//					aulas[i][j] = null;
//					System.out.println("El alumno " + nombreAlumno + " ha sido eliminado del sistema correctamente.");
//					encontrado = true;
//					j = aulas[i].length;
//					i = aulas.length - 1;
//				}
//			}
//		}
//		if (!encontrado) {
//			System.out.println("El alumno " + nombreAlumno + " no está en el colegio.");
//		}
//	}

	public static void mostrarAlumnoPorAula(String[][] aulas) {
		int numeroAula = Integer
				.parseInt(Utils.pedirValor("Introduce el número del aula de la que quieres mostrar los alumnos."));
		System.out.println("Alumnos del aula " + numeroAula + ":");
		for (int i = 0; i < aulas[numeroAula - 1].length; i++) {
			if (aulas[numeroAula - 1][i] != null) {
				System.out.println(aulas[numeroAula - 1][i]);
			}
		}
	}

	public static void mostrarAlumnos(String[][] aulas) {
		for (int i = 0; i < aulas.length; i++) {
			System.out.println("Alumnos aula " + (i + 1) + ":");
			for (int j = 0; j < aulas[i].length; j++) {
				if (aulas[i][j] != null) {
					System.out.println(aulas[i][j]);
				}
			}
		}
	}

	public static void mostrarPlazasLibres(String[][] aulas) {
		int contador = 0;
		for (int i = 0; i < aulas.length; i++) {
			contador = 0;
			for (int j = 0; j < aulas[i].length; j++) {
				if (aulas[i][j] == null) {
					contador++;
				}
			}
			System.out.println("Plazas libres en el aula " + (i + 1) + ": " + contador);
		}
	}

	public static void main(String[] args) {
		int numero = 0;
		String[][] aulas = null;
		boolean correcto = true;
		do {
			correcto = true;
			try {
				int numeroAulas = Integer.parseInt(Utils.pedirValor("¿Cuántas aulas tiene el colegio?"));
				aulas = new String[numeroAulas][];
				int numeroAlumnos;
				for (int i = 0; i < aulas.length; i++) {
					numeroAlumnos = Integer
							.parseInt(Utils.pedirValor("Introduce el número de alumnos del aula " + (i + 1)));
					aulas[i] = new String[numeroAlumnos];
				}
			} catch (NumberFormatException e) {
				System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
				correcto = false;
			}
		} while (!correcto);
		do {
			try {
				Utils.pintarMenu(
						"1. Insertar alumno por aula \n2. Buscar alumno.\n3. Borrar alumno.\n4. Mostrar alumno por aula.\n5. Mostrar alumnos.\n6. Mostrar plazas libres.\n7. Salir");
				numero = Integer.parseInt(Utils.pedirValor("Introduce un número para seleccionar."));

				switch (numero) {
				case 1:
					insertarAlumnoPorAula(aulas);
					break;
				case 2:
//					buscarAlumno(aulas);
					gestionarAlumno(aulas, BUSCAR);
					break;
				case 3:
//					borrarAlumno(aulas);
					gestionarAlumno(aulas, BORRAR);
					break;
				case 4:
					mostrarAlumnoPorAula(aulas);
					break;
				case 5:
					mostrarAlumnos(aulas);
					break;
				case 6:
					mostrarPlazasLibres(aulas);
					break;
				case 7:
					System.out.println("¡Hasta pronto!");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Por favor, introduce un número en lugar de una letra para seleccionar.");
			}
		} while (numero != 7);

	}
}
