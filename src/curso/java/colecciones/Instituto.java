package curso.java.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import curso.java.ejercicios.colecciones.Estudiante;

public class Instituto {
	private List<Estudiante> estudiantes;
	public void abrirInstituto() {
		
		Set<Asignatura> asignaturas1=new HashSet<Asignatura>();
		asignaturas1.add(new Asignatura("Lengua"));
		asignaturas1.add(new Asignatura("Latín"));
		asignaturas1.add(new Asignatura("Griego"));
		Set<Asignatura> asignaturas2=new HashSet<Asignatura>();
		asignaturas2.add(new Asignatura("Matemáticas"));
		asignaturas2.add(new Asignatura("Física"));
		asignaturas2.add(new Asignatura("Química"));
		Set<Asignatura> asignaturas3=new HashSet<Asignatura>();
		asignaturas3.add(new Asignatura("Lengua"));
		asignaturas3.add(new Asignatura("Matemáticas"));
		Set<Asignatura> asignaturas4=new HashSet<Asignatura>();
		asignaturas4.add(new Asignatura("Lengua"));
		asignaturas4.add(new Asignatura("Latín"));
		Set<Asignatura> asignaturas5=new HashSet<Asignatura>();
		asignaturas5.add(new Asignatura("Matemáticas"));
		asignaturas5.add(new Asignatura("Física"));
		

		Estudiante e1=new Estudiante("Carlos", "García",asignaturas1);
		Estudiante e2=new Estudiante("Juan", "Robles",asignaturas2);
		Estudiante e3=new Estudiante("Sergio", "Rodriguez",asignaturas3);
		Estudiante e4=new Estudiante("Pablo", "Sánchez",asignaturas4);
		Estudiante e5=new Estudiante("Daniel", "López",asignaturas5);
		
		this.estudiantes=new ArrayList<Estudiante>();
		this.estudiantes.add(e1);
		this.estudiantes.add(e2);
		this.estudiantes.add(e3);
		this.estudiantes.add(e4);
		this.estudiantes.add(e5);	
	}
	public void mostrarEstudiantes() {
		System.out.println("Estudiantes:\n");
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getNombre()+" "+estudiante.getApellidos());
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				System.out.println(asignatura.getNombre()+": "+String.format("%.2f", asignatura.getNota()));
			}
			System.out.println();
		}
	}
	public void filtrarAlumnosPorAsignatura(String asignatura) {
		System.out.println("Estudiantes que cursan "+asignatura+":");
		for (Estudiante estudiante : estudiantes) {
			for (Asignatura a : estudiante.getAsignaturas()) {
				if(a.getNombre().equals(asignatura)) {
					System.out.println(estudiante.getNombre()+" "+estudiante.getApellidos());
				}
			}
		}
		System.out.println();
	}
	public void mostrarAprobados() {
		System.out.println("Alumnos que han aprobado el curso:");
		double media;
		for (Estudiante estudiante : estudiantes) {
			media=estudiante.calcularNotaMedia();
			if(media >=5) {
				System.out.println(estudiante.getNombre()+" "+estudiante.getApellidos()+". Nota media: "+String.format("%.2f", media));
			}
		}
		System.out.println();
	}
	public void eliminarEstudiantesSuspensos(String asignatura) {
		for (Iterator iterator = estudiantes.iterator(); iterator.hasNext();) {
			Estudiante estudiante = (Estudiante) iterator.next();
			for (Iterator iterator2 = estudiante.getAsignaturas().iterator(); iterator2.hasNext();) {
				Asignatura a = (Asignatura) iterator2.next();
				if(a.getNombre().equals(asignatura) && a.getNota() < 5) {
					System.out.println("El estudiante "+estudiante.getNombre()+" "+estudiante.getApellidos()+" ha sido eliminado porque ha suspendido "+asignatura+".");
					iterator.remove();
				}
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Instituto instituto = new Instituto();
		instituto.abrirInstituto();
		instituto.mostrarEstudiantes();
		instituto.filtrarAlumnosPorAsignatura("Matemáticas");
		instituto.mostrarAprobados();
		instituto.eliminarEstudiantesSuspensos("Lengua");
		instituto.mostrarEstudiantes();
	}
}
