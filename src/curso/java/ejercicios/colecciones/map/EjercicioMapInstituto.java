package curso.java.ejercicios.colecciones.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import curso.java.ejercicios.colecciones.instituto.Estudiante;

public class EjercicioMapInstituto {
	Map<Colegio, List<Estudiante>> datosColegio;
	
	public EjercicioMapInstituto() {
		this.datosColegio=new HashMap<Colegio, List<Estudiante>>();
	}
	public void crearColegios() {
		Colegio c1=new Colegio("Colegio 1", "Madrid");
		Colegio c2=new Colegio("Colegio 2", "Madrid");
		
		Estudiante e1=new Estudiante("Estudiante 1", "Apellidos 1");
		Estudiante e2=new Estudiante("Estudiante 2", "Apellidos 2", "12345D");
		Estudiante e3=new Estudiante("Estudiante 3", "Apellidos 3");
		Estudiante e4=new Estudiante("Estudiante 4", "Apellidos 4", "12345E");
		Estudiante e5=new Estudiante("Estudiante 5", "Apellidos 5");
		Estudiante e6=new Estudiante("Estudiante 6", "Apellidos 6");
		List<Estudiante> estudiantes1=new ArrayList<Estudiante>();
		estudiantes1.add(e1);
		estudiantes1.add(e2);
		estudiantes1.add(e3);
		List<Estudiante> estudiantes2=new ArrayList<Estudiante>();
		estudiantes2.add(e4);
		estudiantes2.add(e5);
		estudiantes2.add(e6);
		
		this.datosColegio.put(c1,estudiantes1);
		this.datosColegio.put(c2,estudiantes2);
		
	}
	public void pintarDatosAlumnos() {
		for (Colegio colegio : datosColegio.keySet()) {
			System.out.println("Alumnos de "+colegio.getNombre()+":\n");
			for (Estudiante estudiante : datosColegio.get(colegio)) {
				System.out.println(estudiante.getNombre()+" "+estudiante.getApellidos()+" "+estudiante.getDni());
			}
			System.out.println();
		}
	}
	public void encontrarAlumnoDNI(String dni) {
		boolean encontrado=false;
		for (Colegio colegio : datosColegio.keySet()) {
			for (Estudiante estudiante : datosColegio.get(colegio)) {
				if(estudiante.getDni().equals(dni)) {
					System.out.println("El estudiante "+estudiante.getNombre()+" "+estudiante.getApellidos()+" está en el colegio "+colegio.getNombre());
					encontrado=true;
					break;
				}
				if(encontrado) {
					break;
				}
			}
			System.out.println();
		}
		if(!encontrado) {
			System.out.println("No se ha encontrado ningún estudiante con el dni "+dni);
		}
	}
	public static void main(String[] args) {
		EjercicioMapInstituto e = new EjercicioMapInstituto();
		e.crearColegios();
		e.pintarDatosAlumnos();
		e.encontrarAlumnoDNI("12345D");
		e.encontrarAlumnoDNI("12345E");
		
	}
}
