package curso.java.ejercicios.poo.caballos;

import java.util.Arrays;

public class Hipodromo {
	private Caballo[] caballos;
	private Carrera carrera;
	private Apostante[] apostantes;
	public static void main(String[] args) {
//		Caballo[] caballos=new Caballo[3];
//		Carrera carrera=new Carrera("Carrera 1", 100, caballos);
		Hipodromo h = new Hipodromo();
		
//		Apostante a1=new Apostante("Alex", 1000);
//		Apostante a2=new Apostante("Juan", 2000);
//		a1.setApuesta(a1.apostar(carrera));
//		a2.setApuesta(a2.apostar(carrera));
//		Apostante[] apostantes= {a1, a2};
//		Caballo ganador=carrera.iniciarCarrera();
//		h.comprobarGanador(ganador, apostantes);
		
		h.crearJugadores();
		h.crearCaballos();
		h.comprobarGanador(h.abrirHipodromo(), h.getApostantes());
	}
	public Hipodromo() {

//		for (int i = 0; i < caballos.length; i++) {
//			caballos[i]=new Caballo();
//		}
		

	}
	private void crearJugadores() {
		apostantes=new Apostante[2];
		apostantes[0]=new Apostante("Jugador 1", 1000);
		apostantes[1]=new Apostante("Jugador 2", 2000);	
	}
	private void crearCaballos() {
		caballos=new Caballo[3];
		for (int i = 0; i < caballos.length; i++) {
			caballos[i]=new Caballo();
		}
	}
	private Caballo abrirHipodromo() {
		Carrera c = new Carrera("Carrera 1", 100, caballos);
		for (int i = 0; i < apostantes.length; i++) {
			apostantes[i].setApuesta(apostantes[i].apostar(c));
		}
		Caballo ganador=c.iniciarCarrera();
		return ganador;
	}
	
	public void comprobarGanador(Caballo caballoGanador, Apostante[] apostantes) {
		for (int i = 0; i < apostantes.length; i++) {
			if(apostantes[i].getApuesta().getCaballoApostado() == caballoGanador.getDorsal()) {
				System.out.println("Ganador: "+apostantes[i].getNombre());
				apostantes[i].setSaldo(apostantes[i].getSaldo()+apostantes[i].getApuesta().getCantidad());//Recupera el dinero que apostó
				for (int j = 0; j < apostantes.length; j++) {//Recibe cada cantidad apostada por cada jugador.
					if(j!=i) {
						apostantes[i].setSaldo(apostantes[i].getSaldo()+apostantes[j].getApuesta().getCantidad());
					}
				}
			}
			System.out.println("Saldo de "+apostantes[i].getNombre()+": "+apostantes[i].getSaldo()+" €.");
		}
	}
	public Apostante[] getApostantes() {
		return apostantes;
	}
	
}
