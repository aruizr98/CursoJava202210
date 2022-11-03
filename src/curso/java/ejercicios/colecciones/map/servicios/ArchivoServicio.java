package curso.java.ejercicios.colecciones.map.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import curso.java.ejercicios.colecciones.instituto.Asignatura;
import curso.java.ejercicios.colecciones.instituto.Estudiante;
import curso.java.ejercicios.colecciones.map.Colegio;

public class ArchivoServicio {
	public List<Estudiante> leerArchivoAlumnos(String nombre) {
		List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		FileReader fileReader;
		try {
			fileReader = new FileReader(archivo);
			BufferedReader reader = new BufferedReader(fileReader);

			String linea;
			while ((linea = reader.readLine()) != null) {
				String[] trozos = linea.split("\\|");
				String[] asignaturasFavoritas = trozos[3].split(";");
				Set<Asignatura> asignaturas = new HashSet<Asignatura>();
				for (String nombreAsignatura : asignaturasFavoritas) {
					asignaturas.add(new Asignatura(nombreAsignatura));
				}
				Estudiante aux = new Estudiante(trozos[0], trozos[1], asignaturas);
				listaEstudiantes.add(aux);
			}
			System.out.println("Archivo " + archivo.getName() + " leído.");
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de E/S.");
		}

		return listaEstudiantes;
	}

	public Map<Colegio, List<Estudiante>> leerArchivoAlumnosColegio(String nombre) {
		Map<Colegio, List<Estudiante>> colegios = new HashMap<Colegio, List<Estudiante>>();
		StringBuilder sb = new StringBuilder();
		File archivo = new File(nombre);
		FileReader fileReader;
		try {
			fileReader = new FileReader(archivo);
			BufferedReader reader = new BufferedReader(fileReader);
			Colegio c1 = new Colegio();
			Colegio c2 = new Colegio();
			Colegio c3 = new Colegio();
			List<Estudiante> estudiantes1 = new ArrayList<Estudiante>();
			List<Estudiante> estudiantes2 = new ArrayList<Estudiante>();
			List<Estudiante> estudiantes3 = new ArrayList<Estudiante>();
			String linea;

			while ((linea = reader.readLine()) != null) {
				String[] trozos = linea.split("\\|");
				String[] asignaturasFavoritas = trozos[4].split(";");
				Set<Asignatura> asignaturas = new HashSet<Asignatura>();

				for (String asignatura : asignaturasFavoritas) {
					asignaturas.add(new Asignatura(asignatura));
				}
				Colegio nuevoColegio = new Colegio(trozos[0]);

				if (nuevoColegio.getNombre().equals("Colegio1")) {
					estudiantes1.add(new Estudiante(trozos[1], trozos[2], trozos[3], asignaturas));
					c1.setNombre(nuevoColegio.getNombre());
					colegios.put(c1, estudiantes1);
				} else if (nuevoColegio.getNombre().equals("Colegio2")) {
					estudiantes2.add(new Estudiante(trozos[1], trozos[2], trozos[3], asignaturas));
					c2.setNombre(nuevoColegio.getNombre());
					colegios.put(c2, estudiantes2);

				} else if (nuevoColegio.getNombre().equals("Colegio3")) {
					estudiantes3.add(new Estudiante(trozos[1], trozos[2], trozos[3], asignaturas));
					c3.setNombre(nuevoColegio.getNombre());
					colegios.put(c3, estudiantes3);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado.");
		} catch (IOException e) {
			System.out.println("Error de E/S.");
		}
		return colegios;
	}
}
