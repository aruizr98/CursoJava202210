package curso.java.ejercicios.colecciones.map;

import java.util.ArrayList;
import java.util.List;

import curso.java.ejercicios.colecciones.instituto.Estudiante;

public class Colegio {
	private String nombre;
	private String direccion;
	private List<Estudiante> estudiantes;
	
	public Colegio(String nombre, String direccion, List<Estudiante> estudiantes) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estudiantes=estudiantes;
	}
	public Colegio(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.estudiantes=new ArrayList<Estudiante>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Colegio [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
}
