package curso.java.colecciones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import curso.java.ejercicios.colecciones.instituto.Asignatura;
import curso.java.ejercicios.colecciones.instituto.Estudiante;

public class Mapas {
	public static void main(String[] args) {
		Map<String, Estudiante> mapa1 = new HashMap<String, Estudiante>();
		
		Set<Asignatura> asignaturas=new HashSet<Asignatura>();
		asignaturas.add(new Asignatura("Lengua"));
		asignaturas.add(new Asignatura("Matemáticas"));
		Estudiante e= new Estudiante("Nombre", "Apellidos", asignaturas);
		
		mapa1.put(e.getDni(), e);
		
		//Te devuelve el estudiante con un dni concreto.
		System.out.println(mapa1.get(e.getDni()));
		
		Set<Entry<String, Estudiante>> entrySet = mapa1.entrySet();
		for (Entry<String, Estudiante> entry : entrySet) {
			System.out.println("Clave: "+entry.getKey()+" Valor: "+entry.getValue());
		}
	}
}
