package curso.java.ejercicios.colecciones.instituto;

import java.util.HashSet;
import java.util.Set;

public class Estudiante extends Persona{
	private Set<Asignatura> asignaturas;

	public Estudiante(String nombre, String apellidos, String dni, Set<Asignatura> asignaturas) {
		super(nombre, apellidos, dni);
		this.asignaturas = asignaturas;
	}
	
	public Estudiante(String nombre, String apellidos, Set<Asignatura> asignaturas) {
		super(nombre, apellidos);
		this.asignaturas = asignaturas;
	}
	public Estudiante(String nombre, String apellidos) {
		super(nombre, apellidos);
		this.asignaturas=new HashSet<Asignatura>();
	}
	public Estudiante(String nombre, String apellidos, String dni) {
		super(nombre, apellidos, dni);
		this.asignaturas=new HashSet<Asignatura>();
	}
	

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString() {
		return "Estudiante [asignaturas=" + asignaturas + ", toString()=" + super.toString() + "]";
	}
	public double calcularNotaMedia() {
		double media=0;
		for (Asignatura asignatura : asignaturas) {
			media+=asignatura.getNota();
		}
		media=media/asignaturas.size();

		return media;
	}
	
	
}
