package curso.java.ejercicios.poo;

import curso.java.ejercicios.poo.banda.Bateria;
import curso.java.ejercicios.poo.banda.Guitarra;
import curso.java.ejercicios.poo.banda.GuitarraElectrica;
import curso.java.ejercicios.poo.banda.Instrumento;
import curso.java.ejercicios.poo.banda.Piano;
import curso.java.ejercicios.poo.caballos.Apostante;
import curso.java.ejercicios.poo.caballos.Caballo;
import curso.java.ejercicios.poo.interfaces.IInsertable;
import curso.java.ejercicios.poo.interfaces.IUpdatable;

public class UsoInterfaces {
	public UsoInterfaces() {
		
	}
	public static void main(String[] args) {
		UsoInterfaces ui = new UsoInterfaces();
		Instrumento[] instrumentos= ui.crearBandaMusica();
		for (Instrumento instrumento : instrumentos) {
			ui.insertar(instrumento);
			//ui.actualizar(instrumento); No funciona porque Instrumento no implementa la interfaz IUpdatable, ni ninguna clase hija de IUpdatable.
		}
		Caballo c = new Caballo();
		ui.insertar(c);//Funciona porque Caballo implementa IUpdatable, que a su vez es hija de IInsertable
		Apostante a = new Apostante("", 0);
	//	ui.insertar(a); No funciona porque Apostante no implementa IInsertable
	}
	public Instrumento[] crearBandaMusica() {
		Guitarra guitarra= new Guitarra("Guitarra 1", "acústica",200.50, "Gibson", 6, "madera" );
		GuitarraElectrica guitarraElectrica = new GuitarraElectrica("Guitarra 2", "eléctrica",500.50, "Fender", 6, "acero", 5 );
		Bateria bateria= new Bateria("Batería 1", "acústica", 600.40, "Premier", 10, 3);
		Piano piano= new Piano("Piano 1", "electrónico", 500.50, "Korg", 6, 3 );
		Instrumento[] aux= {guitarra, guitarraElectrica, bateria, piano};
		return aux;
	}
	public void insertar(IInsertable objeto) {//
		objeto.guardar();
		//Nos aseguramos de que todos los objetos tengan el método guardar.
	}
	public void actualizar(IUpdatable objeto) {
		objeto.update(1);
	}
}
