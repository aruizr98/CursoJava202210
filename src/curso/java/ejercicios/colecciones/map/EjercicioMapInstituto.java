package curso.java.ejercicios.colecciones.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import curso.java.ejercicios.colecciones.instituto.Estudiante;
import curso.java.ejercicios.colecciones.map.servicios.ArchivoServicio;

public class EjercicioMapInstituto {
	private Map<Colegio, List<Estudiante>> datosColegio;
	private static final String FICHERO1="./recursos/alumnos.txt";
	private static final String FICHERO2="./recursos/alumnos-colegio.txt";

	public EjercicioMapInstituto() {
		this.datosColegio = new HashMap<Colegio, List<Estudiante>>();
	}

	public EjercicioMapInstituto(Map<Colegio, List<Estudiante>> datosColegio) {
		this.datosColegio = datosColegio;
	}

	public void crearColegios() {
		Colegio c1 = new Colegio("Colegio 1", "Madrid");
		Colegio c2 = new Colegio("Colegio 2", "Madrid");

		Estudiante e1 = new Estudiante("Estudiante 1", "Apellidos 1");
		Estudiante e2 = new Estudiante("Estudiante 2", "Apellidos 2", "12345D");
		Estudiante e3 = new Estudiante("Estudiante 3", "Apellidos 3");
		Estudiante e4 = new Estudiante("Estudiante 4", "Apellidos 4", "12345E");
		Estudiante e5 = new Estudiante("Estudiante 5", "Apellidos 5");
		Estudiante e6 = new Estudiante("Estudiante 6", "Apellidos 6");
		List<Estudiante> estudiantes1 = new ArrayList<Estudiante>();
		estudiantes1.add(e1);
		estudiantes1.add(e2);
		estudiantes1.add(e3);
		List<Estudiante> estudiantes2 = new ArrayList<Estudiante>();
		estudiantes2.add(e4);
		estudiantes2.add(e5);
		estudiantes2.add(e6);

		this.datosColegio.put(c1, estudiantes1);
		this.datosColegio.put(c2, estudiantes2);

	}

	public void pintarDatosAlumnos() {
		for (Colegio colegio : datosColegio.keySet()) {
			System.out.println("Alumnos de " + colegio.getNombre() + ":\n");
			for (Estudiante estudiante : datosColegio.get(colegio)) {
				System.out.println(estudiante.getNombre() + " " + estudiante.getApellidos() + " " + estudiante.getDni()
						+ estudiante.getAsignaturas().toString());
			}
			System.out.println();
		}
	}

	public void encontrarAlumnoDNI(String dni) {
		boolean encontrado = false;
		for (Colegio colegio : datosColegio.keySet()) {
			for (Estudiante estudiante : datosColegio.get(colegio)) {
				if (estudiante.getDni().equals(dni)) {
					System.out.println("El estudiante " + estudiante.getNombre() + " " + estudiante.getApellidos()
							+ " est?? en el colegio " + colegio.getNombre());
					encontrado = true;
					break;
				}
				if (encontrado) {
					break;
				}
			}
			System.out.println();
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado ning??n estudiante con el dni " + dni);
		}
	}

	public void leerFicheroAlumnos() {
		ArchivoServicio a = new ArchivoServicio();
		List<Estudiante> estudiantes = a.leerArchivoAlumnos(FICHERO1);
		System.out.println("Hab??a " + estudiantes.size() + " alumnos en el fichero.");
		Map<Colegio, List<Estudiante>> mapa=new HashMap<Colegio, List<Estudiante>>();
		mapa.put(new Colegio("Colegio"), estudiantes);
		this.datosColegio = mapa;
		
	}

	public void leerFicheroAlumnosCompleto() {
		Map<Colegio, Integer> colegioMasGrande = new HashMap<Colegio, Integer>();
		Map<Colegio, Integer> colegioMasPequenyo = new HashMap<Colegio, Integer>();
		int max = 0;
		int min = 0;
		ArchivoServicio a = new ArchivoServicio();
		this.datosColegio = a.leerArchivoAlumnosColegio(FICHERO2);
		for (Colegio colegio : this.datosColegio.keySet()) {
			System.out.println(colegio.getNombre() + " tiene " + this.datosColegio.get(colegio).size() + " alumnos");
			if (max < this.datosColegio.get(colegio).size()) {
				max = this.datosColegio.get(colegio).size();
				if (!colegioMasGrande.containsValue(max)) {
					colegioMasGrande.put(colegio, max);
				} else {
					colegioMasGrande.clear();
					colegioMasGrande.put(colegio, max);
				}

			} else {
				min = this.datosColegio.get(colegio).size();
				if (!colegioMasPequenyo.containsValue(min)) {
					colegioMasPequenyo.put(colegio, min);
				} else {
					colegioMasPequenyo.clear();
					colegioMasPequenyo.put(colegio, min);
				}
			}
		}
		for (Colegio c : colegioMasGrande.keySet()) {
			System.out
					.println("Colegio m??s grande: " + c.getNombre() + " con " + colegioMasGrande.get(c) + " alumnos.");
		}
		for (Colegio c : colegioMasPequenyo.keySet()) {
			System.out.println(
					"Colegio m??s peque??o: " + c.getNombre() + " con " + colegioMasPequenyo.get(c) + " alumnos.");
		}

	}

	public static void main(String[] args) {
		EjercicioMapInstituto e = new EjercicioMapInstituto();
		// e.leerFicheroAlumnosCompleto();
		e.leerFicheroAlumnos();

//		e.crearColegios();
		e.pintarDatosAlumnos();
//		e.encontrarAlumnoDNI("12345D");
//		e.encontrarAlumnoDNI("12345E");

	}
}
