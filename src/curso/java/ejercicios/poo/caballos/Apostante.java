package curso.java.ejercicios.poo.caballos;

import curso.java.funciones.Utils;

public class Apostante {
	private String nombre;
	private int saldo;
	private Apuesta apuesta;

	public Apostante(String nombre, int saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public Apuesta apostar(Carrera carrera) {
		boolean correcto = true;
		int saldoApuesta=0;
		do {
			correcto=true;
			saldoApuesta = Integer.parseInt(Utils.pedirValor("¿Cuánto apuesta " + this.getNombre() + "? Saldo: "+this.saldo+"€"));
			if (saldoApuesta > saldo) {
				correcto = false;
				System.out.println("No puedes apostar más de lo que tienes.");
			}
			if(saldoApuesta <=0) {
				correcto=false;
				System.out.println("Debes introducir más de 1€.");
			}
		} while (!correcto);
		
		System.out.println("Dorsales: ");
		for (int i = 0; i < carrera.getCaballos().length; i++) {
			System.out.print(carrera.getCaballos()[i].getDorsal()+" ");
		}
		int dorsalCaballo;
		do {
			correcto=true;
		System.out.println();
		 dorsalCaballo = Integer.parseInt(
				Utils.pedirValor("Introduce la dorsal del caballo por el que quieres apostar " + saldoApuesta + " €"));
		 if(dorsalCaballo > carrera.getCaballos().length || dorsalCaballo <=0) {
			 correcto=false;
			 System.out.println("Por favor, introduce un número de dorsal válido.");
		 }
		}while(!correcto);
		Apuesta apuesta = new Apuesta(saldoApuesta, dorsalCaballo);
		this.saldo-=saldoApuesta;
		return apuesta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public Apuesta getApuesta() {
		return apuesta;
	}

	public void setApuesta(Apuesta apuesta) {
		this.apuesta = apuesta;
	}

}
